import java.util.*;

public class wrapper {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Integer obj;
        System.out.println("Enter the pricipal:");
        obj = sc.nextInt();
        Float rate;
        System.out.println("Enter the rate:");
        rate = sc.nextFloat();
        Integer time;
        System.out.println("Enter the time:");
        time = sc.nextInt();

        Float si = obj * rate * time;
        System.out.println(si / 100);

    }
}