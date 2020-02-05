
package opmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DataBase {
   Connection conn = null;
    
    public static Connection DBconnect(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("LOAD DRIVER");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/opmanager","root","apple@1234");
            System.out.println("SUCCESS DATABASE");
            return conn;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    } 
}
