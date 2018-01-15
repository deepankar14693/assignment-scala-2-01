package edu.knoldus

object PerformOperationsOnList extends App {
 val operate=new OperationsOnList
 val index=3
 val listing = ('a' to 'g').toList
 val listing1:List[Char] = List('b','b','b','c','c','a','a','d','e','e','e','e','a','a','a','a')
//val listing:List[Char]=List('a','b','c,'d','e','f','g')
print(operate.rotateList(listing, index) + "\n")
 print(operate.eliminateDuplicates(listing1) + "\n")
}

