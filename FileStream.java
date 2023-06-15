import java.io.FileOutputStream;
import java.io.FileInputStream;

public class FileStream {
    public static void main(String args[]) {
        // try {

        // FileOutputStream fout = new FileOutputStream("test.txt");

        // String s = "Hi i m devanshu gupta";

        // byte b[] = s.getBytes();
        // fout.write(b);
        // fout.close();
        // System.out.println("success..");
        // } catch (Exception e) {
        // System.out.println(e);
        // }

        try {
            int i = 0;
            FileInputStream fin = new FileInputStream("test.txt");

            while ((i = fin.read()) != -1) {
                System.out.print((char) i);

            }
            fin.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
