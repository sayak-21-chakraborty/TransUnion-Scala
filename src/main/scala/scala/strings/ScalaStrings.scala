package scala.strings

object ScalaStrings {
  val str1 : String = "Sayak Chakraborty"
  val str2 = " is my name"

  val num1 = 10
  val num2 = 75.0
  val str3 = "Sayak"

  def main(args: Array[String]): Unit = {
      println(str1.length())
      println(str1.concat(str2))

      // String formatting
      val result = printf("%d -- %f -- %s", num1, num2, str3)
      println(result)

      println("%d --- %f --- %s".format(num1, num2, str3))
  }

}
