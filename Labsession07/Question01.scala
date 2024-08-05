
import  scala.io.StdIn._

object  LambdaFuntion{

def filterEvenNumber(number: List[Int]): List[Int] = {
    number.filter(num => num % 2 == 0)
}
def main(args : Array[String]): Unit = {
    println("Enter the number list :")
    val number = readLine()
    val input = number.split("").map(_.toInt).toList
    println("List of Even number : "+ filterEvenNumber(input).mkString(", "))
}

}


