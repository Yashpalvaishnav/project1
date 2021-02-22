package jdbc.project;
import java.sql.*;

public class Add{
	public static void main(String[] args) throws SQLException
	{
try {
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema?","root","root");	
  	
String s="insert into Student1_info(ID,NAME,BRANCH,MARKS,COLLAGE,PLACE,PHONE NUMBER)  values(?,?,?,?,?,?,?)";
	
	PreparedStatement stmt=con.prepareStatement(s);
	
	stmt.setInt(1, 425);
	stmt.setString(2, "gulshan");
	stmt.setString(3,"EEE");
	stmt.setDouble(4,65.0);
	stmt.setString(5,"jspiders");
	stmt.setString(6, "HBR");
	stmt.setLong(7,949372766);
	
	
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
