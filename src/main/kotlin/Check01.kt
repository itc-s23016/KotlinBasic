package org.example

fun main(args: Array<String>) {
    print("点数を入力してください:")
    val score = readLine()!!.toInt()
//    if (score <= 59)
//        println("D")
//    else if (score <= 69)
//        println("C")
//    else if (score <= 79)
//        println("B")
//    else if (score <= 89)
//        println("A")
//    else
//        println("S")

//    println("----パターン2----")
//    when {
//        (score <= 59)
//        -> println("D")
//
//        (score <= 69)
//        -> println("C")
//
//        (score <= 79)
//        -> println("B")
//
//        (score <= 89)
//        -> println("A")
//
//        else
//        -> println("S")
//    }

    println("----パターン3----")
    val rank3 = when (score) {
        !in 0..100 -> "エラー"
        in 0..< 60 -> "D"
        in 60..< 70 -> "C"
        in 70..< 80 -> "B"
        in 80..< 90 -> "A"
        else           -> "S"
    }
    println(rank3)
    //成績判定
    // 0 ~ 59 は D
    // 60 ~ 69 は C
    // 70 ~ 79 は B
    // 80 ~ 89 は A
    // 90 ~ 100 は S
    // それ以外は「エラー」と出力
}