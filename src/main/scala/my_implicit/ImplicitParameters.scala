package my_implicit

/*


A monoid is an associative computation that takes two values of a particular type and returns a value of the same type

A monoid extends these two ideas, identity and association
association
(0 + 1) + 2 = 0 + (1 + 2)
(1 * 2) * 3 = 1 * (2 * 3)

a || ( b || c) = (a ||  b )|| c

identity
0 + value = value
1 * value = value

 */
object ImplicitParameters {

  implicit object StringMonoid extends Monoid[String] {
    def add(x: String, y: String): String = x concat y
    def unit: String = ""
  }
  implicit object IntMonoid extends Monoid[Int] {
    def add(x: Int, y: Int): Int = x + y
    def unit: Int = 0
  }

  def sum[A](xs: List[A])(implicit m: Monoid[A]): A =
    if (xs.isEmpty) m.unit
    else m.add(xs.head, sum(xs.tail))

  def main(args: Array[String]): Unit = {
    println(sum(List(1, 2, 3)))
    println(sum(List("a", "b", "c")))
  }

}

abstract class SemiGroup[A] {
  def add(x: A, y: A): A
}

abstract class Monoid[A] extends SemiGroup[A] {
  def unit: A
}
