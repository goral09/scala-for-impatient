import scala.util.Random

object Exercises {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(88); 
  println("Welcome to the Scala worksheet");$skip(100); 
  
  //1
  def genRandomArrOfLengthN(n: Int) = {
  	for(i <- 0 until n) yield Random.nextInt(n)
  };System.out.println("""genRandomArrOfLengthN: (n: Int)scala.collection.immutable.IndexedSeq[Int]""");$skip(59); 
  
  val arr:Array[Int] = genRandomArrOfLengthN(5).toArray;System.out.println("""arr  : Array[Int] = """ + $show(arr ));$skip(247); 
  
  //2 & 3
  def swapAdjacentElements(arr: Array[Int]) = {
  	for(i <- 0 until arr.size) yield {
  		if(i%2==0 && i + 1 < arr.size)  {
  			var right = arr(i + 1)
  			arr(i+1) = arr(i)
  			arr(i) = right
  			arr(i)
  		} else arr(i)
  	}
  };System.out.println("""swapAdjacentElements: (arr: Array[Int])scala.collection.immutable.IndexedSeq[Int]""");$skip(42); 
  
  var arr2 = swapAdjacentElements(arr);System.out.println("""arr2  : scala.collection.immutable.IndexedSeq[Int] = """ + $show(arr2 ));$skip(103); 

 //4
 def prod(arr: Array[Int]) = {
 	arr.filter(_ > 0) ++ arr.filter(_ == 0) ++ arr.filter(_ < 0)
 };System.out.println("""prod: (arr: Array[Int])Array[Int]""");$skip(52); val res$0 = 
 
 prod(Array(1,2,-3,0,-1,10,0,0,-5,-6,0,-3,28,12));System.out.println("""res0: Array[Int] = """ + $show(res$0));$skip(79); 
 
 //5
 def computeAverage(arr: Array[Int]): Double = arr.sum * 1.0 / arr.size;System.out.println("""computeAverage: (arr: Array[Int])Double""");$skip(21); val res$1 = 
 computeAverage(arr);System.out.println("""res1: Double = """ + $show(res$1));$skip(20); val res$2 = 
 
 //6
 arr.reverse;System.out.println("""res2: Array[Int] = """ + $show(res$2));$skip(21); val res$3 = 
 
 //7
 arr.distinct;System.out.println("""res3: Array[Int] = """ + $show(res$3))}
 
}
