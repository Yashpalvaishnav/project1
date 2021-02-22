package jdbc.project;
import java.sql.*;
import java.io.*;
public class update 
{
	public static void main(String args[])
	{
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema?","root","root");	
	  	
		String s="update Student1_info set NAME=? , MARKS=? ,COLLAGE=? where ID=?";
		
	  	BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the new name:");
		String NAME=Br.readLine();
		
		System.out.println("Enter the Marks:");
		Double MARKS=Double.parseDouble(Br.readLine());
		
		System.out.println("Enter the Collage");
		String COLLAGE=Br.readLine();
		
		System.out.println("Enter the id:");
		Integer ID=Integer.parseInt(Br.readLine());
		
		PreparedStatement stmt=con.prepareStatement(s);
		
		stmt.setString(1, NAME);
		
		stmt.setDouble(2, MARKS);
		
		stmt.setString(3, COLLAGE);
		stmt.setInt(4, ID);
		stmt.executeUpdate();
		System.out.println("done...................");
		
		con.close();
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	 

}
}
