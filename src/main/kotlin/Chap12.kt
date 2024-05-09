package org.example

fun main(args: Array<String>) {
    val x = "Hello"
    when (x) {
        "Good Morning" -> println("おはようございます")
        "Hello" -> println("こんにちは")
        "Good Evening" -> println("こんばんは")
        else -> println("どうも！")
    }
    println("----12.2----")
    val x2 = 4
    when (x2) {
        1,2 -> {
            println("ワン、ツーかのどちらかです")
            println("こんにちは")
        }
        3 -> {
            println("スリー")
            println("ありがとう!")
        }
        else -> {
            println("ワン、ツー、スリー以外の数字")
            println("さようなら！")
        }
    }

    println("----12.5----")
    val x5 = 2
    val message5 = when (x5) {
        1 -> "ワン"
        2 -> "ツー"
        3 -> "スリー"
        else -> "ワン、ツー、スリー以外の数字です"
    }
    println(message5)

    println("----12.8----")
    val x8 = 4
    when {
        (x8 == 1 || x8 == 2)
        -> println("ワンとツーのどちらか")

        (x8 == 3)
        -> println("スリー")

        else
        -> println("1、2、3以外の数字")
    }
}