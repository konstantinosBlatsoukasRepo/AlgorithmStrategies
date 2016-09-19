object knapsac {
  def main(args: Array[String]) {  	

  	val readNumberOfItemsAndTotalWeight = readLine.split(" ").map(_.toInt)
  	val W = readNumberOfItemsAndTotalWeight(0)
  	var n = readNumberOfItemsAndTotalWeight(1)
  	val weights = readLine.split(" ").map(_.toInt)
  	//initialization fo two dimensional array filled with zeros
  	val values = (for(i <- 0 to n) yield (0 to W).map(_ => 0).toArray).toArray
  	for(i <- (1 to n); w <- (1 to W)) { 
  		values(i)(w) = values(i - 1)(w)
  	 	if ((weights(i - 1)) <= w) { 
  	 		val tempVal = values(i - 1)(w - weights(i - 1)) + weights(i - 1)
  	 		if (tempVal > values(i)(w)) values(i)(w) = tempVal
  	 	} 	
  	 }
  	 print(values(n)(W))      	 
  }
}