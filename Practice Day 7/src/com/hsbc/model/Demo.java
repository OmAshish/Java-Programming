package com.hsbc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo {
	
	public static void main(String[] args)
	{
		Employee e = new Employee(56,"ATUL", 99);
		
		try
		{
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			
			Connection con = DriverManager.getConnection("jdbc:derby:hsbc;create=true");
			
			PreparedStatement st = con.prepareStatement("insert into helloworld values(?,?,?)");
			st.setInt(1, e.getEmpid());
			st.setString(2, e.getEname());
			st.setInt(3, (int)e.getSalary());
			
			st.executeUpdate();
			st = con.prepareStatement("select * from helloworld");
			ResultSet rs = st.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getNString(2)+" "+rs.getInt(3));
			}
			
			con.close();
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}

}
