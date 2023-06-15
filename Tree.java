import java.util.*;

public class Tree {
    public static void main(String args[]) {

        TreeSet<Integer> ht = new TreeSet<Integer>();
        ht.add(23);
        ht.add(56);
        ht.add(23);
        ht.add(8);

        System.out.println(ht);
        ht.remove(23);
        System.out.println(ht);

        TreeSet<Integer> ht1 = new TreeSet<Integer>();

        ht1.add(12);
        ht1.add(67);
        System.out.println("New tree set" + ht1);
        ht.addAll(ht1);
        System.out.println("Merge Tree set " + ht);
        ht.removeAll(ht1);
        System.out.println(ht);
        ht.clear();
        System.out.println("Final List " + ht);

    }
}
