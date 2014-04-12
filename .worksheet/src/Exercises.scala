object Exercises {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(89); 
	//1
	var gizmos = Map("gizmo1" -> 40, "gizmo2" -> 20, "gizmo3" -> 28);System.out.println("""gizmos  : scala.collection.immutable.Map[String,Int] = """ + $show(gizmos ));$skip(57); 
	
	var gizmos2 = for((k,v) <- gizmos) yield (k, v * 0.9);System.out.println("""gizmos2  : scala.collection.immutable.Map[String,Double] = """ + $show(gizmos2 ));$skip(131); 
  //2
  lazy val words =	io.Source.fromFile("/media/Software/Eclipse_workspace/Scala_for_Impatient/sampleData/SomeWords").mkString;System.out.println("""words: => String""");$skip(81); val res$0 = 
   
  words.trim().split(" ").groupBy(identity).map(el => (el._1, el._2.length));System.out.println("""res0: scala.collection.immutable.Map[String,Int] = """ + $show(res$0));$skip(128); 
  //9
  def lteqgt(arr: Array[Int], v: Int): (Int, Int, Int) = {
  	(arr.count(_ < v), arr.count(_ == v), arr.count(_ > v))
  };System.out.println("""lteqgt: (arr: Array[Int], v: Int)(Int, Int, Int)""");$skip(39); val res$1 = 
  
  lteqgt(Array(10,20,0,-10,-20), 0);System.out.println("""res1: (Int, Int, Int) = """ + $show(res$1));$skip(406); val res$2 = 
  
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
  "hello".zip("world");System.out.println("""res2: scala.collection.immutable.IndexedSeq[(Char, Char)] = """ + $show(res$2))}
}
