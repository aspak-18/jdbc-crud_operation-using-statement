package com.ashfaque.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStudentController {
	public static void main(String[] args) {
		try {
            // Step-1: load/Register driver
			Class.forName("com.mysql.cj.jdbc.Driver");

            // Step-2: Create Connection

			String url= "jdbc:mysql://localhost:3306/jdbc-e3";
			String user= "root";
			String pass= "root";
			
			Connection connection=DriverManager.getConnection(url, user, pass);
			System.out.println(connection);

            //Step-3: Create Statement
			Statement statement=connection.createStatement();

			// Step-4: Execute Query
			String insertStudentQuery="insert into student (id,name,email,dob,phone) values(126,'Ashfaque','as@gmail.com','20-01-01',123456789)";
			statement.execute(insertStudentQuery);
			System.out.println("Data Stored");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}
