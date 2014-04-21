object triangle {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(110); 
	val triangle: List[List[Int]] = List(List(18,35,87,10),List(17,47,82),List(95,64),List(75));System.out.println("""triangle  : List[List[Int]] = """ + $show(triangle ));$skip(46); 
  def retMax(list: List[Int]): Int = list.max;System.out.println("""retMax: (list: List[Int])Int""");$skip(75); val res$0 = 
  
  triangle.foldLeft(0)((res: Int, row: List[Int]) => res + retMax(row));System.out.println("""res0: Int = """ + $show(res$0))}
}
