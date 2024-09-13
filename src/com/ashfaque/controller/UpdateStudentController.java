package com.ashfaque.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStudentController {
    public static void main(String[] args) {
        try {
            // Step-1: load/Register driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection=null;
            // Step-2: Create Connection

            String url= "jdbc:mysql://localhost:3306/jdbc-e3";
            String user= "root";
            String pass= "root";

            connection= DriverManager.getConnection(url, user, pass);
            System.out.println(connection);

            //Step-3: Create Statement
            Statement statement=connection.createStatement();

            // Step-4: Execute Query
            String updateStudentQuery="update student set name='manzil' where id=124";
            int a=statement.executeUpdate(updateStudentQuery);
            if(a!=0){
                System.out.println("Data Updated");
            }else{
                System.out.println("Data Not found");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

}
