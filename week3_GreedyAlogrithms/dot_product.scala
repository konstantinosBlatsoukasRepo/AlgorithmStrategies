object dot_product {
  def main(args: Array[String]) {  	  	
	val n = readInt.toLong
  	val firstSeq = readLine.split(" ").map(_.toLong)
  	val secondSeq = readLine.split(" ").map(_.toLong)  	
  	val firstSeqSorted = firstSeq.sortWith(_ > _)
  	val secondSeqSorted = secondSeq.sortWith(_ > _)
  	val zippedSequnces =  (firstSeqSorted zip secondSeqSorted)
  	val result = for(pair <- zippedSequnces) yield pair._1 * pair._2
  	val finalResult = result.toSeq
  	println(finalResult.sum)
  }
  
 }