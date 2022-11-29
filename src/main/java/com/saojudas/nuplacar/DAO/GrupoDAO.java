package com.saojudas.nuplacar.DAO;

import com.saojudas.nuplacar.Grupo;
import com.saojudas.nuplacar.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.saojudas.nuplacar.CRUDTime.Time;
import com.saojudas.nuplacar.ConjuntoGrupos;

public class GrupoDAO {

    public static ArrayList<Grupo> listarGruposCompletos(String idConjuntoGrupos){
        ArrayList<Grupo> grupos = new ArrayList<>();
        Time time1;
        Time time2;
        Time time3;
        Time time4;

        try (
            Connection conexao = ConexaoBD.obtemConexao();
        ){
        String sql = "SELECT * FROM tb_grupos WHERE idConjuntoGrupos = ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, idConjuntoGrupos);
            ps.executeQuery();
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
    
    
     public Time[] obterTimes () throws Exception {
        String sql = "SELECT * FROM tb_time";
        try (Connection conn = ConexaoBD.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(
             sql, ResultSet.TYPE_SCROLL_INSENSITIVE, 
                  ResultSet.CONCUR_READ_ONLY); 
            ResultSet rs = ps.executeQuery()){
            int totalTimes = rs.last()? rs.getRow(): 0;
            Time[] times = new Time[totalTimes];
            rs.beforeFirst();
            int cont = 0;
            while (rs.next()) {
                int id = rs.getInt("idTime");
                String nome = rs.getString("nome");
                times[cont++] = new Time(id,nome);
            }
            return times;
        }
    }
     
     public Grupo[] obterGrupos () throws Exception {
        String sql = "SELECT * FROM tb_grupo";
        try (Connection conn = ConexaoBD.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(
             sql, ResultSet.TYPE_SCROLL_INSENSITIVE, 
                  ResultSet.CONCUR_READ_ONLY); 
            ResultSet rs = ps.executeQuery()){
            int totalGrupos = rs.last()? rs.getRow(): 0;
            Grupo[] grupos = new Grupo[totalGrupos];
            rs.beforeFirst();
            int cont = 0;
            while (rs.next()) {
                char id = rs.getString("idGrupo").charAt(0);
                String nome = rs.getString("nome");
                grupos[cont++] = new Grupo(id);
            }
            return grupos;
        }
    }
     
      public void inserirTimesGruposDB(String idGrupo, String time1, String time2, String time3, String time4, String idConjuntoGrupos) {
        String sql = "INSERT INTO tb_grupos (idGrupo, time1, time2, time3, time4, idConjuntoGrupos) values (?, ?, ?, ?, ?, ?)";
        Connection connection = new ConexaoBD().obterConexao();
        try ( PreparedStatement ps = connection.prepareStatement(sql);) {
            ps.setString(1,idGrupo);
            ps.setString(2,time1);
            ps.setString(3,time2);
            ps.setString(4,time3);
            ps.setString(5,time4);
            ps.setString(6,idConjuntoGrupos);
            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
      
      public ArrayList<Time> obterTimes(String idConjuntosGrupos, String idGrupo) {
        ArrayList timeList = new ArrayList<TimeDAO>();
        Connection conn = ConexaoBD.obtemConexao();
        try {
              String sql = "SELECT * FROM tb_grupos WHERE idConjuntoGrupos = ? AND idGrupo = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            pstm.setString(1,idConjuntosGrupos);
            pstm.setString(2,idGrupo);
            ResultSet rs = pstm.executeQuery();
            Time time1;
            Time time2;
            Time time3;
            Time time4;
            while(rs.next()) {    
        time1 = new Time(rs.getString("time1"));
            timeList.add(time1);
            time2 = new Time(rs.getString("time2"));
            timeList.add(time2);
            time3 = new Time(rs.getString("time3"));
            timeList.add(time3);
            time4 = new Time(rs.getString("time4"));
            timeList.add(time4);
            }                        
        } catch (Exception e){
            e.printStackTrace();
        }
        return timeList;
    }
       public ConjuntoGrupos[] obterConjuntoGrupos () throws Exception {
        String sql = "SELECT DISTINCT idConjuntoGrupos FROM tb_grupos";
        Connection conn = ConexaoBD.obtemConexao();
             try (
             PreparedStatement ps = conn.prepareStatement(
             sql, ResultSet.TYPE_SCROLL_INSENSITIVE, 
                  ResultSet.CONCUR_READ_ONLY); 
            ResultSet rs = ps.executeQuery()){
                 int totalConjunto = rs.last()? rs.getRow(): 0;
            ConjuntoGrupos[] conjunto = new ConjuntoGrupos[totalConjunto];
            rs.beforeFirst();
            int cont = 0;
            while (rs.next()) {
                String nome = rs.getString("idConjuntoGrupos");
                conjunto[cont++] = new ConjuntoGrupos(nome);
            }
            return conjunto;
            }
            }
}
