import java.util.*;

public class comm {
    public static void main(String[] args) {
        String gender = args[0];
        int age = Integer.parseInt(args[1]);
        if (gender.equals("female") && age > 1 && age < 59) {
            System.out.println("8.2");
        } else if (gender.equals("female") && age < 100 && age > 59) {
            System.out.println("9.2");
        } else if (gender.equals("male") && age > 1 && age < 59) {
            System.out.println("8.4");
        } else if (gender.equals("male") && age < 100 && age > 59) {
            System.out.println("8.2");
        }
    }
}
