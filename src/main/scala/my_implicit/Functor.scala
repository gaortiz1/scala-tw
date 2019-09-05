package my_implicit

object Functor {

  def main(args: Array[String]): Unit = {
    println(MySome("something..").map(_ * 4))
  }

}

trait MyFunctor[+A] {
  def isBoxEmpty: Boolean

  def map[B](f: A => B): MyFunctor[B] = if (isBoxEmpty) MyNone else MySome(f(this.get))

  def get: A
}

object MyNone extends MyFunctor[Nothing] {
  def isBoxEmpty = true

  def get = throw new NoSuchElementException("Hey i'm MyNone i have nothing!")
}

case class MySome[+A](x: A) extends MyFunctor[A] {
  def isBoxEmpty: Boolean = false
  def get: A = x
}




