import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.Vector;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;

public class FileStream {
    public static void main(String args[]) {
        // try {

        // FileOutputStream fout = new FileOutputStream("test.txt");
        // BufferedOutputStream bout = new BufferedOutputStream((fout));

        // String s = "Hi i m devanshu gupta";

        // byte b[] = s.getBytes();
        // bout.write(b);
        // bout.flush();
        // bout.close();
        // System.out.println("success..");
        // } catch (Exception e) {
        // System.out.println(e);
        // }

        try {
            int i = 0;
            FileInputStream fin = new FileInputStream("test.txt");
            FileInputStream fin1 = new FileInputStream("first.txt");
            FileInputStream fin2 = new FileInputStream("second.txt");
            FileInputStream fin3 = new FileInputStream("thirs.txt");

            Vector<FileInputStream> v = new Vector<FileInputStream>();
            v.add(fin);
            v.add(fin1);
            v.add(fin2);
            v.add(fin3);

            SequenceInputStream sj = new SequenceInputStream(v.elements());

            while ((i = sj.read()) != -1) {
                System.out.print((char) i);

            }
            sj.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        // SequentialInputStream

    }
}
