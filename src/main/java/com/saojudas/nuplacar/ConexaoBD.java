package com.saojudas.nuplacar;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBD {
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "nuplacar";
    private static String usuario = "root";
    private static String senha = "root";
    public static Connection obtemConexao () {
        try {
            //Connection c = DriverManager.getConnection(
            //"jdbc:mysql://" + host + ":" + porta + "/" + bd, usuario, senha);
            
            //Connection c = DriverManager.getConnection("jdbc:mysql//" + host + ":" + porta + "/" + bd + "?user="+usuario+"&password="+senha+"&useTimezone=true&serverTimezone=America/Sao_Paulo");
            
            String url = String.format(
                "jdbc:mysql://%s:%s/%s?useTimezone=true&serverTimezone=UTC",
                host, porta, db
            );
            Connection c = DriverManager.getConnection(url, usuario, senha);
            return c;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
