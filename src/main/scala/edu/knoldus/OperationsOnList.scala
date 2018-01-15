package edu.knoldus

class OperationsOnList {
 def rotateList(list: List[Char], index: Int): List[Char] = {
  list match {
   case x :: tail if (index != 0) => rotateList(tail :+ x, index - 1)
   case _ => list
  }
 }

 def eliminateDuplicates(list: List[Char]): List[Char] = {
  def check(list: List[Char], empty: List[Char]): List[Char] = {
   list match {
    case x :: y :: tail if (x == y) => check(y :: tail, empty)
    case x :: y :: tail if (x != y) => check(y :: tail, empty :+ x)
    case x :: y :: Nil if (x != y) => check(List() :+ y, empty :+ x)
    case x :: Nil => empty :+ x
    case _ => empty
   }
  }

  check(list, List())
 }
}

 /*def calculateHappySad(list:List[Int]) : List[Int] = {
  list match{
   case x :: tail => check(x)
   case x :: Nil => check(x)
   case _ => list
  }
  def check(input:Int):List[Int] = {

  }*/

