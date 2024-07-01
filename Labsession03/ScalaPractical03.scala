//Question 01
def reversString(s:String):String={
    if(s.isEmpty())
        ""
    else
        reversString(s.tail)+s.head
}

//Question 02
def StringLength(st: List[String]):List[String]={
    st.filter(_.length() > 5)
}

//Question 03
def Avarage(num1:Int,num2:Int):Double={
    var n=(num1+num2)/2.0
    BigDecimal(n).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
}

//Question 04
def iseven(num:Int):Boolean={

    if(num % 2 ==0)
        return true
    else
        return false
}
def addingevennumber(number: List[Int]):Int={
    var list=number.filter(iseven(_))
    list.sum
}