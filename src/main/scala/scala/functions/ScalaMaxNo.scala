package scala.functions

object ScalaMaxNo {
  object Math{
    def max(x: Double, y: Double, z: Double, f: (Double, Double) => Double) : Double = f(f(x,y), z);
  }

  def main(args: Array[String]) : Unit = {
    val result: Double = Math.max(10, 5, 8, (x,y) => x max y );  // x max y is same as x.max(y)
    // more simple way to write the above statement is below

    val res = Math.max(10, 15, 12, _ max _);  // _+_ is equivalent to [[[(x,y) => x max y]]] // _ is called as the wild card
    println(res);
  }
}
