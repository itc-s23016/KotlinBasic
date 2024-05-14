package org.example

fun main(args: Array<String>) {
    print(" ")
        for (i in 9 downTo 1) {
            print(" ${i}")
        }
    println()
    for (v in 1.. 9) {
        print("$v ")
        for (i in 9 downTo 1) {
            print("${v * i} ")
        }
        println()
    }
}