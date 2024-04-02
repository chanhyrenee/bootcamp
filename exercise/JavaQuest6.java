package exercise;

public class JavaQuest6 {
  /**
   * Expected output: 1 1 2 3 5 8 13 21 ...
   * 
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    // Code here ...
    // for loop to print first 15 numbers in Fibonacci Sequence

    // 0|1|0+1|1+1|2+1|3+2|5+3|8+5|13+8|...
    // 0|1|1|2|3|5|8|13|21...
    // previous answer + previous previous answer = result

    int max = 13;
    int a = 0;
    int b = 1;
    System.out.print(b + " ");
    for (int i = 0; i <= max; i++) {
      int c = a + b;
      a = b;
      b = c;
      System.out.print(c + " ");
    }
  }
}
