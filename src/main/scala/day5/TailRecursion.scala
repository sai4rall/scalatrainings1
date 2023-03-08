package day5

import scala.annotation.tailrec

object TailRecursion {
  def main(args: Array[String]): Unit = {
    def reverseTail[A](inputList: List[A]): List[A] = {
      @tailrec
      def reverse(reversedList: List[A], remainingList: List[A]): List[A] = remainingList match {
        case Nil => reversedList
        case head :: tail => reverse(head :: reversedList, tail)
      }

      reverse(Nil, inputList)
    }
    var v:List[Int]=List(2,3,4,5,6,7,8,9)
    reverseTail(v)
  }
}
