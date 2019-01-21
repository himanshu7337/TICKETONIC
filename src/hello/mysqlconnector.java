package hello;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author USER
 */
public class mysqlconnector {
        public Connection getConnection() throws Exception
    {
           Connection con=null;
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject1","root","root");
           return con;
    }
}
