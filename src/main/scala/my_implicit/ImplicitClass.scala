package my_implicit

object ImplicitClass {

  def main(args: Array[String]): Unit = {

    5 times println("HI")
  }

  implicit class IntWithTimes(x: Int) {
    def times[A](f: => A): Unit = {
      def loop(current: Int): Unit =
        if(current > 0) {
          f
          loop(current - 1)
        }
      loop(x)
    }
  }
}
