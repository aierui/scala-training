package com.aierui.scala.variable

// class object
// 嵌套问题？

class A(n: Int) {
  var value = n
}

class B(n: Int) {
  val value = new A(n)
}

object Test {

  // 注解将元信息与定义相关联。 例如，方法之前的注解 @deprecated 会导致编译器在该方法被使用时打印警告信息。
  @deprecated("deprecation message", "release # which deprecates method")
  def oldData = "oldData"

  def main(args: Array[String]): Unit = {
    val x = new B(5)
    //    x = new B(6) //Doesn't work, because I can't replace the object created on the line above with this new one.
    //    x.value = new A(7) // Doesn't work, because I can't replace the object assigned to B.value for a new one.
    x.value.value = 6 // // Works, because A.value can receive a new object.

    println(x)
    //获取一个数据或者对象的类型只需要在该对象后面添加 .getClass.getSimpleName
    println(x.getClass.getSimpleName)

    // 如何打印出一个对象
    print(x.toString)

    println(oldData)
  }
}
