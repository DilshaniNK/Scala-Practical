import  scala.io.StdIn._

object LambdaFun{
    def calculateSquare(numbers : List[Int]): List[Int] ={
        numbers.map ( x => x* x)
    }

    def main(args : Array[String]): Unit ={
        println("Enter list of number :");
        val num = readLine().split("").map(_.toInt).toList
        println(" Square numbers of list :" + calculateSquare(num).mkString(", "))

    }
}