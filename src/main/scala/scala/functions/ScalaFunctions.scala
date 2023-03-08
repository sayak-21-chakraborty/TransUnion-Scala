package scala.functions


object ScalaFunctions {

  //Function in an Object
  object Math {

    def add(x: Int, y: Int): Int = {
      //return x+y
      x + y;
    }

    def square(x : Int) = x*x;

    //Function with default parameter value
    def sumSquareCube(x : Int = 10, y: Int = 5) :  Int = {
      (x*x)+(y*y*y);
    }
  }

  //Function with no return
  private def helloScala() : Unit = println("Hello World! from Scala Application");

  //Anonymous functions in Scala
  var add = (x : Int, y : Int) => x+y;
  println(add(100,1000));

  //Functions with a single operation
  private def subtract(x: Int, y: Int): Int = x - y;

  private def multiply(x: Int, y: Int): Int = x * y;

  private def divide(x: Float, y: Float): Float = x / y;

  def main(args: Array[String]) : Unit = {
    val addResult = Math.add(10, 20);
    println(s"Sum is : $addResult");

    println(Math square 3);

    println(Math.sumSquareCube(5, 2));

    val subsResult = subtract(10, 6);
    println(s"Difference is : $subsResult");

    val mulResult = multiply(10 , 20);
    println(s"Multiplication is : $mulResult")

    val divResult = divide(30, 9);
    println(s"Division is : $divResult");

    println(helloScala());
  }
}
