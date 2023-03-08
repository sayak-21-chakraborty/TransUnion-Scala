package scala.Arrays

import Array._

object ScalaArrays {
  val myArray: Array[Int] = new Array[Int](4)
  val myArray2 = new Array[Int](5)
  val myArray3 = Array(1, 2, 3, 4, 6, 8, 7, 8)

  def main(args: Array[String]): Unit = {
    myArray(0) = 20
    myArray(1) = 30
    myArray(2) = 40
    myArray(3) = 60

    //Printing elements of the array
    for(x <- myArray)
      println(x)

    for(i <- 1 to myArray.length - 1)
      println(myArray(i))

    myArray.foreach(i => println(i))

    myArray.foreach(println)

    val result = concat(myArray, myArray3)
    println("--")
    result.foreach(println)
  }

}
