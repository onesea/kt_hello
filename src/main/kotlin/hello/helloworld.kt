package hello

fun getGreeting(): String {
  val words = mutableListOf<String>()
  words.add("Hello,")
  words.add("world!")

  return words.joinToString(separator = " ")
}

fun main(args: Array<String>) {
  println(getGreeting())
  Thread.sleep(100000)
}
