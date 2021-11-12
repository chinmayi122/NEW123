package Databasetest;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	import com.mysql.cj.jdbc.Driver;

	public class nonSelectQuerry {

		public static void main(String[] args) throws SQLException {
			Connection con =null;
		try {	
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "root");
			Statement state = con.createStatement();
		int result =state.executeUpdate("insert into student (regno,first_name,last_name,email)values(18,'rlila','cham','rohan97@gmail.com')");
		//	int result=state.executeUpdate(querry);
		//	System.out.println(result);
			
			if(result==1) {
				System.out.println("student is successfully created--!");
				
			}
			}catch(Exception e) {
				System.out.println("not created");

		}finally {
			con.close();
		}
	}
		


	}	
	