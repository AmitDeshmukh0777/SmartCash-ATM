package bank.atm.simulation;

import java.sql.*;
public class _Con {
    Connection connection;
    Statement statement;
    public _Con(){
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","123456");
            statement=connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new _Con();
    }
}
