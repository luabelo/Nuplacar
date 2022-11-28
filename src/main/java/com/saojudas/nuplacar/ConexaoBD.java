package com.saojudas.nuplacar;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBD {
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "nuplacar";
    private static String usuario = "luana";
    private static String senha = "babel42";
    public static Connection obtemConexao () {
        try {
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
    public Connection obterConexao () {
        try {
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
