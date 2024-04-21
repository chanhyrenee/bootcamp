enum Level {
    LOW(1), MEDIUM(2), HIGH(3);

    int num;

    Level(int num) {
        this.num = num;
    }

    // Program a method to print all enum level
    public static void showValues() {
        for (Level lv : Level.values()) {
            System.out.println(lv);
        }
    }

    public static void printsth(){
        System.out.println("sth");
    }
}

public class Exercise18 {
    public static void main(String[] args) {
        Level.showValues();
    }
}
