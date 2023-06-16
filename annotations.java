import java.io.*;

class message {
    void fun() {
        System.out.println("I am the base class");
    }
}

public class annotations extends message {
    @Override
    void Fun() {
        System.out.println("I am the derived class");

    }

    public static void main(String args[]) {
        // Annotations start with @

        annotations an = new annotations();
        an.fun();

    }
}
