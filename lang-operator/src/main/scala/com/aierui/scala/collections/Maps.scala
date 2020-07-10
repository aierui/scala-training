package com.aierui.scala.collections

object Maps {

  def main(args: Array[String]): Unit = {

    //var A:Map[Char,Int] = Map()

    val colors = Map(
      "red" -> "#FF0000",
      "azure" -> "#F0FFFF",
    )

    println("color keys : " + colors.keys)
    println("color keys TypeName : " + colors.keys.getClass.getTypeName)
    println("color value : " + colors.values)
    println("color value SimpleName : " + colors.values.getClass.getSimpleName)
    println("color is empty : " + colors.isEmpty)

  }

}
