package jdbc.project;
import java.sql.*;
public class delete 
{
	public static void main(String[] args)throws SQLException
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema?","root","root");
			String q="Delete from Student1_info where ID=420";
			PreparedStatement stmt=con.prepareStatement(q);
			stmt.executeUpdate(q);
			System.out.println("deleted successfully");
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
