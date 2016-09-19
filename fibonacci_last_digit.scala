object fibonacci_last_digit {
  def main(args: Array[String]) {  	  	
  	val x = readLong
  	val n = BigInt(x)
	def efFib(n: BigInt): BigInt = {
		def helpEfFib(count: BigInt, x: BigInt, y: BigInt): BigInt = {
			if( n == 0 || n == 1) {
				n
			} else if (count == n) {
				x
			} else {
				helpEfFib(count + 1, y, (x + y) % 10)
			}
		}
		helpEfFib(0, 0, 1)
	}     
    println(efFib(n))
  }
}	
