package exercise;

public class PlantTree {

  private int row;
  private char symbol;

  public void setRow(int x) {
    this.row = x;
  }

  public void setSymbol(char y) {
    this.symbol = y;
  }

  public void growth() {
    int r = this.row;
    int s = 1;
    for (s = 1; s <= r; s++) {
      int a = r - s;
      int b = 2 * s - 1;
      for (int j = 1; j <= a; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= b; k++) {
        System.out.print(this.symbol);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    PlantTree tree1 = new PlantTree();
    tree1.setRow(5);
    tree1.setSymbol('*');
    tree1.growth();
  }
}
