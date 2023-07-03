public class firstAndLastOccurence {
    public static void main(String args[]) {
        String str = "abaabdeklawelkj";
        firstLast(str, 0, 'a');
    }

    static int first = -1;
    static int last = -1;

    static void firstLast(String str, int idx, int element) {

        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currentchar = str.charAt(idx);
        if (currentchar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }

        firstLast(str, idx + 1, element);
    }
}
