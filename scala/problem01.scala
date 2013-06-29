object SumMultsOf {
  def main(args: Array[String]) {
    var sum: Int = 0;

    sum += 3 * (1 to 333).sum;
    sum += 5 * (1 to 199).sum;
    sum -= 15 * (1 to 66).sum;

    //
    // Brute force for loop
    //
    /*for (i <- 1 to 999 if (i % 3 == 0 || i % 5 == 0))
      sum += i;*/

    println(sum);
  }
}
