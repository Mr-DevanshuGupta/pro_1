// import java.sql.*;

// public class PrepStat {
//     try{

//         Class.forName("com.mysql.cj.jdbc.Driver");
//         Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Employee", "root", "Devanshu@1234");

//         PreparedStatement stmt = con.prepareStatement("insert into deva values(?,?,?)");
//         stmt.setString(1, "Ashu");
//         stmt.setString(2, "Mishra");
//         stmt.setInt(3, 102);

//         int i = stmt.executeUpdate();
//         System.out.println(i + " records inserted");

//         con.close();
//     }catch(Exception e){
//         System.out.println(e);
//     }
    
// }
