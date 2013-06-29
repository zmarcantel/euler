object SumMultsOf {
  def main(args: Array[String]) {
    var sum: Int = 0;

    sum += 3 * (1 to 333).sum; // multiples of 3
    sum += 5 * (1 to 199).sum; // multiples of 5
    sum -= 15 * (1 to 66).sum; // take out suplicates

    //
    // Brute force for loop
    //
    /*for (i <- 1 to 999 if (i % 3 == 0 || i % 5 == 0))
      sum += i;*/

    println(sum);
  }
}
