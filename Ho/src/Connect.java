/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subramaniam
 */
import java.sql.*;
import javax.swing.*;
public class Connect {
     Connection con=null;
   
        public static Connection ConnectDB(){
            
        try{
            
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://C://Users//subu star//Desktop//Ho//HMS_DB.accdb"); 
            return con;
            
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           return null;
    
    }      
}
}
