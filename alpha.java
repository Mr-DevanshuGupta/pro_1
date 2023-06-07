import java.util.*;

public class alpha {
    public static void main(String[] args) {
        char ch = 'z';
        if (Character.isLowerCase(ch)) {
            System.out.println(ch + "->" + Character.toUpperCase(ch));
        } else if (Character.isUpperCase(ch)) {
            System.out.println(ch + "->" + Character.toLowerCase(ch));
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(i + "\t");
        }
    }
}
