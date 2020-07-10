package com.aierui.scala.func

object Nest {
  def factorial(x: Int): Int = {
    def fact(x: Int, accumulator: Int): Int = {
      if (x <= 1) {
        accumulator
      } else {
        fact(x - 1, x * accumulator)
      }
    }

    fact(x, 1)
  }
}

object Test {
  def main(args: Array[String]): Unit = {
    println("Factorial of 2: " + Nest.factorial(2))
    println("Factorial of 3: " + Nest.factorial(3))
  }
}