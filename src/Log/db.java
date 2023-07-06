package Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//Data base connection 


public class db {
     static Connection conn;
     
    public static Connection getConnection() throws SQLException{
   
    
    try {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        //database name
        conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/empprofile", "root" ,"jamesJhon2806");
        
    } catch (Exception e) {
        
        System.out.println(e);
       
    }
    
       return conn; 
    }
    }


