package my_implicit

/*
Monads are structures that represent sequential computations.
A Monad is not a class or a trait; it is a concept.
 */
object Monads {

  def main(args: Array[String]): Unit = {
    var names = Seq("Nikhil", "Mateo")
    println(names)

    var namestoLowerCase = names.map(_.toLowerCase)
    println(namestoLowerCase)

    var exMap = namestoLowerCase.flatMap(_.toLowerCase)
    println(exMap)





    val numList1 = List(1,2)
    val numList2 = List(3,4)

    val some = numList1 flatMap { x => numList2 map {
      y => x + y
    }
    }

    println(some)
  }

}
