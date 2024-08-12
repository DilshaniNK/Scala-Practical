import scala.io.StdIn._


object question8_2{
    def main(args: Array[String]): Unit ={
        val multifyof3 : Int => Boolean = (x: Int)=>x % 3 == 0
        val multifyof5 : Int => Boolean = (x:Int) =>x % 5==0
        println("Enter your name :")
        val number = readInt()
        val result = (multifyof3(number),multifyof5(number))match{
            case(true,true) => "Multipleof both Three and five"
            case(true,false) => "Multiple of Three" 
            case(false,true)=>"Multiple og five"
            case(false,false)=>"Not a Multigle of three of five"
        }

        println(result)
    }
}