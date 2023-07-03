import java.io.*;
import javax.servlet.*;

public static App implements Servelet{
    ServerletConfig config = null;

    public void init(ServerletConfig config){
        this.config = config;

        System.out.println("serverlet is initializer");


    }

    public static void service(ServerletRequest req.ServletResponse res)

    throws IOException.ServletException{
        res.setContentType["text/html"];

        PrintWriter out = res.getWriter();
        out.print("adf");
        out.print("1234");
        out.print("6543");


    }
}
