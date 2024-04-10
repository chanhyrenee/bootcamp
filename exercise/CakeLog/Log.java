package exercise.CakeLog;

import java.time.LocalDate;
import java.util.Arrays;

public class Log {

  private LocalDate bakeDate;
  private Recipe[] recipes;

  public Log(int year, int month, int day) {
    this.bakeDate = LocalDate.of(year, month, day);
    this.recipes = new Recipe[0];
  }

  public void addRec(Recipe recipe) {
    Recipe[] copyArr = this.recipes;
    this.recipes = new Recipe[this.recipes.length + 1];
    int idx = 0;
    for (int i = 0; i < copyArr.length; i++) {
      recipes[idx++] = copyArr[i];
    }
    recipes[idx] = recipe;
  }

  public String toString() {
    return "Log -" //
        + " Date: " + this.bakeDate //
        + " Recipes: " + Arrays.toString(this.recipes); //
  }

  public static void main(String[] args) {

    Cake cake1 = new Cake("ChesseCake", true);
    Cake cake2 = new Cake("ChocoCake", false);

    Recipe recipe1a = new Recipe("sugar", 30);
    Recipe recipe1b = new Recipe("butter", 10);
    Recipe recipe1c = new Recipe("egg", 50);
    Recipe recipe2a = new Recipe("flour", 20);
    Recipe recipe2b = new Recipe("milk", 100);
    Recipe recipe2c = new Recipe("egg", 50);

    Log log1 = new Log(2024, 04, 01);
    Log log2 = new Log(2024, 04, 04);

    log1.addRec(recipe1a);
    log1.addRec(recipe1b);
    log1.addRec(recipe1c);
    log2.addRec(recipe2a);
    log2.addRec(recipe2b);
    log2.addRec(recipe2c);

    System.out.println(cake1.toString());
    System.out.println(log1.toString());
    System.out.println(cake2.toString());
    System.out.println(log2.toString());

  }
}
