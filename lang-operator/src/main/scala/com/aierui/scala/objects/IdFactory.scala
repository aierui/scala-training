package com.aierui.scala.objects

// 包名 不能为 class、object、trait 等关键字

object IdFactory {
  private var count = 0

  def create(): Int = {
    count += 1

    // 写法一：
    // count

    // 写法二：
    return count

    // 两种写法都可以正常运行，返回值是如何处理的？
    // 1. Scala中将最后出现的变量作为return的值。
    // 2. 使用return必须显式指定返回类型，使Scala失去推断返回值类型的能力。
  }
}


object Test {

  def main(args: Array[String]): Unit = {
    val newId1: Int = IdFactory.create()
    println(newId1)
    val newId2: Int = IdFactory.create()
    println(newId2)
  }

}



