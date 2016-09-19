object majority_element {
  def main(args: Array[String]) {
    val n = readLong
    val a = readLine.split(" ").map(_.toLong)

        def mergeSort(xs: List[Long]): List[Long] = {
          val n = xs.length / 2
          if (n == 0) xs
          else {
            def merge(xs: List[Long], ys: List[Long]): List[Long] =
                (xs, ys) match {
                case(Nil, ys) => ys
                case(xs, Nil) => xs
                case(x :: xs1, y :: ys1) =>
                  if (x < y) x::merge(xs1, ys)
                  else y :: merge(xs, ys1)
            }
            val (left, right) = xs splitAt(n)
            merge(mergeSort(left), mergeSort(right))
          }
        }     
    
    var c = mergeSort(a.toList)
    
    print(majorityDecision(c.toArray))
    
    def majorityDecision(c: Array[Long]): Long = {
      var previousItem = c(0)
      var procA = c.drop(1)
      var counter = 1
      val arrSize = c.size / 2
      for(currentItem <- 0 to procA.size -1) {        
        if (procA(currentItem) == previousItem) counter += 1 else counter = 1
        if (counter > arrSize) return 1
        previousItem = procA(currentItem)      
      }
      0      
    }         

  }
}