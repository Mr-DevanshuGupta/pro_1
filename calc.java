import java.util.*;

//sc.next().charAt(0);
class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an operation to do\n");
        System.out.println(
                "(1) addition \n(2) subtraction \n(3) multiplication \n(4) division \n(5) square root \n(6) power\n(7) Log\n(8) Sin\n(9) Sin inverse \n(10) Cos\n(11) Cos inverse\n(12) Tan\n(13) Tan inverse \n");
        System.out.println("Choose the index number: ");
        char a = sc.next().charAt(0);
        char b;
        char c;
        while (Character.isLetter(a)) {
            System.out.println("Wrong input");
            System.out.println("Choose the number from given value: ");
            a = sc.next().charAt(0);
        }

        System.out.println("Enter the first number: ");
        b = sc.next().charAt(0);
        while (Character.isLetter(b)) {
            System.out.println("Wrong input");
            System.out.println("Please enter the correct input");
            b = sc.next().charAt(0);
        }
        System.out.println("Enter the second number:");
        c = sc.next().charAt(0);

        while (Character.isLetter(c)) {
            System.out.println("Wrong input");
            System.out.println("Please enter the correct input");
            c = sc.next().charAt(0);
        }
        // } else {
        // System.out.println("Enter the number: ");
        // b = sc.nextInt();
        // }
        int d = a - '0';
        int be = b - '0';
        int ce = Integer.parseInt(String.valueOf(c));
        // int result;
        System.out.println(be + " " + ce);
        switch (d) {
            case 1:
                System.out.println("Addition of given two number is: " + (be + ce));
                break;
            case 2:
                System.out.println("Subtraction of given two number is: " + (be - ce));
                break;
            case 3:
                System.out.println("Multiplication of given two number is: " + (be * ce));
                break;
            case 4:
                System.out.println("Division of given two number is: " + (be / ce));
                break;
            case 5:
                System.out.println("Square root of given number is: " + Math.sqrt(be));
                break;
            case 6:
                System.out.println("result of given two number is: " + Math.pow(be, ce));
                break;
            case 7:
                System.out.println("Logarithm of value is : " + Math.log(be));
                break;
            case 8:
                System.out.println("Sin value of give number is: " + Math.sin(be));
                break;
            case 9:
                System.out.println("Sin inverse value of given number is: " + Math.asin(be));
                break;
            case 10:
                System.out.println("Cos value of given number is: " + Math.cos(be));
                break;
            case 11:
                System.out.println("Cos inverse value of given number is: " + Math.acos(be));
                break;
            case 13:
                System.out.println("tan inverse value of given number is: " + Math.atan(be));
                break;
            default:
                System.out.println("Please choose within the boundary:");
                break;
        }
    }
}
