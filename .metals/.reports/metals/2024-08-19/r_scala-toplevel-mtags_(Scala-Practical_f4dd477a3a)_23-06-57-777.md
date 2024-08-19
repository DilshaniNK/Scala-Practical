error id: file:///C:/Users/Dilsh/OneDrive/Documents/GitHub/Scala-Practical/Labsession09/Question02.scala:[35..36) in Input.VirtualFile("file:///C:/Users/Dilsh/OneDrive/Documents/GitHub/Scala-Practical/Labsession09/Question02.scala", "import scala.io.StdIn._

object  {
    def number(num: Double): String = {
        val st = num match{
            case x if x == 0 => "Zeor"
            case x if x < 0  => "nagative"
            case x if x%2 == 0 => "even"
            case _             => "Odd"

        }

        st
    }

    def main(args: Array[String]): Unit ={
        println("Enter a number :")
        val num = readDouble();


    }


}")
file:///C:/Users/Dilsh/OneDrive/Documents/GitHub/Scala-Practical/Labsession09/Question02.scala
file:///C:/Users/Dilsh/OneDrive/Documents/GitHub/Scala-Practical/Labsession09/Question02.scala:3: error: expected identifier; obtained lbrace
object  {
        ^
#### Short summary: 

expected identifier; obtained lbrace