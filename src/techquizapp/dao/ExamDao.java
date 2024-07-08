
package techquizapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import techquizapp.dbutil.DBConnection;
import techquizapp.pojo.Exam;

public class ExamDao {
  public static String getExamId() throws SQLException
  {
      Connection conn=DBConnection.getConnection();
      Statement st=conn.createStatement();
      int count;
      ResultSet rs=st.executeQuery("select count(*) from exam");
      rs.next();
      count=rs.getInt(1);
      String newId="EX-"+(count+1);
      return newId;
  }
  public static void addExam(Exam exam) throws SQLException
  {
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("insert into exam values(?,?,?)");
     ps.setString(1,exam.getExamId());
     ps.setString(2, exam.getLanguage());
     ps.setInt(3,exam.getTotalQuestion());
     int ans=ps.executeUpdate();
     
  }
  public static ArrayList<String> getExamIdBySubject(String subject)throws SQLException
  {
      Connection conn=DBConnection.getConnection();
      PreparedStatement ps=conn.prepareStatement("select examid from exam where language=?");
      ps.setString(1, subject);
      ResultSet rs=ps.executeQuery();
      ArrayList<String> examIdList=new ArrayList<>();
      while(rs.next())
      {
          examIdList.add(rs.getString(1));
      }
      return examIdList;
  }
   public static int getQuestionCountByExam(String examId)throws SQLException
  {
      Connection conn=DBConnection.getConnection();
      PreparedStatement ps=conn.prepareStatement("select tatal_question from exam where examid=?");
      ps.setString(1, examId);
      ResultSet rs=ps.executeQuery();
      
      rs.next();
      return rs.getInt(1);
  }
     public static boolean isPaperSet(String subject)throws SQLException
  {
      Connection conn=DBConnection.getConnection();
      PreparedStatement ps=conn.prepareStatement("select 1 from exam where language=?");
      ps.setString(1,subject);
      ResultSet rs=ps.executeQuery();
      
      return rs.next();
      
  }
     public static ArrayList<String> getExamIdBySubject(String userid,String subject)throws SQLException
  {
      Connection conn=DBConnection.getConnection();
      String qry="select examid from exam where language=? minus select examid from performance where userid=?";
      PreparedStatement ps=conn.prepareStatement(qry);
      ps.setString(1, subject);
      ps.setString(2,userid);
      ResultSet rs=ps.executeQuery();
      ArrayList<String> examIdList=new ArrayList<>();
      while(rs.next())
      {
          examIdList.add(rs.getString(1));
      }
      return examIdList;
  }
}
