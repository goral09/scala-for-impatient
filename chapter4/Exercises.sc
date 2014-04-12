object Exercises {
	//1
	var gizmos = Map("gizmo1" -> 40, "gizmo2" -> 20, "gizmo3" -> 28)
                                                  //> gizmos  : scala.collection.immutable.Map[String,Int] = Map(gizmo1 -> 40, gizm
                                                  //| o2 -> 20, gizmo3 -> 28)
	
	var gizmos2 = for((k,v) <- gizmos) yield (k, v * 0.9)
                                                  //> gizmos2  : scala.collection.immutable.Map[String,Double] = Map(gizmo1 -> 36.
                                                  //| 0, gizmo2 -> 18.0, gizmo3 -> 25.2)
  //2
  lazy val words =	io.Source.fromFile("/media/Software/Eclipse_workspace/Scala_for_Impatient/sampleData/SomeWords").mkString
                                                  //> words: => String
   
  words.trim().split(" ").groupBy(identity).map(el => (el._1, el._2.length))
                                                  //> res0: scala.collection.immutable.Map[String,Int] = Map(Something -> 1, somet
                                                  //| hing -> 2)
  //9
  def lteqgt(arr: Array[Int], v: Int): (Int, Int, Int) = {
  	(arr.count(_ < v), arr.count(_ == v), arr.count(_ > v))
  }                                               //> lteqgt: (arr: Array[Int], v: Int)(Int, Int, Int)
  
  lteqgt(Array(10,20,0,-10,-20), 0)               //> res1: (Int, Int, Int) = (2,1,2)
  
  /*def lteqgt2(arr: Array[Int], n: Int): (Int, Int, Int) = {
  	var result = (0,0,0)
  	result = for(el <- arr) yield el match {
  		case el if el > n => (result._1 + 1, result._2, result._3)
  		case el if el == 0 => (result._1, result._2 + 1, result._3)
  		case _ => (result._1, result._2, result._3 + 1)
  	}
  	
  	result
  }
  
  lteqgt2(Array(10,20,0,-10,-20),0)*/
  //10
  "hello".zip("world")                            //> res2: scala.collection.immutable.IndexedSeq[(Char, Char)] = Vector((h,w), (e
                                                  //| ,o), (l,r), (l,l), (o,d))
}