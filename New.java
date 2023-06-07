import java.util.*;

class New {
	public static void main(String args[]) {

		Student first = new Student();
		first.input();
		first.print_student();

	}
}

class Student {
	int Enrollment_number;
	String name;
	Scanner sc = new Scanner(System.in);

	public void input() {
		System.out.println("Enter your Roll number: ");
		Enrollment_number = sc.nextInt();
		System.out.println("Enter your name: ");
		name = sc.next();
	}

	public void print_student() {
		System.out.println("Hello " + name + " your enrollment number is " + Enrollment_number);
	}

}