package edu.cnm.deepdive.fizzbuzzandroid;

public class FizzBuzz {


  public static final int DEFAULT_LIMIT = 100;

  public static void main(String[] args) {
    int limit = (args.length > 0) ? Integer.parseInt(args[0]) : DEFAULT_LIMIT;
    count(limit);
  }

  public static String count(int fizzLimit) {
    String result = "";
    for (int i = 1; i <= fizzLimit; i++) {
      String output = "";
      if (i % 3 == 0) {
        output += "Fizz!"; // fizz +
      }
      if (i % 5 == 0) {
        output += "Buzz!"; // buzz +; fizz+ Bizz+ display Fizz!Buzz!
      }
      if (output.isEmpty()){ //isEmpty is builtin method
         result += Integer.toString(i);
      }
      else {
         result += output;
      }
      result += "\n";
    }
    return result;
  }
}
