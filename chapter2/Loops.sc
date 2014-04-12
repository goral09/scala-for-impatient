object Loops {
  for(i <- 1 to 3; j <- i+1 to 3) println(j)      //> 2
                                                  //| 3
                                                  //| 3
  for(i <- 1 to 3; j <- 1 to 3 if i!=j) println(10*i + j)
                                                  //> 12
                                                  //| 13
                                                  //| 21
                                                  //| 23
                                                  //| 31
                                                  //| 32
  for(i <- 1 to 2) yield i + "1"                  //> res0: scala.collection.immutable.IndexedSeq[String] = Vector(11, 21)
}