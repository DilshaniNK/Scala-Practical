import  scala.io.StdIn.readLine

object InventoryManagementSystem{
    //Function to get the product list from user input
    def getProductList():List[String]={
        var products :List[String]=List()
        var product: String=""
        var i=1;
        product = readLine(s"Enter product 1 : ")
        while(!(product == "done")){
            products = products :+product
            product=readLine(s"Enter product  ${i+1}: ")
            i +=1
        }
        products
    }
    def printProductList(list: List[String]) : Unit={
        println("-------------------Product List ----------------------")
        var i=1
        for(product <- list){
            println(s"$i : $product")
            i+=1
        }
    }
    def getTotalproducts(list : List[String]):Unit={
        println(s"the number of total elements : ${list.length}")
        
    }

    def main(args: Array[String]):Unit={
        println("-----------------------Product List-------------------------")
        var list1 =getProductList()
        printProductList(list1)
        println()
        getTotalproducts(list1)
    }
}


