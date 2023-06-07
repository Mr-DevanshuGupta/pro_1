import java.util.*;

public class check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);
        if (Character.isAlphabetic(ch)) {
            System.out.println("Alphabet");
        } else if (Character.isDigit(ch)) {
            System.out.println("is a digit");
        } else {
            System.out.println("Is a special");
        }

    }
}