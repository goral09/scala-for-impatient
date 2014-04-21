object ObjectPrivateFields {
	class Person private() {
		private var name: String = ""
		def comesBefore(other: Person) = name < other.name
		
		def this(name2: String) {
			this()
			name = name2
		}
	};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(233); 
	
	val p1 = new Person("ben");System.out.println("""p1  : ObjectPrivateFields.Person = """ + $show(p1 ));$skip(30); 
	val p2 = new Person("Alice");System.out.println("""p2  : ObjectPrivateFields.Person = """ + $show(p2 ));$skip(22); val res$0 = 
	
	p1.comesBefore(p2);System.out.println("""res0: Boolean = """ + $show(res$0))}
}
