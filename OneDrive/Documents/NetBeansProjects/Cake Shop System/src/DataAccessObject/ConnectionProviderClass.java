package DataAccessObject;
import java.sql.*;

public class ConnectionProviderClass {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CafeManagementSystem?useSSL=false","root", "root1234");
            return con;
        }
            catch(Exception e){
                return null;
            }
    }
}
