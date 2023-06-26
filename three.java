public class three {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread: " + t);

        t.setName("Demo Thread");

        System.out.println("New name of the thread : " + t);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interruputed");
        }
    }
}