import scala.util.Random

object Exercises {
  //1
  def genRandomArrOfLengthN(n: Int) = {
  	for(i <- 0 until n) yield Random.nextInt(n)
  }                                               //> genRandomArrOfLengthN: (n: Int)scala.collection.immutable.IndexedSeq[Int]
  
  val arr:Array[Int] = genRandomArrOfLengthN(5).toArray
                                                  //> arr  : Array[Int] = Array(4, 1, 1, 2, 3)
  
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
  }                                               //> swapAdjacentElements: (arr: Array[Int])scala.collection.immutable.IndexedSeq
                                                  //| [Int]
  
  var arr2 = swapAdjacentElements(arr)            //> arr2  : scala.collection.immutable.IndexedSeq[Int] = Vector(1, 4, 2, 1, 3)

 //4
 def prod(arr: Array[Int]) = {
 	arr.filter(_ > 0) ++ arr.filter(_ == 0) ++ arr.filter(_ < 0)
 }                                                //> prod: (arr: Array[Int])Array[Int]
 
 prod(Array(1,2,-3,0,-1,10,0,0,-5,-6,0,-3,28,12)) //> res0: Array[Int] = Array(1, 2, 10, 28, 12, 0, 0, 0, 0, -3, -1, -5, -6, -3)
 
 //5
 def computeAverage(arr: Array[Int]): Double = arr.sum * 1.0 / arr.size
                                                  //> computeAverage: (arr: Array[Int])Double
 computeAverage(arr)                              //> res1: Double = 2.2
 
 //6
 arr.reverse                                      //> res2: Array[Int] = Array(3, 1, 2, 4, 1)
 
 //7
 arr.distinct                                     //> res3: Array[Int] = Array(1, 4, 2, 3)
 
}