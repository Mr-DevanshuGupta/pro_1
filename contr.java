public class contr {
    public static void main(String args[]) {
        // Box b1 = new Box(23, 1, 4);
        System.out.println(Box.volume(1, 2, 3));
    }
}

class Box {
    int width, height, depth;

    Box(int a, int b, int c) {
        width = a;
        height = b;
        depth = c;
    }

    static int volume(int a, int b, int c) {
        return a * b * c;
    }
}