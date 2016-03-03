package com.sist;
import java.sql.*;
import java.util.*;
public class EmpDAO {
   public ArrayList<EmpDTO> empAllData()
   {
	   ArrayList<EmpDTO> list=
	      new ArrayList<EmpDTO>();
	   try
	   {
		   Class.forName("oracle.jdbc.driver.OracleDriver");
		   String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		   Connection conn=
				  DriverManager.getConnection(url,"scott","tiger");
		   String sql="SELECT empno,ename,sal "
				     +"FROM emp";
		   PreparedStatement ps=conn.prepareStatement(sql);
		   ResultSet rs=ps.executeQuery();
		   while(rs.next())
		   {
			   EmpDTO d=new EmpDTO();
			   d.setEmpno(rs.getInt("empno"));
			   d.setEname(rs.getString("ename"));
			   d.setSal(rs.getInt("sal"));
			   list.add(d);
		   }
		   rs.close();
		   ps.close();
		   conn.close();
	   }catch(Exception ex)
	   {
		   System.out.println(ex.getMessage());
	   }
	   
	   return list;
   }
}
