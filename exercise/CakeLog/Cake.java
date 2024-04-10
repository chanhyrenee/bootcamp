package exercise.CakeLog;

public class Cake {
  private String cakeType;
  private boolean yummy;

  public Cake(String cakeType, boolean yummy) {
    this.cakeType = cakeType;
    this.yummy = yummy;
  }

  public String toString() {
    String taste = yummy ? "good" : "bad";
    return this.cakeType //
        + "| taste: " + taste; //
  }
}
