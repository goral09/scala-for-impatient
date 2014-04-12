object MapIterations {
  var scores = Map("Alice" -> 10, "Bob" -> 8, "Tom" -> 15)
                                                  //> scores  : scala.collection.immutable.Map[String,Int] = Map(Alice -> 10, Bob -
                                                  //| > 8, Tom -> 15)
  scores += ("Tom" -> 9)
  
  for((key,value) <- scores) println(s"${key} got ${value}")
                                                  //> Alice got 10
                                                  //| Bob got 8
                                                  //| Tom got 9
  for(key <- scores.keySet) yield key             //> res0: scala.collection.immutable.Set[String] = Set(Alice, Bob, Tom)
  
  var scores2 = Map("Tom" -> 1, "Kathy" -> 5, "Alice" -> 9)
                                                  //> scores2  : scala.collection.immutable.Map[String,Int] = Map(Tom -> 1, Kathy 
                                                  //| -> 5, Alice -> 9)
  scores.zip(scores2)                             //> res1: scala.collection.immutable.Map[(String, Int),(String, Int)] = Map((Ali
                                                  //| ce,10) -> (Tom,1), (Bob,8) -> (Kathy,5), (Tom,9) -> (Alice,9))
}