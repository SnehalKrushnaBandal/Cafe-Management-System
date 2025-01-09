package DataAccessObject;
import Model.User;
import java.sql.*;
import javax.swing.JOptionPane;

public class UserDao {
     public static void save(User user){
         String query = "insert into user(name, email, mobileNumber, address, password) values('"+user.getName()+"', '"+user.getEmail()+"', '"+user.getMobileNumber()+"', '"+user.getAddress()+"', '"+user.getPassword()+"')";
         DbOperations.setDataOrDelete(query, "Registered Successfully! Login yourself..");
     }
     
     public static User login(String email, String password){
         User user = null;
         try{
             ResultSet rs = DbOperations.getData("select * from user where email = '"+email+"' and password = '"+password+"' ");
             if(rs.next()){
                user = new User();
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                // No need to fetch or check for status anymore.
            }
         }
         catch(SQLException e){
             JOptionPane.showMessageDialog(null, e);
         }
         return user;

             
}
}