object ObjectPrivateFields {
	class Person private() {
		private var name: String = ""
		def comesBefore(other: Person) = name < other.name
		
		def this(name2: String) {
			this()
			name = name2
		}
	}
	
	val p1 = new Person("ben")                //> p1  : ObjectPrivateFields.Person = ObjectPrivateFields$Person@7f6473
	val p2 = new Person("Alice")              //> p2  : ObjectPrivateFields.Person = ObjectPrivateFields$Person@1f97b55
	
	p1.comesBefore(p2)                        //> res0: Boolean = false
}