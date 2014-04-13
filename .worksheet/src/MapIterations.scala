object MapIterations {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(81); 
  var scores = Map("Alice" -> 10, "Bob" -> 8, "Tom" -> 15);System.out.println("""scores  : scala.collection.immutable.Map[String,Int] = """ + $show(scores ));$skip(25); 
  scores += ("Tom" -> 9);$skip(64); 
  
  for((key,value) <- scores) println(s"${key} got ${value}");$skip(38); val res$0 = 
  for(key <- scores.keySet) yield key;System.out.println("""res0: scala.collection.immutable.Set[String] = """ + $show(res$0));$skip(63); 
  
  var scores2 = Map("Tom" -> 1, "Kathy" -> 5, "Alice" -> 9);System.out.println("""scores2  : scala.collection.immutable.Map[String,Int] = """ + $show(scores2 ));$skip(22); val res$1 = 
  scores.zip(scores2);System.out.println("""res1: scala.collection.immutable.Map[(String, Int),(String, Int)] = """ + $show(res$1))}
}
