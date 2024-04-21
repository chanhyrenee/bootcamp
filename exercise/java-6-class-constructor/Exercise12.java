/**
 * Expected Output: Car Year=2020, Car Model=ModelY
 */
public class Exercise12 {
    // Declare instance variables carYear and carModel
    private int year;
    private String model;

    // Constructor with variables carYear and carModel
    public Exercise12(int year, String model) {
        this.year = year;
        this.model = model;
    }

    public String toString() {
        return "Car Year=" + this.year //
                + ", Car Model=" + this.model;
    }

    public static void main(String[] args) {
        Exercise12 myCar = new Exercise12(2020, "ModelY");
        // Create an instance of class Exercise12, with carYear 2020, and carModel "ModelY"
        // print the expected output
        System.out.println(myCar.toString());
    }
}
