import scala.collection.mutable.ListBuffer

object EvenFibonacci {
  def main (args: Array[String]) {
    var sum: BigInt = 2; // 2 is even but we don't iterate over it
    
    var series = new ListBuffer[BigInt];
    series += 1; series += 2; // fill initial buffer

    var i: Int = 2;
    var counting: Boolean = true;
    
    while (counting) {
      series += series(i - 2) + series(i - 1); // get next in sequence
      counting = { 
        if (series(i) >= 4000000) {
          false;  // stop if we're over 4000000
        }
        else {
          sum += { // add the last one we found, or 0
            if (series(i) % 2 == 0)
              series(i)
            else 
              0; 
          }
          
          true; // keep counting
        }
      }

      i += 1; // increment our place in the buffer
    }

    println(sum);
  }
}
