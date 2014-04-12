object Loops {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  for(i <- 1 to 3; j <- i+1 to 3) println(j);$skip(58); 
  for(i <- 1 to 3; j <- 1 to 3 if i!=j) println(10*i + j);$skip(33); val res$0 = 
  for(i <- 1 to 2) yield i + "1";System.out.println("""res0: scala.collection.immutable.IndexedSeq[String] = """ + $show(res$0))}
}
