package com.aierui.spark.conn

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Wc {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()

    // conf.set("param")

    val sc = new SparkContext(conf)

    val lines: RDD[String] = sc.textFile(args(0))
    // 切分压平
    val words: RDD[String] = lines.flatMap(_.split(" "))
    // 单次和一组合
    val wordAndOne: RDD[(String, Int)] = words.map((_, 1))

    // 按照 key 进行聚合
    val reduced: RDD[(String, Int)] = wordAndOne.reduceByKey(_ + _)
    // 排序
    val sorted: RDD[(String, Int)] = reduced.sortBy(_._2, false)

    // 保存
    sorted.saveAsTextFile(args(1))

    sc.stop()
  }
}
