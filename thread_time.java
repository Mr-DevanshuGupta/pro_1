public class thread_time {
    public static void main(String args[]) {
        thread_Dev obj1 = new thread_Dev();
        thread_Dev obj2 = new thread_Dev();
        obj1.start();
        obj2.start();
    }

}

class thread_Dev extends Thread {
    public void run() {
        try {

            for (int i = 0; i < 3; i++) {

                System.out.println("i am running");
                System.out.println("Now i am stopping");
                Thread.sleep(3000);
            }

            // for (int i = 0; i < 5; i++) {
            // Thread.sleep(5000);

            // System.out.println(i);
            // }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
