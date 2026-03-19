package org.example;
import java.sql.Connection;
public class TesteConexao {
    public static void main(String[] args) {
        Connection conn = Conexao.conectar();
        if (conn != null){
            System.out.println("Conexão estabelecida");
        } else {
            System.out.println("Falha na conexão.");
        }
    }
}
