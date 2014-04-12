object ArrayTransormations {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  var array  = Array(1,2,3,-1,4,-5,10)            //> array  : Array[Int] = Array(1, 2, 3, -1, 4, -5, 10)
  
  array.mkString("<",",",">")                     //> res0: String = <1,2,3,-1,4,-5,10>
  
  array.padTo(10, 100)                            //> res1: Array[Int] = Array(1, 2, 3, -1, 4, -5, 10, 100, 100, 100)
}