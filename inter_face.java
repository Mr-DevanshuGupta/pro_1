interface first {
    void print();
}

interface second {
    void print();
}

public class inter_face implements first {

    public void print() {
        System.out.println("Hello");
    }

    public static void main(String args[]) {
        inter_face obj = new inter_face();
        obj.print();
    }

}
