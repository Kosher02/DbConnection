package com.company;

import com.company.data.interfaces.IDB;

import java.sql.*;

public class MySqlDB implements IDB {
    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException{
        String connectionUrl= "jdbc:postgresql://localhost:3306/assignment";
        try {
            //HERE we LOAD THE DRIVER'S CLASS FILE INTO MEMORY AT THE RUNTIME
            Class.forName("org.mysql.Driver");

            //establish the connection
            Connection con = DriverManager.getConnection(connectionUrl, "postgres","502568");
            return con;
        }
        catch (Exception e){
            System.out.println(e);
            throw e;
        }
    }
}
