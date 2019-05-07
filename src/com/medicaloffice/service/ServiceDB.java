package com.medicaloffice.service;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ServiceDB extends ConnectionDB {
    private static ServiceDB ourInstance = new ServiceDB();

    public static ServiceDB getInstance() {
        return ourInstance;
    }

    private ServiceDB() {
    }


    public void insertPillDB() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("INSERT Pill id : ");
        int id = Integer.parseInt(br.readLine());
        System.out.println("INSERT Pill name : ");
        String name = br.readLine();
        System.out.println("INSERT Pill prospect : ");
        String prospect = br.readLine();

        try {
            Statement statement = connection.createStatement();
            statement.execute("insert into pills(id, name, prospect) values (" + id + ", '" + name + "', '" + prospect + "')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void selectPillsBD() throws SQLException {
        ResultSet resultSet = statement.executeQuery(" select * from pills");


        ResultSetMetaData resultSetMetaData = (ResultSetMetaData) resultSet.getMetaData();

        while (resultSet.next()) {
            System.out.println("id=" + resultSet.getInt(1)
                    + ", name=" + resultSet.getString(2)
                    + ", prospect=" + resultSet.getString(3));
        }
    }

    public void updatePillsBD_byId() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("UPDATE  WHERE Pill id : ");
        int id = Integer.parseInt(br.readLine());
        System.out.println("UPDATE Pill name : ");
        String name = br.readLine();
        System.out.println("UPDATE Pill prospect : ");
        String prospect = br.readLine();

        String sql = "update pills set name=?, prospect=? where id=" + id;
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            // parameter index marcheaza datele aflate dupa set
            //, nu coloanele din tabel
            pst.setString(1, name);
            pst.setString(2, prospect);
            pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void deletePillsBD_byName() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("DELETE  WHERE Pill name = ");
        String name = br.readLine();

        String sql = "delete from pills where name=?";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            // "...name="+name nu a functionat
            // varianta alternativa
            // fixez pe poz 1 a semului intrebarii valoarea lui name
            pst.setString(1, name);
            pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    //--------------------- Patient
    public void insertPatientDB(String cnp, String name, String telephone, int age) throws IOException, SQLException {


        Statement statement = null;
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        statement.execute("insert into patients(cnp, name, telephone, age) values (" + cnp + ", '" + name + "', '" + telephone + "', "+age+")");

    }

    public void selectPatientsBD() throws SQLException {
        ResultSet resultSet = statement.executeQuery(" select * from patients");

//TODO more complex select
        ResultSetMetaData resultSetMetaData = (ResultSetMetaData) resultSet.getMetaData();

        while (resultSet.next()) {
            System.out.println("cnp=" + resultSet.getInt(2)
                    + ", name=" + resultSet.getString(3)
                    + ", telephone=" + resultSet.getString(4)
                    + ", age=" + resultSet.getString(5));
        }
    }

    public void updatePatientBD_byName(String name, String telephone) throws IOException {

        String sql = "update patients set telephone=? where name='" + name + "'";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, telephone);
            pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void deletePatientBD_byName(String name) throws IOException {

        String sql = "delete from patients where name=?";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            // "...name="+name nu a functionat
            // varianta alternativa
            // fixez pe poz 1 a semului intrebarii valoarea lui name
            pst.setString(1, name);
            pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
