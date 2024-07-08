
package techquizapp.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBConnection {
     private static Connection conn;
    static
    {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//AvinashKumar:1521/xe","ora","123");
            JOptionPane.showMessageDialog(null,"Successfully to opening to the DB");
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null,"Error Connecting to Database","Error!",JOptionPane.ERROR_MESSAGE);
             ex.printStackTrace();
             
        }
    }
    public static Connection getConnection()

            {
                  return conn;
            }
    public static void closeConnection()
    {
      try
      {
          if(conn!=null)
       {                 
          conn.close();
          JOptionPane.showMessageDialog(null,"SuccessFully to closing to DB","Success!",JOptionPane.INFORMATION_MESSAGE);
       }
      }
      catch(Exception ex)
      {
         JOptionPane.showMessageDialog(null,"Error to closing to DB","UnSuccess!",JOptionPane.ERROR_MESSAGE);
         ex.printStackTrace();
      }
    }  
}
