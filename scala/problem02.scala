import scala.collection.mutable.ListBuffer

object EvenFibonacci {
  def main (args: Array[String]) {
    var sum: BigInt = 2;
    var series = new ListBuffer[BigInt];
    series += 1; series += 2;

    var i: Int = 2;
    var counting: Boolean = true;
    while (counting) {
      series += series(i - 2) + series(i - 1);
      counting = { 
        if (series(i) >= 4000000) {
          false;
        }
        else {
          sum += { 
            if (series(i) % 2 == 0) {
              printf("%d is even\n", series(i));
              series(i)
            }
            else 
              0; 
          }
          
          true;
        }
      }

      i += 1;
    }

    println(sum);
  }
}
