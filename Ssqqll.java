import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
public class Ssqqll {

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/checking","root","");
			Statement ss=c.createStatement();
			ss.executeUpdate("insert into check1(25,'Jamunath','ECE')");
			System.out.println("Inserted Sucessfully");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
