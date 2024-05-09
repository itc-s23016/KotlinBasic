package org.example

fun main(args: Array<String>) {
    val score = readLine()!!.toInt()
    if (score <= 59)
        println("D")
    else if (score <= 69)
        println("C")
    else if (score <= 79)
        println("B")
    else if (score <= 89)
        println("A")
    else
        println("S")

    //成績判定
    // 0 ~ 59 は D
    // 60 ~ 69 は C
    // 70 ~ 79 は B
    // 80 ~ 89 は A
    // 90 ~ 100 は S
    // それ以外は「エラー」と出力
}