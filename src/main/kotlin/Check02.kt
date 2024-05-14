package org.example

import kotlin.random.Random

fun main(args: Array<String>) {
    print("1:グー 2:チョキ 3:パー を選んでください: ")
    // 入力は1,2,3　ですが、0,1,2　となるよ工夫してください↓
    val player = readln().toInt()-1
    print("あなたのが選んだのは: ")
    when (player) {
        0 -> println("グー")
        1 -> println("チョキ")
        2 -> println("パー")
    }

    //CPUの手をランダムで決める
    val cpu = Random.nextInt(0,3) // 0,1,2のどれかになる
    print("相手がえらんだのは選んだのは: ")
    when (cpu) {
        0 -> println("グー")
        1 -> println("チョキ")
        2 -> println("パー")
    }

//    when {
//        ((player == 0 && cpu == 1) || (player == 1 && cpu == 2) || (player == 2 && cpu == 0))
//        -> println("勝ち")
//
//        (player == cpu)
//        -> println("あいこ")
//
//        ((player == 0 && cpu == 2) || (player == 1 && cpu == 0) || (player == 2 && cpu == 1))
//        -> println("負け")
//    }

    //方法２

    val diff = (player - cpu + 3) % 3
    val judge = when (diff) {
        0 -> "あいこ"
        1 -> "負け"
        2 -> "勝ち"
        else -> "?"
    }
println(judge)
    //勝敗判定

    //勝敗の結果表示
    //勝ち
    //負け
    //あいこ
}
