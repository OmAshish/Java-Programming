package hsbc.com.connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
	Connection con;
	Statement st;
	PreparedStatement pst;
	
	public DBConnection() {
		// TODO Auto-generated constructor stub
		try
		{
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	public Statement getStatement()
	{
		try
		{
			con = DriverManager.getConnection("jdbc:derby:hsbc;create=true");
			
			st = con.createStatement();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return st;
	}
	
	public PreparedStatement getPreparedStatement()
	{
		try
		{
			con = DriverManager.getConnection("jdbc:derby:hsbc;create=true");
			
			pst = con.prepareStatement(sql);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return pst;
	}

}
