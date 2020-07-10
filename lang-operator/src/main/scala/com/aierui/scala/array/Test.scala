package com.aierui.scala.array

object Test {

  def main(args: Array[String]): Unit = {

    var arrList = Array(1, 9, 2, 2.5, 3.9, 5)
    for (x <- arrList) {
      println(x)
    }

    var total = 0.0
    // 如何获取一个变量的类型？
    //获取一个数据或者对象的类型只需要在该对象后面添加 .getClass.getSimpleName

    for (i <- 0 to (arrList.length - 1)) {
      total += arrList(i)
    }

    println("总和为 " + total);

    // 查找数组中的最大元素
    var max = arrList(0);
    for (i <- 1 to (arrList.length - 1)) {
      if (arrList(i) > max) max = arrList(i);
    }
    println("最大值为 " + max);
  }
}
