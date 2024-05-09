package org.example

fun main(args: Array<String>) {
    val delicious = true
    val cheep = false
    println("このレストランはおいしい:$delicious")
    println("このレストランは安い:$cheep")
    println("----7.2----")
    val delicious2 = true
    val cheep2 = true
    val letsEat2 = (delicious2 && cheep2)
    println("食事する？:$letsEat2")
    println("----7.3----")
    val delicious3 = true
    val cheep3 = false
    val letsEat3 = delicious3 && cheep3
    println("食事する？:$letsEat3")
    println("----7.4----")
    val delicious4 = false
    val cheep4 = true
    val letsEat4 = delicious4 && cheep4
    println("食事する？:$letsEat4")
    println("----7.5----")
    val delicious5 = false
    val cheep5 = false
    val letsEat5 = delicious5 && cheep5
    println("食事する？:$letsEat5")
    println("----7.6----")
    val delicious6 = true
    val cheep6 = true
    val letsEat6 = delicious6 || cheep6
    println("食事する？:$letsEat6")
    println("----7.7----")
    val delicious7 = true
    val cheep7 = false
    val letsEat7 = (delicious7 || cheep7)
    println("食事する？:$letsEat7")
    println("----7.8----")
    val delicious8 = false
    val cheep8 = true
    val letsEat8 = delicious8 || cheep8
    println("食事する？:$letsEat8")
    println("----7.9----")
    val delicious9 = false
    val cheep9 = false
    val letsEat9 = delicious9 || cheep9
    println("食事する？:$letsEat9")
    println("----7.10----")
    val x10 = 75
    val a10 = (x10 >= 50 && x10 <= 100)
    val b10 = (x10 < 50 || x10 > 100)
    println("変数 x10 が50から100までの範囲内にある: $a10")
    println("変数 x10 が50から100までの範囲外にある: $b10")
    println("----7.12----")
    val a12 = true
    val b12 = !a12
    val c12 = !b12
    println("a12の値は $a12 です。")
    println("b12の値は $b12 です。")
    println("c12の値は $c12 です。")
}