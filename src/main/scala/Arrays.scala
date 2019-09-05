import scala.collection.mutable.ArrayBuffer

object Arrays {

  def main(args: Array[String]): Unit = {
    fixedLengthArrays()
    println()
    variableLengthArrays()
    println()
    commonAlgorithms
  }

  def fixedLengthArrays(): Unit = {
    val nums = new Array[Int](10)
    nums(9) = 1;
    println(nums.mkString(" - "))
    // An array of ten integers, all initialized with zero

    val strings = new Array[String](10)
    println(strings.mkString(" - "))
    // A string array with ten elements, all initialized with null

    val words = Array("Hello", "World")
    // An Array[String] of length 2—the type is inferred
    // Note: No new when you supply initial values
    words(0) = "Goodbye"
    println(words.mkString(" - "))
  }

  def variableLengthArrays() : Unit = {

    //https://i.stack.imgur.com/2fjoA.png
    val nums = ArrayBuffer[Int]()
    // Or new ArrayBuffer[Int]
    // An empty array buffer, ready to hold integers

    nums += 1
    // ArrayBuffer(1)
    println("Add an element at the end with [" + nums.mkString(" - ") + "]")

    nums += (1, 2, 3, 5)
    // ArrayBuffer(1, 1, 2, 3, 5)
    println("Add multiple elements at the end by enclosing them in parentheses [" + nums.mkString(" - ") + "]")

    nums ++= Array(8, 13, 21)
    // ArrayBuffer(1, 1, 2, 3, 5, 8, 13, 21)
    println("You can append any collection with the ++= operator [" + nums.mkString(" - ") + "]")

    nums.insert(2, 6)
    println("insert position 2 [" + nums.mkString(" - ") + "]")

    nums.remove(2)
    println("remove position 2 [" + nums.mkString(" - ") + "]")

    nums.remove(2, 3)
    println("remove position 2 [" + nums.mkString(" - ") + "]")


    println(nums.mkString(" - "))
  }

  def commonAlgorithms() : Unit = {
    println(Array(1, 7, 2, 9).sum)
    println(ArrayBuffer("Mary", "had", "a", "little", "lamb").max)
  }

}
