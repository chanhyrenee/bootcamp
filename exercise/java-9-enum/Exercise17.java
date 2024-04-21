enum Level {
    LOW(1), //
    MEDIUM(2), //
    HIGH(3);

    int value;

    Level(int value) {
        this.value = value;
    }

    public static int getLevel(Level lv) {
        switch (lv) {
            case LOW:
                return 1;
            case MEDIUM:
                return 2;
            case HIGH:
                return 3;
        }
        return -1;
    }

    public String toString() {
        return "enum is " + this.name() + ", and its value is " + this.value;
    }
}


public class Exercise17 {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;

        // Write a switch statement to print the expected output.
        System.out.println(myVar.toString());
        System.out.println(Level.getLevel(myVar));
    }
}
