package com.aierui.scala.collections

import scala.collection.mutable.Set

object Sets {

  def main(args: Array[String]): Unit = {
    val set = Set(1, 2, 3)
    println(set.getClass.getName)

    println(set.exists(x => {
      x % 3 == 0
    }))

    println(set.drop(1))

    set.add(4)
    println(set)
    set.remove(4)
    println(set)

    println(set.head)
    println(set.tail)

  }
}
