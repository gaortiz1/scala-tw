package my_implicit

/*
debe sera asociativa

combine(x, combine(y, z)) = combine(combine(x, y), z)

 */
object Semigroup {

  implicit val intAdditionSemigroup: MySemigroup[Int] = (x: Int, y: Int) => x + y


  def main(args: Array[String]): Unit = {
    val x = 1
    val y = 2
    val z = 3

    println(intAdditionSemigroup.combine(x, y))

    println(intAdditionSemigroup.combine(x, intAdditionSemigroup.combine(y, z)))

    println(intAdditionSemigroup.combine(intAdditionSemigroup.combine(x, y), z))

  }

  trait MySemigroup[A] {
    def combine(x: A, y: A): A
  }

}


