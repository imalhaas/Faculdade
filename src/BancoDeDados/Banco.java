package BancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;

public class Banco {

    public static void main(String[] args) {

        final String usuario = "postgres";
        final String senha = "Lm339966";
        final String url = "jdbc:postgresql://localhost:5432/postgres";
        final String driver = "org..Driver";

        try{

            Class.forName(driver);
            Connection conexao = DriverManager.getConnection(url, usuario, senha);

            System.out.println("Conexao realizada");
        }catch (Exception exception){
            System.out.println("Erro na conexão com o banco");
        }

    }
}
