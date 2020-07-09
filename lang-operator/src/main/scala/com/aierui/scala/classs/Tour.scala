package com.aierui.scala.classs

class Tour(prefix: String, suffix: String) {
  def greet(name: String): Unit = {
    println(prefix + name + suffix)
  }
}


object Tour {

  def main(args: Array[String]): Unit = {
    val tour = new Tour("Hello,", "!")
    tour.greet("aierui")
  }

  val point1 = Point(1, 2)
  val point2 = Point(2, 3)
  val point3 = Point(3, 4)
  val point4 = Point(4, 5)

  if (point1 == point2) {
    println(point1 + " and " + point2 + " are the same")
  } else {
    println(point1 + " and " + point2 + " are the different")
  }

  if (point1 == point3) {
    println(point1 + " and " + point3 + " are the same")
  } else {
    println(point1 + " and " + point3 + " are the different")
  }

  // 这里顺序为什么？
  /*
    Point(1,2) and Point(2,3) are the different
    Point(1,2) and Point(3,4) are the different
    Hello,aierui!

    // 原因？

   */
}


case class Point(x: Int, y: Int)
