class Thread_run extends Thread{
    public void run(){
        System.out.println("Thread is running from inheritance");
    }
}

class Thread_exp implements Runnable{
    public void run(){
        System.out.println("Thread is running from interface");
    }
}

public class thre{
    public static void main(String args[]){
        Thread_run obj1 = new Thread_run();
        obj1.start();

        Thread_exp obj2 = new Thread_exp();

        Thread t1 = new Thread(obj2);
        t1.start();
    }
}