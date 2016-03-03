package com.sist.dao;
import java.sql.*;
import java.util.*;
//
public class EmpDAO {
     private Connection conn;
     // ������ ���� 
     private PreparedStatement ps;
     // ���� ���� 
     // �����ּ� 
     private final String URL="jdbc:oracle:thin:@localhost:1521:ORCL";
     public EmpDAO()
     {
    	 // ����Ŭ ���� ==> ����̹� ���� 
    	 try
    	 {
    		 // ������ ���� ==> �����Ͻÿ� ����ó���� Ȯ�� 
    		 Class.forName("oracle.jdbc.driver.OracleDriver");
    	 }catch(ClassNotFoundException cf)
    	 {
    		 System.out.println(cf.getMessage());
    	 }
     }
     // ����
     public void getConnection()
     {
    	 try
    	 {
    		 conn=DriverManager.getConnection(URL,"scott","tiger");
    		 // conn scott/tiger
    	 }catch(Exception ex){}
     }
     // ���� ����
     public void disConnection()
     {
    	 try
    	 {
    		 if(ps!=null) ps.close();
    		 if(conn!=null) conn.close();
    	 }catch(Exception ex){}
     }
     // �α���
     public String login(int empno,String ename)
     {
    	 String result="";
    	 try
    	 {
    		 // ����
    		 getConnection();
    		 String sql="SELECT COUNT(*) FROM emp "
    				   +"WHERE empno=?";
    		 ps=conn.prepareStatement(sql);
    		 ps.setInt(1, empno);
    		 ResultSet rs=ps.executeQuery();
    		 rs.next(); // Ŀ����ġ ���� 
    		 int count=rs.getInt(1);
    		 rs.close();
    		 if(count==0)
    		 {
    			 result="noid";
    		 }
    		 else
    		 {
    			 sql="SELECT ename FROM emp "
    			    +"WHERE empno=?";
    			 ps=conn.prepareStatement(sql);
    			 ps.setInt(1, empno);
    			 rs=ps.executeQuery();
    			 rs.next();
    			 String db_name=rs.getString(1);
    			 rs.close();
    			 if(db_name.equals(ename.toUpperCase()))
    			 {
    				 result="ok";
    			 }
    			 else
    			 {
    				 result="noname";
    			 }
    		 }
    		 
    	 }catch(Exception ex)
    	 {
    		 System.out.println(ex.getMessage());
    		 ex.printStackTrace();//������ ��� ������ ��������
    	 }
    	 finally
    	 {
    		 disConnection();
    	 }
    	 return result;
     }
     
}






