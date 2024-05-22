package org.example.chap31

import java.awt.Color

fun main(args: Array<String>) {
    run {
        println("----31.5----")
        val person = FlyingPerson("タケシ", 5)
        val car = FlyingCar("赤")
        makeItFly(person)
        makeItFly(car)


    }
}

fun makeItFly(a: Flyable) {
    a.fry()
}

interface Flyable {
    fun fry() {
        println("未確認飛行物体です！")
    }
}

open class Person(val name: String, val age: Int)

class FlyingPerson(name: String, age: Int) : Person(name, age), Flyable {
  /*  override fun fry() {
        println("まさか！人間が空を飛んでいます。")
    }*/
}

abstract class Car(val color: String)

class FlyingCar(color: String) : Car(color), Flyable {
   /* override fun fry() {
        println("すごい！車が空を飛んでいます。")
    }*/

}