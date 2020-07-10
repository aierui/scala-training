package com.aierui.scala.classs

class Graph {

  class Node {
    var connectedNodes: List[Node] = Nil

    // void
    def connectTo(node: Node): Unit = {
      //      if (!connectedNodes.exists(node.equals())) {
      //        connectedNodes = node :: connectedNodes
      //      }
    }

    var nodes: List[Node] = Nil

    def newNode: Node = {
      val res = new Node

      nodes = res :: nodes

      res
    }
  }

}
