import java.util.*;

class linkedlist {
    public static void main(String args[]) {
        LinkedList<Integer> LL = new LinkedList<>();

        Scanner s = new Scanner(System.in);

        int value, choice = 0, position;
        do {
            System.out.println("Menu");
            System.out.println("Enter 1 for insert a element in linked list");
            System.out.println("Enter 2 for remove a element in linked list");
            System.out.println("Enter 3 for print a linked list");
            System.out.println("Enter 4 for insert a element in begining in linked list");
            System.out.println("Enter 5 for inserting a element at a particular location");
            System.out.println("ENter the 6 removal of element in particular location: ");

            System.out.println("Enter your choice: ");

            int n = s.nextInt();

            switch (n) {
                case 1: {
                    System.out.println("Enter your element to be inserted: ");
                    int a = s.nextInt();
                    LL.add(a);
                    break;
                }
                case 2: {
                    LL.removeFirst();
                    break;
                }
                case 3: {
                    System.out.println(LL);
                    break;

                }

                case 4: {
                    System.out.println("Enter element to be inserted at beginning of liked list: ");
                    int a = s.nextInt();
                    LL.addFirst(a);
                    break;

                }
                case 5: {
                    System.out.println("enter a value: ");
                    int a = s.nextInt();
                    System.out.println("Enter a position: ");
                    int pos = s.nextInt();
                    LL.add(pos, a);
                    break;

                }
                case 6: {
                    System.out.println("Enter the position of which you want to remove: ");
                    int pos = s.nextInt();
                    LL.remove(pos);
                    break;
                }
            }
            System.out.println("Enter you choice 0 for continue and 1 for exit");
            choice = s.nextInt();

        } while (choice == 0);

    }
}