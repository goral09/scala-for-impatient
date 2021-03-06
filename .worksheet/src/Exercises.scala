object Exercises {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(53); 
	val s1 = SimpleItem(2.5, "Chleb");System.out.println("""s1  : SimpleItem = """ + $show(s1 ));$skip(36); 
	val s2 = SimpleItem(1.5, "Cukier");System.out.println("""s2  : SimpleItem = """ + $show(s2 ));$skip(40); 
	
	val bundle = new Bundle(List(s1,s2));System.out.println("""bundle  : Bundle = """ + $show(bundle ))}
	
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
