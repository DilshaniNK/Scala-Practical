import  scala.io.StdIn._

object Numbers {
    def number(num: Double): String = {
        val st = num match{
            case x if x == 0 => "Zeor"
            case x if x < 0  => "negative"
            case x if x%2 == 0 => "even"
            case _             => "Odd"

        }

        st
    }

    def main(args: Array[String]): Unit ={
        println("Enter a number :")
        val num = readDouble();
        val string = number(num);
        println(s"This number is : ${string}")



    }


}