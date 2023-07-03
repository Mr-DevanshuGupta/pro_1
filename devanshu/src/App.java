import java.sql.*;

//import org.junit.*;

public class App {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql//localhost:3306/Employee", "root",
                    "Devanshu@1234");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from deva");
            while (rs.next())
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
