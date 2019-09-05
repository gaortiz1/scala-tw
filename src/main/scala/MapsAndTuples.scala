object MapsAndTuples {

  def main(args: Array[String]): Unit = {
    maps
    zipping
  }

  def maps(): Unit = {
    //val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
    //val scores = Map(("Alice", 10), ("Bob", 3), ("Cindy", 8))

    val scores = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
    //val scores = scala.collection.mutable.Map[String, Int]()

    //get
    println(scores("Bob"))
    println(if (scores.contains("Bob1")) scores("Bob1") else 0)
    println(scores.getOrElse("Bob1", 0))

    //create
    scores("Fred") = 7
    println(scores("Fred"))

    //update
    scores("Bob") = 10
    println(scores("Bob"))
  }


  def zipping(): Unit = {
    val symbols = Array("<", "-", ">")
    val counts = Array(2, 10, 2)
    val pairs = symbols.zip(counts)

    pairs.iterator.foreach(print)

    /*
    for (elem <- pairs) {
      print(elem._1, elem._2)
    }
     */
  }

}
