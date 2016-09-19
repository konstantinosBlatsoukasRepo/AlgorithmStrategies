object gcd {
  def main(args: Array[String]) {  	  	
  	val myAnB = readLine.split(" ").map(_.toLong)
  	val a = myAnB(0)
  	val b = myAnB(1)
  	def gcd(a: Long, b: Long): Long = if(b == 0) a else gcd(b, a%b)
  	println(gcd(a, b))
  }
  
 }