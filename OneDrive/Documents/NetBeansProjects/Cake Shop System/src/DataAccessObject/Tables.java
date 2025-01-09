package DataAccessObject;
import javax.swing.JOptionPane;
import java.lang.NullPointerException;
import java.util.Locale;
public class Tables {
    public static void main(String[] args){
         try{
             String userTable = "create table user(id int AUTO_INCREMENT primary key, name varchar(200), email varchar(200), mobileNumber varchar(10), address varchar(200), password varchar(200), UNIQUE(email))";
             String adminDetails = "insert into user(name, email, mobileNumber, address, password) values('Admin', 'admin@gmail.com', '1234567890', 'Pune', '2024')";
             String categoryTable = "create table category(id int AUTO_INCREMENT primary key, name varchar(200))";
             String productTable = "create table product(id int AUTO_INCREMENT primary key, name varchar(200), category varchar(200), price varchar(200))";
             String billTable = "create table bill(id int primary key, name varchar(200), mobileNumber varchar(200), email varchar(200), date varchar(50), total varchar(200), createdBy varchar(200))";
             
             String customerOrderTable = "create table customerOrder(id int primary key, name varchar(200), mobileNumber varchar(200), email varchar(200), date varchar(50), total varchar(200), createdBy varchar(200))";
             
             DbOperations.setDataOrDelete(userTable, "User Table Created Successfully!");
             DbOperations.setDataOrDelete(adminDetails, "Admin Details stored Successfully!");
             DbOperations.setDataOrDelete(categoryTable, "Category Table Created Successfully!");
             DbOperations.setDataOrDelete(productTable, "Product Table Created Successfully!");
             DbOperations.setDataOrDelete(billTable, "Bill Table Created Successfully!");
             
             DbOperations.setDataOrDelete(customerOrderTable, "Customer Order Table Created Successfully!");
             
         }
            catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
