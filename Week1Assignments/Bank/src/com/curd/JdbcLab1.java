package com.curd;
import java.sql.*;

public class JdbcLab1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root","Aparna1*");
			Statement stmt=conn.createStatement();
			String query="insert into Employee values(502,'sai',20000)";
			int rs=stmt.executeUpdate(query);
			System.out.println(rs);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

}