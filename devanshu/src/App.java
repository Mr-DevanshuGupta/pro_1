import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.*;

public class App {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbs.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql//localhost:3306/Demo", "root" , "Devanshu@123" );

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from emp");
            while(rs.next())
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
            con.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}
