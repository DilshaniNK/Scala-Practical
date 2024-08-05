import  scala.io.StdIn._

object LMBfuc{
    def filterPrime(numbers : List[Int]): List[Int] ={
        numbers.filter(condition)
    }
    def condition (n : Int): Boolean ={
            if (n <= 1)
                false
            else if(n == 2)
                true
            else 
                !(2 until n).exists(i => n % i == 0)

    }

    def main(args :Array[String]):Unit={
        println("Enter number list ");
        val num = readLine().split("").map(_.toInt).toList
        println(" Prime number list :" + filterPrime(num).mkString(", "))
    }
        
}