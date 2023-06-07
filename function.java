class base {
    public void pr_int() {
        System.out.println("I am the base class");
    }
}

class derived extends base {
    public void pr_int() {
        super.pr_int();
        System.out.println("I am the derived class");
    }
}

public class function {

    public static void main(String args[]) {
        base B = new derived();
        B.pr_int();
e
        // base B = new base();
        // B.pr_int();
        // B.pr_int();

    }

}
