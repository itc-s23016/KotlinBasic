package org.example

import kotlin.random.Random

fun main(args: Array<String>) {
    //勝ちが１割、負けが8.5割、あいこが0.5割となる
    // CPUを実装したじゃんけんを作ってください

    print("1:グー 2:チョキ 3:パー を選んでください: ")
    val player = readln().toInt() - 1

    //乱数で勝敗を決める
    val result = when (Random.nextInt(0,100)) {
        in 0..<10 -> 1      //勝ち
        in 10..<15 -> 0     //あいこ
        else -> 2              //負け
    }

    // CPUの手を罫線で決める
    val cpu = (player + result) % 3

    val judge = when (result) {
        0 -> "あいこ"
        1 -> "勝ち"
        else -> "負け"
    }

    println("CPU: ${cpu + 1} --- $judge")
}