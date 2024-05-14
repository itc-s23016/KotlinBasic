package org.example

import kotlin.random.Random
import kotlin.random.nextInt

fun main(args: Array<String>) {
    //勝ちが１割、負けが8.5割、あいこが0.5割となる
    // CPUを実装したじゃんけんを作ってください

    print("試行回数?: ")
    val count = readln().toInt()

    var win = 0
    var lose = 0
    var draw = 0

    for (i in 0..<count) {
        val player = Random.nextInt(1..3)
        print("1:グー 2:チョキ 3:パー を選んでください: $player")


        //乱数で勝敗を決める
        val (result, judge) = when (Random.nextInt(0, 100)) {
            in 0..<10 -> {
                win++
                Pair(1, "かち")
            }
            in 10..<15 -> {
                draw++
                Pair(0, "あいこ")
            }
            else -> {
                lose++
                Pair(2, "まけ")
            }
        }

        // CPUの手を罫線で決める
        val cpu = (player + result) % 3


//        val judge = when (result) {
//            0 -> "あいこ"
//            1 -> "勝ち"
//            else -> "負け"
//        }

        println("CPU: ${cpu + 1} --- $judge")
    }
    println("確率の結果")
    println("かち: $win (${win / count.toDouble() * 100}%)")
    println("まけ: $lose (${lose / count.toDouble() * 100}%)")
    println("あいこ: $draw (${draw / count.toDouble() * 100}%)")
}