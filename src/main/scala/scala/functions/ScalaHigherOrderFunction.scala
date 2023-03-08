package scala.functions

//Higher order functions are those which take function as an input and also return function as an output
object ScalaHigherOrderFunction {

  def math(x: Double, y: Double, f: (Double, Double) => Double) : Double = f(x,y);

  def main(args: Array[String]) : Unit = {
    val result = math(50, 20, (x,y) => x+y);
    println(result);
  }
}
