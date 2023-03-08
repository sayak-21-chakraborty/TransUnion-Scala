package scala.Lists

object ScalaLists {
  //Unlike array scala lists are immutable

  val myList: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  val myList2: List[String] = List("Sayak", "Sanjoy", "Sanchita")
  def main(args: Array[String]): Unit = {
    println(myList.head)

    //prepend in a list
    println(0::myList)
    println(1 :: 2 :: 3 :: 4 :: Nil)

    //Scala List Methods
    println(myList.isEmpty)
    println(myList.reverse)

    //Iterating over the list
    myList.foreach(println)

    //Add all elements of the Int list
    var sum: Int = 0
    myList.foreach(sum += _)
    println(sum)

    //list iteration using for loop
    for(name <- myList2)
      println(name)

  }

}
