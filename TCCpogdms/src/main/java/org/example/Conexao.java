package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexao {
    public static Connection conectar(){
        try {
            final String url = "jdbc:sqlite:identifier.sqlite";
            Connection conn = DriverManager
                    .getConnection(url);
            return conn;
        } catch (SQLException e) {
            System.out.println("Erro de conexão "+ e.getMessage());
            return null;
        }
    }
}