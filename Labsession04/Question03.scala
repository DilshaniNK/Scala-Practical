object TextFormat {
  def toUpper(name: String): String = {
    name.toUpperCase()
  }

  def toLower(name: String): String = {
    name.toLowerCase()
  }

  def formatNames(name: String, formatFunc: String => String): String = {
    formatFunc(name)
  }

  def main(args: Array[String]): Unit = {
    var name1="Benny"
    println(formatNames(name1 , toUpper))
    var name2="Niroshan"
    println((formatNames(name2.substring(0,2),toUpper))+formatNames(name2.substring(2),toLower))
    var name3="Saman"
    println((formatNames(name3,toLower)))
    var name4="kumara"
    println((formatNames(name4.substring(0,1),toUpper))+formatNames(name4.substring(1,5),toLower)+formatNames(name4.substring(5),toUpper))
  }
}
