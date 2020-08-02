package com.aierui.scala.func

object Add {
  var m: Int = 0

  def main(args: Array[String]): Unit = {
    println("addInt function result : " + addInt(1, 2))
    println("incInt1 function result : " + incInt())
    println("incInt2 function result : " + incInt())
  }

  def addInt(a: Int, b: Int): Int = {
    var sum: Int = 0
    sum = a + b

    return sum
  }

  def incInt(): Int = {
    m += 1
    m
  }
}
