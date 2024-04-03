package exercise;

/**
 * Expected Output: J e 3 9 10 ab c VenturenixLAB, Coding 19 ren VENTURENIXLAB, JAVA venturenixlab, java V*NTUR*NIXLAB, JAVA!!!
 */
public class JavaQuest9 {
  public static void main(String[] args) {
    String a = "VenturenixLAB, Java";

    // prints J
    System.out.println(a.charAt(15));
    // prints e (the 1st e)
    System.out.println(a.charAt(1));
    // code here ...

    // Use indexOf()
    // prints 3
    System.out.println(a.indexOf('t'));
    // prints 9
    System.out.println(a.indexOf('x'));
    // prints 10
    System.out.println(a.indexOf('L'));
    // code here ...

    // Use String trim()
    String abc = "    ab c    ";
    // prints "ab c"
    System.out.println(abc.trim());
    // Use String replace() method
    // prints VenturenixLAB, Coding
    // code here ...
    System.out.println(a.replace("Java", "Coding"));

    // int length()
    // prints 19
    // code here ...
    System.out.println(a.length());

    // Use String substring(int start, int end)
    // prints "ren"
    // code here ...
    System.out.println(a.substring(5, 8));

    // print "VENTURENIXLAB, JAVA"
    // prints "venturenixlab, java"
    // code here ...
    System.out.println(a.toUpperCase());
    System.out.println(a.toLowerCase());

    // Method Chaining (one line to complete)
    // prints "V*NTUR*NIXLAB, JAVA!!!"
    // code here ...
    System.out.println();
    System.out.println(a.replace('e', '*').toUpperCase() + "!!!");

  }
}
