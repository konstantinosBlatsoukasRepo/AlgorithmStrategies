object covering_segments {
  def main(args: Array[String]) {  
  	val totalPairs = readInt

  	def getPairs(i: Int, list: List[(Int, Int)]): List[(Int, Int)] = {
  		if (i == 0) list else {  		
  			val currentPair = readLine.split(" ").map(_.toInt)
  			val x = currentPair(0)		
			var y = currentPair(1)			
			getPairs(i - 1, (x, y) :: list)
		}		
  	}  	  	

  	val emptyList: List[(Int, Int)] = List()
  	val newList = getPairs(totalPairs, emptyList)
  	var sortedPairs = scala.util.Sorting.stableSort(newList, (t1: (Int, Int), t2: (Int, Int)) => t1._2 < t2._2)

  	def result(in: Array[(Int,Int)], res: List[Int]): List[Int] = {
		if (in.isEmpty ) res else result(in.filter(_._1 > in(0)._2), in(0)._2 :: res)
	}      

	val finalRes = result(sortedPairs, List()).sorted     

  	println(finalRes.size)
  	println(finalRes mkString " ")

  }
}