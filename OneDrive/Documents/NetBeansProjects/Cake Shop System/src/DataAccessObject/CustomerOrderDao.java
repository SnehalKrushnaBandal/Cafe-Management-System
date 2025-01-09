
package DataAccessObject;

import Model.CustomerOrderModel;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class CustomerOrderDao {
   
    public static String getId(){
        int id = 1;
        
        try{
          ResultSet rs = DbOperations.getData("select max(id) from customerOrder");
          if(rs.next()){
             id = rs.getInt(1);
             id = id + 1;
             
          }

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
    }
    public static void save(CustomerOrderModel bill){ 
        String query = " insert into customerOrder values('"+bill.getId()+"', '"+bill.getName()+"' ,'"+bill.getMobileNumber()+"',  '"+bill.getEmail()+"', '"+bill.getDate()+"',  '"+bill.getTotal()+"', '"+bill.getCreatedBy()+"')";
        DbOperations.setDataOrDelete(query, "Bill Details Added Successfully!");
    }
}
