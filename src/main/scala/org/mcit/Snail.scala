package org.mcit

object array extends App{

  var list = List(List(1,2,3), List (4,5,6), List(7,8,9))
val a = list.slice(0,3)
  val b = list.slice(5,6)
  val c = list.slice(6,9).reverse
  val d = list.slice(3,5)
   println(a++b++c++d)
}
