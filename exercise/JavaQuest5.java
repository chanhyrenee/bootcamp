package exercise;

public class JavaQuest5 {
  /**
   * 
   * When target = 'c', the expected output: We found 3 character c in the String.
   * 
   * When target = 'z', the expected output: Not Found.
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    String str = "Welcome to the coding bootcamp."; // You should not change this line
    char target = 'c'; // Update this target to test the logic

    int num = 0;
    for (int i = 1; i < str.length(); i++) {
      char w = str.charAt(i);
      if (w == target) {
        num = num + 1;
      }
    }
    if (num == 0) {
      System.out.println("Not Found.");
    } else {
      System.out.println("We found " + num + " character c in the String");
    }
  }
}
