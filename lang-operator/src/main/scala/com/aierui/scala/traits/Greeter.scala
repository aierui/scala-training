package com.aierui.scala.traits

trait Greeter {
  def greet(name: String): Unit

  def greetDefault(name: String): Unit = {
    println("Hello, " + name + "!")
  }
}


//class DefaultGreeter extends Greeter {
//  override def greet(name: String): Unit = ???
//}

class CustomizableGreeter(prefix: String, postfix: String) extends Greeter {
  override def greet(name: String): Unit = {
    println(prefix + name + postfix)
  }
}

object Test {
  def main(args: Array[String]): Unit = {
    val customGreeter = new CustomizableGreeter("How are you, ", "?")
    customGreeter.greet("aierui")
  }
}