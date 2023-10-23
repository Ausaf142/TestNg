package com.Woost1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;

import org.testng.annotations.Test;




public class JDBC {
@Test
public void jdbc() throws SQLException {
	Driver driver =new Driver();
	DriverManager.registerDriver(driver);
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ausaf","root","root");
	Statement stat = conn.createStatement();
//	String q = "select * from me";
	 ResultSet result = stat.executeQuery("select * from me");
	System.out.println(result.getString(1));
	
	
}
}
