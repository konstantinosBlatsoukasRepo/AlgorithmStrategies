object change {
  def main(args: Array[String]) {  	  	
  	var m = readInt 	 	
 	var coinsCounter = 0;                           //> coinsCounter  : Int = 0
  	for(i <- Array(10, 5, 1)) { while(m >= i) {m = m - i; coinsCounter = coinsCounter +1} }
    println(coinsCounter)
  }
}