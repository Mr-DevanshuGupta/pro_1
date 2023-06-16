import java.util.*;

public class wrap {
    Integer i;
    int j;

    public static void main(String args[]) {
        wrap w = new wrap();
        w.go();
        Date today = new Date();
        String.format("%tA, %tB %td", today);
        System.out.println(today);
    }

    public void go() {
        i = j;
        System.out.println(j);
        System.out.println(i);

    }
}
