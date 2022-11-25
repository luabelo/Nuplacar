package com.saojudas.nuplacar.DAO;

import com.saojudas.nuplacar.Grupo;
import com.saojudas.nuplacar.Time;
import com.saojudas.nuplacar.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GrupoDAO {

    public static ArrayList<Grupo> listarGruposCompletos(){
        ArrayList<Grupo> grupos = new ArrayList<>();
        Time time1;
        Time time2;
        Time time3;
        Time time4;

        try (
            Connection conexao = ConexaoBD.obtemConexao();
        ){
        String sql = "SELECT * FROM tb_grupos";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.execute();
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    ArrayList<Time> times = new ArrayList<>();
                    try{
                        time1 = TimeDAO.getTimePorNome(rs.getString("time1"));
                        times.add(time1);
                        time2 = TimeDAO.getTimePorNome(rs.getString("time2"));   
                        times.add(time2);
                        time3 = TimeDAO.getTimePorNome(rs.getString("time3"));   
                        times.add(time3);
                        time4 = TimeDAO.getTimePorNome(rs.getString("time4"));
                        times.add(time4);
                    }
                    catch(Exception ex) {
                        ex.printStackTrace();
                    }
                    grupos.add(new Grupo(rs.getString("idGrupo").charAt(0), times));
                }
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return grupos;
    }
}
