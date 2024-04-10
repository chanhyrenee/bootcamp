package exercise.CakeLog;

public class Recipe {

  private String item;
  private int gram;

  public Recipe(String item, int gram) {
    this.item = item;
    this.gram = gram;
  }

  public String toString() {
    return this.item + " "//
        + this.gram + " gram"; //
  }

}
