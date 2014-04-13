object GettersSetters {
	class Counter {
		private var value: Int = 0
		def increment = value += 1
		def current = value
	}
	
	val c1 = new Counter                      //> c1  : GettersSetters.Counter = GettersSetters$Counter@7f6473
	c1.current                                //> res0: Int = 0
	c1.increment
	c1.increment
	c1.current                                //> res1: Int = 2
}