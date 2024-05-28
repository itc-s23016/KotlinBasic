package jp.ac_college.std.s23016.kotlinbasic

import jp.ac_college.std.s23016.kotlinbasic.cars.Car

fun main(args: Array<String>) {
    val c1 = Car("赤")
    val c2 = Car("青")
    c1.drive()
    c2.drive()
}