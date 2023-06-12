import java.util.*;

public class hashset {
    public static void main(String args[]) {
        HashSet<String> set = new HashSet();

        set.add("My");
        set.add("Name");
        set.add("is");
        set.add("Devanshu");
        set.add("Gupta");

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
