object MaxPairwiseProductFast {
  def main(args: Array[String]) {  	  	
  	val n = readInt 	 	
	val numbers = readLine.split(" ").map(_.toInt)	  		
	val startTime = System.nanoTime()
	val max = numbers.max
	val excludedNumbers = for{k <- numbers; if k != max} yield k
	val afterMax = excludedNumbers max
	val endTime = System.nanoTime()
	val totalTime = (endTime.toFloat - startTime.toFloat) / 1000000000f
	println("total time: "+totalTime)
    println(max * afterMax)

  }
}