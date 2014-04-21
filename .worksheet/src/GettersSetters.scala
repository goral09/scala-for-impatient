object GettersSetters {
	class Counter {
		private var value: Int = 0
		def increment = value += 1
		def current = value
	};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(147); 
	
	val c1 = new Counter;System.out.println("""c1  : GettersSetters.Counter = """ + $show(c1 ));$skip(12); val res$0 = 
	c1.current;System.out.println("""res0: Int = """ + $show(res$0));$skip(14); 
	c1.increment;$skip(14); 
	c1.increment;$skip(12); val res$1 = 
	c1.current;System.out.println("""res1: Int = """ + $show(res$1))}
}
