object binary_search {
  def main(args: Array[String]) {  	  		

  	val aSeq = readLine.split(" ").map(_.toInt)
  	val bSeq = readLine.split(" ").map(_.toInt)  	
    val n = aSeq(1)
    val k = bSeq(1)
    val a = aSeq.drop(1)
    val b = bSeq.drop(1)

    def binarySearch(low: Int, high: Int, a: Array[Int], key: Int): Int = {
      if (low > high) return -1
      val middle = (high + low) / 2
      if (a(middle) == key) middle
      else if(key > a(middle)) binarySearch(middle + 1, high, a, key)
      else binarySearch(low, middle - 1 , a, key)
    }   

    for(key <- b) { print(binarySearch(0, a.size - 1, a, key) + " ")}

  }
  
 }