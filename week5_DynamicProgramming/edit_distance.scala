object edit_distance {
  def main(args: Array[String]) {  	

  	val firstString = readLine
    val secondString = readLine
    val n = firstString.size
    val m = secondString.size
    val values = (for(i <- 0 to m) yield (0 to n).map(_ => 0).toArray).toArray
    for(j <- 0 to n) values(0)(j) = j
    for(j <- 0 to m) values(j)(0) = j
    for(i <- 1 to m; j <- 1 to n) {
      val insertion = values(i - 1)(j) + 1
      val deletion = values(i)(j - 1) + 1
      val unmatched = values(i - 1)(j - 1)
      val matched = values(i - 1)(j - 1) + 1
      if (firstString(j - 1) == secondString(i - 1)) values(i)(j) = Array(insertion, deletion, matched).min else  values(i)(j) = Array(insertion, deletion, unmatched).min
      }
    print(values(n)(m))

  }
}