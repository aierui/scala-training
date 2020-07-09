package com.aierui.scala.func

object Add {

  def main(args: Array[String]): Unit = {
    println("addInt function result : " + addInt(1, 2))
  }

  def addInt(a: Int, b: Int): Int = {
    var sum: Int = 0
    sum = a + b

    return sum
  }
}
