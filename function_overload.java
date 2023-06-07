import java.util.*;

public class function_overload {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your ID: ");
        int a = sc.nextInt();
        introduce(a);

        System.out.println("Enter your name: ");
        String name = sc.next();
        introduce(name, a);

    }

    public static void introduce(int a) {
        System.out.println("Your Enrollment number is: 0827AL2010" + a);
    }

    public static void introduce(String name, int a) {
        System.out.println("Hey, " + name + " your enrollment number is: 0827AL2010" + a);
    }
}
