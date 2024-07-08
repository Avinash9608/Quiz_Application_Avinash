
package techquizapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import techquizapp.dbutil.DBConnection;
import techquizapp.pojo.Performance;

public class PerformanceDao {
    public static void addPerformance(Performance p) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into performance values(?,?,?,?,?,?,?)");
        ps.setString(1,p.getUserId());
        ps.setString(2,p.getExamId());
        ps.setInt(3,p.getRight());
        ps.setInt(4,p.getWrong());
        ps.setInt(5,p.getUnattempted());
        ps.setDouble(6,p.getPer());
        
        ps.setString(7,p.getLanguage());
        ps.executeUpdate();
    }
    public static ArrayList<Performance> getAllData() throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ArrayList<Performance> performanceList=new ArrayList();
        ResultSet rs=st.executeQuery("select * from performance");
        while(rs.next())
        {
            String userId=rs.getString(1);
            String examId=rs.getString(2);
            int right=rs.getInt(3);
            int wrong=rs.getInt(4);
            int unattemp=rs.getInt(5);
            double per=rs.getDouble(6);
            String lang=rs.getString(7);
            Performance p=new Performance(examId,lang,userId,right,wrong,unattemp,per);
            performanceList.add(p);
        }
        return performanceList;
    }
        
}
