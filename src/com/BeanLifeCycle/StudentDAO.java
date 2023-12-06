package com.BeanLifeCycle;

import java.sql.*;

public class StudentDAO
{
    private String driver="com.mysql.jdbc.Driver";
    private String url="jdbc:mysql://localhost:3306/jdbc_db";
    private String userName="root";
    private String password="ashutosh@rootuser159";

    public void selectAllRows() throws ClassNotFoundException, SQLException {
        System.out.println("List of all Records:");
        //load driver
        Class.forName(driver);
        //get connection
        Connection con = DriverManager.getConnection(url, userName, password);
        //execute query
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from register;");

        while (rs.next()){
            String name=rs.getString(1);
            String email=rs.getString(2);
            String password=rs.getString(3);
            String gender=rs.getString(4);
            String city=rs.getString(5);
            System.out.println(name + " " + email + " " + password + " " + gender + " " + city);
        }

        con.close();

    }
    
    public void deleteStudentRecord(String email) throws ClassNotFoundException, SQLException {
        System.out.println("Record deleted with email " + email);
        //load driver
        Class.forName(driver);
        //get connection
        Connection con = DriverManager.getConnection(url, userName, password);
        //execute query
        PreparedStatement stmt = con.prepareStatement("delete from jdbc_db.register where email = ?");
        stmt.setString(1, email);
        int status = stmt.executeUpdate();
        if(status>0) System.out.println("deleted successfully...");
        else System.out.println("failed to delete......");
        con.close();
    }
}
