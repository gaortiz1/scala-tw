package my_implicit

object ImplicitFunction {

  /*

  implicit def fooToInt(foo:[A]): Int = foo.i

  implicit def a(foo: Foo) : String = foo.i.toString
*/

  implicit val toInt :To[Foo, Int] = (x: Foo) => x.i + 50

  def main(args: Array[String]): Unit = {
    println(Foo(4))
  }

}

case class Foo(i: Int)

trait To[A, B] {
  def parse(x: A): B
}
