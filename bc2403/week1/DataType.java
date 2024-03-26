public class DataType {
  public static void main(String[] args) {
    int x = 1200;
    int age = 18;
    System.out.println(x);
    x = 200;
    System.out.println(x);
    System.out.println("x");
    System.out.println(x - age);
    age = age + 1;
    System.out.println(age);
    age = age + 1;
    System.out.println(age);

    int y = -20;
    y = 200;
    int sum = x + y + age;
    System.out.println(sum);

    int price = 8;
    int quantity = 10;
    int total = price * quantity;

    int price2 = 10;
    int quantity2 = 4;
    int total2 = price2 * quantity2;

    int averagePrice = (total + total2) / (quantity + quantity2);
    System.out.println(averagePrice);

    int a = 9 / 10;
    System.out.println(a);

    double k = 1.3;
    double k2 = -1.123456789022345678903234567890;
    System.out.println(k2);

    double k6 = 0.1 + 0.2;
    System.out.println(k6);
    System.out.println(0.1 + 0.2);


    int u = 10 % 3;
    System.out.println(u);
  }

}
