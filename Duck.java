class OpDuck {
    int size;

    int OpDuck() {
        System.out.println("Class Name function called.");
        return 3;
    }

    public OpDuck(int duckSize) {
        System.out.println("Quack");

        size = duckSize;

        System.out.println("Size is " + size);
    }
}

public class Duck {
    public static void main(String args[]) {
        OpDuck d = new OpDuck(42);
        d.OpDuck();
    }
}
