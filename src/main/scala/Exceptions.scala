object Exceptions {

  def main(args: Array[String]): Unit = {
    catchException()
  }

  def throwException() : Unit = {
    throw new IllegalArgumentException("x should not be negative")
  }

  def catchException() : Unit = {
    try {
      throwException()
    } catch {
      case _: Exception => println("error")
      case ex: IllegalArgumentException => ex.printStackTrace()
    }

  }

}
