package com.demo2project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class CreateTableIntoDtabase {
	public static void main(String[] args) throws SQLException {
		//Step 1:-Create the object for Db driver class
	 Driver dbdriver = new Driver();
		Connection con=null;
		//Step 2:-Register the driver to the JDBC
		DriverManager.registerDriver(dbdriver);
		
		//Step 3:-Establish the connection
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cu", "root", "root");
		//Step 4:-Create Statement 
		Statement state = con.createStatement();
		//Step 5:- Execute the query
		String query = "create table Centurian_University(empName varchar(20) not null,empid int(4) not null unique,Phone_no int(10) not null unique,Address varchar(60));";
		state.executeUpdate(query);
		System.out.println("Data successfully added");
		
		//Step 6:-Close connection.
		con.close();
		System.out.println("connection closed");
	}

}
