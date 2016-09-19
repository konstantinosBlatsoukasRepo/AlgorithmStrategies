object MaxPairwiseProduct {
  def main(args: Array[String]) {  	  	
  	val n = readInt 	 	
	val numbers = readLine.split(" ").map(_.toLong)	  	
	val sortedNumbers = numbers.sorted	  	
	val arSize = sortedNumbers.size
	val maxProduct = sortedNumbers(arSize - 1) * sortedNumbers(arSize - 2)
	println(maxProduct)   
  }
}