package br.com.std.treinamento.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectComponent {

    public boolean tryConnection() throws Exception{

       // Class.forName("com.mysql.jdbc.Driver");
        try (Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classicmodels?user=caoliv3&password=ubuntu")){

            return conn.isValid(2);

        }
    }


}
