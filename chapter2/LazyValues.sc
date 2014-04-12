object LazyValues {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  lazy val words = {
  	println("Evaluating")
  	io.Source.fromFile("/media/Software/Eclipse_workspace/Scala_for_Impatient/sampleData/SomeWords").mkString
  }                                               //> words: => String
  
  println(words)                                  //> Evaluating
                                                  //| Something something something
  println(words)                                  //> Something something something
  
  /*
  	Every time lazy value is called a method checks in a thread safe manner whether the value has been initialized.
  */
    
}