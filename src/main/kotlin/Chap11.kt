package org.example

fun main(args: Array<String>) {
    val a = 5
    val b = 5

    if (a < b) {
        println("aの方がbより小さいです")
    }else if (a > b) {
        println("aの方がbより大きいです")
    } else {
        println("aとbの値は同じです。")
    }

    println("----11.9----")
    val age = 16
//    var message = ""
    val message = if (age in 13..15) {
//        println("中学生です。")
//        message = "中学生です。"
        println("1番目の条件の処理が行われました。")
        "中学生です。"
    } else {
//        println("中学生ではありません。")
//        message = "中学生ではありません。"
        println("2番目の条件の処理が行われました。")
        "中学生ではありません。"
    }
    println(message)
}