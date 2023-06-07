import java.util.*;

public class pbl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l, b;
        float r;
        int a;
        System.out.println("Enter the length and breadth of a rectangle:");
        l = sc.nextInt();
        b = sc.nextInt();
        area(l, b);

        System.out.println("Enter the radius of a circle: ");
        r = sc.nextFloat();
        area(r);

        System.out.println("Enter the side of square: ");
        a = sc.nextInt();
        area(a);

    }

    public static void area(int l, int b) {
        System.out.println("The area of rectangle is " + l * b);
    }

    public static void area(int s) {
        System.out.println("The area of square is " + s * s);
    }

    public static void area(float f) {
        double rea = 3.14 * f * f;
        System.out.println("The area of circle is " + rea);
    }
}
