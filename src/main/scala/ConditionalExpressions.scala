object ConditionalExpressions {

  def main(args: Array[String]): Unit = {
    println(expression(1))
    println(fac(5))
    println(facRecursive(5))
    println(decorate("hello"))
    println(decorate("hello", ">>>>"))
    println(decorate(left = "<<<", str = "Hello", right = ">>>"))
    println(sum(1, 2, 3))
    //println(sum(1 to 5)) // Error
    println(sum(1 to 5: _*))

    lazyEvaluation()
  }


  /*
  val result
  if (x > 0) result = 1 else result = -1
   */
  def expression(x: Int): Int = if (x > 0) 1 else -1

  def fac(n: Int) = {
    var result = 1
    for (i <- 1 to n)
      result = result * i

    result
  }

  def facRecursive(n: Int): Int = if (n <= 0) 1 else n * fac(n - 1)

  def decorate(str: String, left: String = "[", right: String = "]") =
    left + str + right

  def sum(args: Int*) = {
    var result = 0
    for (arg <- args)
      result += arg
    result
  }

  def lazyEvaluation() = {
    val result1 = expression(1)
    // Evaluated as soon as words is defined

    lazy val result2 = expression(1)
    // Evaluated the first time words is used

    def result3 = expression(1)
    // Evaluated every time words is used

    //println(result1)
    //println(result2)
    //println(result3)
  }

}
