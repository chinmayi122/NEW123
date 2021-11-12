package Databasetest;

import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class selectQuerry{

	public static void main(String[] args) throws SQLException {
		  Connection con=null;
		try {
		//step :1 load /register the driver for specific database
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		  //step 2  : connect to db
       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "root");
       
       //step 3: create/ issue sql statement 
        Statement state = con.createStatement();
        
      // step-4: execute query
      ResultSet set = state.executeQuery("SELECT * FROM student");
        while(set.next())
        {
        	System.out.println(set.getString(1)+"\t" + set.getString(2)+   "\t" +set.getString(3)+ "\t" +set.getString(4))  ;
        	
        }
        
		}catch(Exception e) 
		{
			
		}finally {
		//verify
        //step-5  : close the connection
        con.close();
		}
	}

}
