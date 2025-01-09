package DataAccessObject;
import java.sql.*;
import javax.swing.JOptionPane;

public class DbOperations {
    public static void setDataOrDelete(String Query, String Msg){
        try{
           Connection con = ConnectionProviderClass.getCon();
           Statement st = con.createStatement();
           st.executeUpdate(Query);
           if(!Msg.equals("")){
               JOptionPane.showMessageDialog(null, Msg);
           }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE );
        }
    }
    
    public static ResultSet getData(String query)
    {
        try{
            Connection con = ConnectionProviderClass.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs;                
        }
         catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE );
        return null;
         }
    }
}
