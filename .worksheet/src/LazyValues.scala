object LazyValues {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(63); 
  println("Welcome to the Scala worksheet");$skip(162); 
  
  lazy val words = {
  	println("Evaluating")
  	io.Source.fromFile("/media/Software/Eclipse_workspace/Scala_for_Impatient/sampleData/SomeWords").mkString
  };System.out.println("""words: => String""");$skip(20); 
  
  println(words);$skip(17); 
  println(words)}
  
  /*
  	Every time lazy value is called a method checks in a thread safe manner whether the value has been initialized.
  */
    
}
