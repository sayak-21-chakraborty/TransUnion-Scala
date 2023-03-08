package scala.strings

object ScalaStrings {
  val str1 : String = "Sayak Chakraborty"
  val str2 = " is my name"

  def main(args: Array[String]): Unit = {
      println(str1.length())
      println(str1.concat(str2))
  }

}
