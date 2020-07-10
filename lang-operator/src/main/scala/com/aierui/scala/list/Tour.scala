package com.aierui.scala.list

object Tour {

  def main(args: Array[String]): Unit = {
    val list: List[Any] = List(
      "a string",
      1121,
      "c",
      'a',
      true,
      () => "an anonymous function return a string",
      "like it",
    )

    list.foreach(element => println(element))
  }
}
