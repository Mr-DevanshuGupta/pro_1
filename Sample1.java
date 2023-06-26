import java.util.*;

class Sample1 {
    public static void main(String s[]) throws Exception {
        Runtime rs = new Runtime.getRuntime();
        System.out.println("Free memory in JVM before collection = " + rs.freeMemory());
        rs.gc();

        System.out.println("Free memory in JVM after Garbage collection: " + rs.freeMemory);

    }
}