object Exercises {
  //1
	def signum(n: Int) = n match {
		case n if n < 0 => -1
		case n if n == 0 => 0
		case _ => 1
	}                                         //> signum: (n: Int)Int
	
	
	signum(-10)                               //> res0: Int = -1
	signum(0)                                 //> res1: Int = 0
	signum(10)                                //> res2: Int = 1
	//2
	var x2 = {}                               //> x2  : Unit = ()
	
	//3
	var y = 3                                 //> y  : Int = 3
	var x: Unit = y = 1                       //> x  : Unit = ()
	
	//4
	for(i <- 0 to 10) println(10 - i)         //> 10
                                                  //| 9
                                                  //| 8
                                                  //| 7
                                                  //| 6
                                                  //| 5
                                                  //| 4
                                                  //| 3
                                                  //| 2
                                                  //| 1
                                                  //| 0
  //5
  def countdown(n: Int) = for(i <- 0 to n) println(n - i)
                                                  //> countdown: (n: Int)Unit
  
  countdown(3)                                    //> 3
                                                  //| 2
                                                  //| 1
                                                  //| 0
  //6
  def uniProduct(str: String):Int = {
  	var product = 1
  	for(i <- 0 to (str.length - 1))
  		product *= str.charAt(i)
  	product
  }                                               //> uniProduct: (str: String)Int
  
  uniProduct("Hello")                             //> res3: Int = 825152896
  //7
  "Hello".foldLeft(1)((acc, curr) => acc * curr.toInt)
                                                  //> res4: Int = 825152896
   //9
  def uniProductRec(str: String): Int = {
  	def helper(acc: Int, strLeft: String): Int = strLeft match {
  		case strLeft if strLeft.length() == 0 => acc
  		case _ => helper(acc * strLeft.head.toInt, strLeft.tail)
  	}
  	helper(1, str)
  }                                               //> uniProductRec: (str: String)Int
  
  uniProductRec("Hello")                          //> res5: Int = 825152896
  
  //10
  
  def xn(x: Double, n: Int): AnyVal = {
  	def helper(n: Int): Double = n match {
  		case n if n == 0 => 1
  		case n if n < 0 => 1 / helper(n * -1)
  		case n if (n % 2 == 1 && n > 0) => x * helper(n-1)
  		case n if (n % 2 == 0 && n > 0) => {
  			var y = helper(n / 2)
  			y * y
  		}
  	}
  	
  	helper(n)
  }                                               //> xn: (x: Double, n: Int)AnyVal
  
  xn(3,4)                                         //> res6: AnyVal = 81.0
}