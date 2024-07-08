
package techquizapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import techquizapp.dbutil.DBConnection;

public class ChangePassword {
      public static boolean changePassword(String userid,String password) throws SQLException
      {
          String qry="update users set password=? where userid=?";
         
          Connection conn=DBConnection.getConnection();
          PreparedStatement ps=conn.prepareStatement(qry);
          ps.setString(1,password);
          ps.setString(2,userid);
          int ans=ps.executeUpdate();
          if(ans==0)
              return false;
          return true;
      }
}
