abstract class Demo {
        public abstract void rewrite();
        public void nrml(){
            System.out.println("I am normal");
        }
    
    
}

public class Test extends Demo{
    public void rewrite(){
        System.out.println("I am the nor normal");

    }
    public static void main(String args[]){
        Test obj = new Test();
        obj.nrml();
        obj.rewrite();
    }
}
