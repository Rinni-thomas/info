/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;

        
        

/**
 *
 * @author robinthomas
 */
public class MyConnection {
    
    public static Connection getConnection()
    {
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/infoplacement", "root","rinni" );
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
   return con;
    }
}
