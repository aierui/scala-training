package com.aierui.scala.collections

object Lists {

  def main(args: Array[String]): Unit = {

    // string element
    val site: List[String] = List("Weibo", "Google", "Baidu")

    // int element
    val nums: List[Int] = List(1, 2, 3, 4)

    // empty
    val empty: List[Nothing] = List()

    // 矩阵
    val dim: List[List[Int]] = List(
      List(1, 2, 3),
      List(4, 5, 6),
      List(7, 8, 9)
    )

    println("site Head : " + site.head)
    println("site Tail : " + site.tail)

    println("nums List is empty : " + nums.isEmpty)
    println("empty List is empty : " + empty.isEmpty)


    println("nums List length :" + nums.length)
    println("empty List length :" + empty.length)

    /*
      site Head : Weibo
      site Tail : List(Google, Baidu)
      nums List is empty : false
      empty List is empty : true
      nums List length :4
      empty List length :0
     */

  }

}
