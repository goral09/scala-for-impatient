object Functions {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def fact(n: Int): Int = if(n <= 0) 1 else n * fact(n - 1)
                                                  //> fact: (n: Int)Int
  
  def fac(n: Int) = {
  	def helper(acc: Int, curr: Int): Int = {
  		if(curr <= 0) acc
  		else helper(curr * acc, curr - 1)
  	}
  	helper(1, n)
  }                                               //> fac: (n: Int)Int
  
  fact(5)                                         //> res0: Int = 120
  fac(5)                                          //> res1: Int = 120
  
  //Variable amount of input arguments
  
  def sum(args: Int*) = {
  	var result = 0
  	for(arg <- args) result += arg
  	result
  }                                               //> sum: (args: Int*)Int
  
  
  sum(1,2,3,4)                                    //> res2: Int = 10
  
  def sumWithFold(args: Int*) = {
  	args.foldLeft(0)(_ + _)
  }                                               //> sumWithFold: (args: Int*)Int
  
  sumWithFold(1,2,3,4)                            //> res3: Int = 10
}