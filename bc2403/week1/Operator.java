public class Operator {

  public static void main(String[] args) {
    int y = 1;
    y++;
    y++;
    ++y;
    y = y + 1;
    y += 1;

    int e = 10;
    e--;
    --e;
    e = e - 1;
    e -= 1;
    System.out.println(e);

    int pretdecrement = --e;
    System.out.println(pretdecrement);
    System.out.println(e);

    e = e++;
    System.out.println(e);

    int postdecrement = e--;
    System.out.println(postdecrement);
    System.out.println(e);


  }

}
