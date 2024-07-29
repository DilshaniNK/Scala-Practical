object Question06 {
  var inventory01: Map[Int, (String, Int, Double)] = Map(
    101 -> ("Book", 15, 100.0),
    102 -> ("Pen", 20, 15.0),
    103 -> ("Pencil", 25, 12.0)
  )

  var inventory02: Map[Int, (String, Int, Double)] = Map(
    102 -> ("Pen", 10, 15.0),
    104 -> ("Eraser", 5, 50.0)
  )

  def retreiveProducts(inventory: Map[Int, (String, Int, Double)]): Unit = {
    println("--------------Inventory---------------")
    println("[ID]\t[Product]\t[Quantity]\t[price]")
    for ((id, (product, quantity, price)) <- inventory) {
      println(s"$id\t$product\t\t$quantity\t\t$price")
    }
  }

  def calculateTotalValue(inv: Map[Int, (String, Int, Double)]): Double = {
    var value: Double = 0.0
    for ((id, (product, quantity, price)) <- inv) {
      value = value + (quantity * price)
    }
    value
  }

  def isInventoryEmpty(inv: Map[Int, (String, Int, Double)]): Boolean = {
    inv.isEmpty
  }

  def mergeInventories(inv1: Map[Int, (String, Int, Double)], inv2: Map[Int, (String, Int, Double)]): Map[Int, (String, Int, Double)] = {
    var concatedInventory = scala.collection.mutable.Map[Int, (String, Int, Double)]()
    concatedInventory ++= inv1
    for ((id, (product, quantity, price)) <- inv2) {
      if (concatedInventory.contains(id)) {
        val (product1, quantity1, price1) = concatedInventory(id)
        concatedInventory(id) = (product, quantity + quantity1, price)
      } else {
        concatedInventory(id) = (product, quantity, price)
      }
    }
    concatedInventory.toMap
  }

  def checkProduct(specificID: Int, inv: Map[Int, (String, Int, Double)]): Boolean = {
    var isThere: Boolean = false
    for ((id, (product, quantity, price)) <- inv) {
      if (id == specificID) {
        isThere = true
      }
    }
    isThere
  }

  def main(args: Array[String]): Unit = {
    retreiveProducts(inventory01)
    retreiveProducts(inventory02)
    println("The total value of products: " + calculateTotalValue(inventory01))
    println("Is inventory 01 empty: " + isInventoryEmpty(inventory01))
    val mergedInventory = mergeInventories(inventory01, inventory02)
    println("Merged Inventory:")
    retreiveProducts(mergedInventory)
    println(s"\nIs product with ID 2 in inventory 1: ${checkProduct(2, inventory01)}")
  }
}
