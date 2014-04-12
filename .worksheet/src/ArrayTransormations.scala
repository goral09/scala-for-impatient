object ArrayTransormations {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(72); 
  println("Welcome to the Scala worksheet");$skip(45); 
  
  
  var array  = Array(1,2,3,-1,4,-5,10);System.out.println("""array  : Array[Int] = """ + $show(array ));$skip(33); val res$0 = 
  
  array.mkString("<",",",">");System.out.println("""res0: String = """ + $show(res$0));$skip(26); val res$1 = 
  
  array.padTo(10, 100);System.out.println("""res1: Array[Int] = """ + $show(res$1))}
}
