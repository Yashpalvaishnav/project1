package jdbc.project;
import java.sql.DriverManager;
import java.util.Enumeration;
import java.sql.Connection;
import java.sql.*;
public class mainJdbc {

	public static void main(String[] args) throws Exception {
	//step 1//loading the drivers
		String str="com.mysql.jdbc.Driver";
		Class.forName(str);
		Enumeration obj=DriverManager.getDrivers();
		while(obj.hasMoreElements())
		{
			System.out.print(obj.nextElement());
		}
	//step2//giving the connection
		String db2="jdbc:mysql://localhost:3306/new_schema?";
		String User="root";
		String Password="root";
		Connection cb=DriverManager.getConnection(db2, User, Password);
		System.out.println(cb);
		//step3 executiing the query by statement
		Statement s=cb.createStatement();
		ResultSet r=s.executeQuery("select * from Student1_info");
		while(r.next())//retrive the object from the database.
		{
			System.out.print(r.getInt(1));
			System.out.print(r.getString("NAME"));
			System.out.print(r.getString("MARKS"));
		}
		cb.close();//close the connection
		
	}

}
