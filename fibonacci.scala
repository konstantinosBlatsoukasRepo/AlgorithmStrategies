object fibonacci {
  def main(args: Array[String]) {  	  	
  	val n = readInt
	def efFib(n: Int): Int = {
		def helpEfFib(count: Int, x: Int, y: Int): Int = {
			if( n == 0 || n == 1) {
				n
			} else if (count == n) {
				x
			} else {
				helpEfFib(count + 1, y, x + y)
			}
		}
		helpEfFib(0, 0, 1)
	}    
    println(efFib(n))
  }
}	
