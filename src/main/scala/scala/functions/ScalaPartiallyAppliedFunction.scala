package scala.functions

import java.util.Date

object ScalaPartiallyAppliedFunction {

  def log(date: Date, message: String) = {
    println(date + "     " + message);
  }

  def main(args: Array[String]): Unit = {
    val sum = (a: Int, b: Int, c: Int) => a + b + c;

    //partially applied function
    val f = sum(10, _:Int, _:Int);
    println(f(100, 200));

    val date = new Date;
    val newLog = log(date, _:String);

    newLog("The message is 1");
    newLog("The message is 2");
    newLog("The message is 3");
    newLog("The message is 4");
    newLog("The message is 5");


  }

}
