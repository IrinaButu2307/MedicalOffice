package com.medicaloffice.service;

import java.sql.*;

public class ConnectionDB {

    public Statement statement;
    public Connection connection;
    public ConnectionDB(){
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection myconnection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/medicaloffice?serverTimezone=UTC",
                "root", "Mysql1223");
        Statement mystatement = myconnection.createStatement();

        this.statement= mystatement;
        this.connection = myconnection;

    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    }

}
