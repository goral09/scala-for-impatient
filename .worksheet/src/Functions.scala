object Functions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
  println("Welcome to the Scala worksheet");$skip(63); 
  
  def fact(n: Int): Int = if(n <= 0) 1 else n * fact(n - 1);System.out.println("""fact: (n: Int)Int""");$skip(154); 
  
  def fac(n: Int) = {
  	def helper(acc: Int, curr: Int): Int = {
  		if(curr <= 0) acc
  		else helper(curr * acc, curr - 1)
  	}
  	helper(1, n)
  };System.out.println("""fac: (n: Int)Int""");$skip(13); val res$0 = 
  
  fact(5);System.out.println("""res0: Int = """ + $show(res$0));$skip(9); val res$1 = 
  fac(5);System.out.println("""res1: Int = """ + $show(res$1));$skip(137); 
  
  //Variable amount of input arguments
  
  def sum(args: Int*) = {
  	var result = 0
  	for(arg <- args) result += arg
  	result
  };System.out.println("""sum: (args: Int*)Int""");$skip(21); val res$2 = 
  
  
  sum(1,2,3,4);System.out.println("""res2: Int = """ + $show(res$2));$skip(68); 
  
  def sumWithFold(args: Int*) = {
  	args.foldLeft(0)(_ + _)
  };System.out.println("""sumWithFold: (args: Int*)Int""");$skip(26); val res$3 = 
  
  sumWithFold(1,2,3,4);System.out.println("""res3: Int = """ + $show(res$3))}
}
