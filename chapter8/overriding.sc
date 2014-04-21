object overriding {
	class Creature {
		val range: Int = 10
		val env = new Array[Int](range)
		override def toString = s"This is ${this.getClass().getName().substring(11)}, has range of ${range}"
	}
	
	class Ant extends {
	override val range: Int = 2
	} with Creature {
	}
	
	val ant1 = new Ant                        //> ant1  : overriding.Ant = This is Ant, has range of 2
	val creature1 = new Creature              //> creature1  : overriding.Creature = This is Creature, has range of 10

}