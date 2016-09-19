object fractional_knapsack {
  def main(args: Array[String]) {  	

  	val readNumberOfItemsAndTotalWeight = readLine.split(" ").map(_.toDouble)
  	val n = readNumberOfItemsAndTotalWeight(0)
  	var W = readNumberOfItemsAndTotalWeight(1)

  	def getValueWeightPairs(i: Int, list: List[(Double, Double)]): List[(Double, Double)] = {
  		if (i == 0) list else {  		
  			val currentInput = readLine.split(" ").map(_.toDouble)
  			val v = currentInput(0)		
			var w = currentInput(1)			
			getValueWeightPairs(i - 1, (v / w, w) :: list)
		}		
  	}  	

  	val emptyList: List[(Double, Double)] = List()
  	val newList = getValueWeightPairs(n.toInt, emptyList)

  	var sortedArray = scala.util.Sorting.stableSort(newList, (t1: (Double, Double), t2: (Double, Double)) => t1._1 > t2._1)
  	var bagValue = 0.0   	
	 
	for(i <- 0 to (n - 1).toInt) {	   
	   var currentItemWeight = sortedArray(i)._2
	   var currentItemValue = sortedArray(i)._1	   
	   while( (W > 0) && (thereIsAnItem(currentItemWeight)) ) {
	   	bagValue = bagValue + currentItemValue
	   	currentItemWeight = currentItemWeight - 1
	   	W = W - 1
	   }                                               		
	}
	
	println("%.4f".format(bagValue))
	
	def thereIsAnItem(itemWeight: Double): Boolean = {
		if (itemWeight != 0.0) true else false
	}   

  }
}