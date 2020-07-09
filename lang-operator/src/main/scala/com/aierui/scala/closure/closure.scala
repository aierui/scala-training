package com.aierui.scala.closure

object closure {

  def main(args: Array[String]): Unit = {
    println("multiplier(1) value = " + multiplier(1))
    println("multiplier(2) value = " + multiplier(2))
  }

  // var 声明变量
  // val 声明常量 常量是不能修改的，程序尝试修改则编译时报错
  var factor = 3
  //val multiplier = (i: Int) => i * factor
  val multiplier: Int => Int = (i: Int) => i * factor

  // 在 scala 中，声明变量和常量不一定要指明数据类型，
  // 在没有指明数据类型的情况下，其数据类型通过变量或常量的初始值推断出来


  // 匿名函数
  // => 左边是参数列表，右边是一个包含参数的表达式
  (x: Int) => x + 1

  // 函数和方法的差异
  // 方法的表现和行为和函数非常类似，但是它们之间有一些关键的差别。
  // 方法由 def 关键字定义。def 后面跟着一个名字、参数列表、返回类型和方法体。

}
