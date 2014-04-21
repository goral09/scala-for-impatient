object Exercises {
	val s1 = SimpleItem(2.5, "Chleb")         //> s1  : SimpleItem = Chleb : 2.5
	val s2 = SimpleItem(1.5, "Cukier")        //> s2  : SimpleItem = Cukier : 1.5
	
	val bundle = new Bundle(List(s1,s2))      //> bundle  : Bundle = 
                                                  //| Chleb : 2.5
                                                  //| Cukier : 1.5
	
}
trait Item {
	def price: Double
	def description: String
	
	override def toString = description + " : " + price
}

object SimpleItem {
	def apply(price: Double, description: String): SimpleItem = new SimpleItem(price, description)
}

class Bundle(var items: List[Item]) {
	def price: Double = items.foldLeft(0d)((acc: Double, curr: Item) => acc + curr.price)
	def addItem(newItem: Item): Unit = items = newItem :: items
	
	override def toString: String = items.foldLeft("")((acc: String, curr: Item) => acc ++ s"\n${curr.toString}")
}