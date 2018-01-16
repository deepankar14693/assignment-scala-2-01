package edu.knoldus

object RunLength extends App {
 def calculateRunLength(list: List[Int]): Tuple2[Int,Int] = {
  def check(list: List[Int],count:Int): Tuple2[Int,Int] = {
   list match {
    case x :: y :: tail if x == y => check(y :: tail,count + 1)
    case x :: y :: tail if x != y => {Tuple2(x,count + 1) ; check(y::tail,0)}
    case head :: Nil => Tuple2(head,count + 1)
   }
  }
  check(list,0)
 }
 val a=1
 val b=2
 val c=3
 val d=4
 print(calculateRunLength(List(a,a,a,b,b,a,c,c,d,d,d)) + "\n")
}
