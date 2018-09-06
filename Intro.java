import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

	public class Intro {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
		       String name="Jamunath",dept="ECE";
		       int n=25;
		       try
		       {
		           Class.forName("com.mysql.jdbc.Driver");
		           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/checking","root","");
		           PreparedStatement ps=c.prepareStatement("insert into check1 values(?,?,?)");
		           ps.setInt(1, n);
		           ps.setString(2,name);
		           ps.setString(3,dept);
		           ps.executeUpdate();
		           System.out.println("inserted succesfully");
		       }
		       catch(Exception e)
		       {
		    	   System.out.println(e);
		    	   
		       }
		           
		           
		       }
	}
