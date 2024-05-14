package org.example

import kotlin.random.Random
import kotlin.random.nextInt

fun main(args: Array<String>) {
//    println("----14.e1----")
//    while (Random.nextInt(0..<100) >= 10) {
//        println("10以上の数が生成されました。")
//    }
//    println("終わり")
    println("----14.e2----")

    do {
        val rand = Random.nextInt(0..<100)
        println("生成された数は $rand です。")
    } while (rand >= 10)
    println("10未満の数が生成されたので終わり")
}