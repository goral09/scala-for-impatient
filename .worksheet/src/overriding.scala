object overriding {
	class Creature {
		val range: Int = 10
		val env = new Array[Int](range)
		override def toString = s"This is ${this.getClass().getName().substring(11)}, has range of ${range}"
	}
	
	class Ant extends {
	override val range: Int = 2
	} with Creature {
	};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(295); 
	
	val ant1 = new Ant;System.out.println("""ant1  : overriding.Ant = """ + $show(ant1 ));$skip(30); 
	val creature1 = new Creature;System.out.println("""creature1  : overriding.Creature = """ + $show(creature1 ))}

}
