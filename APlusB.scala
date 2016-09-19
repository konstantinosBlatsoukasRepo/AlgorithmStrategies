object APlusB {
  def main(args: Array[String]) {  	
	val myAnB = readLine.split(" ").map(_.toInt)	  		
    val a = myAnB(0)
    val b = myAnB(1)
    val c = a + b
    println(c)
  }
}