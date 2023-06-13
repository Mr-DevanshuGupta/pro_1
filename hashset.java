import java.util.*;

public class hashset {
    public static void main(String args[]) {
        HashSet<String> set = new HashSet();

        set.add("Devanshu");
        set.add("Muttu");
        set.add("Raj");
        set.add("Devanshu");
        set.add("Raj");

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
