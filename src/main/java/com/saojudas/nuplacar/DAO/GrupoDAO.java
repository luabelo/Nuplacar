package com.saojudas.nuplacar.DAO;

import com.saojudas.nuplacar.Grupo;
import com.saojudas.nuplacar.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.saojudas.nuplacar.CRUDTime.Time;

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
    
    public ArrayList<Time> addTimesA() {
        ArrayList timesList = new ArrayList<Time>();
        Connection conn = ConexaoBD.obtemConexao();
        ResultSet rs = null;
        
        try {
            String sql = "SELECT * FROM tb_time WHERE idGrupo = 1";
            PreparedStatement pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            Time time;
            while(rs.next())
            {
            time = new Time(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getBytes(3));
            timesList.add(time);
            }                        
        } catch (Exception e){
            e.printStackTrace();
        }    
        return timesList;
        }
    
    public ArrayList<Time> addTimesB() {
        ArrayList timesList = new ArrayList<Time>();
        Connection conn = ConexaoBD.obtemConexao();
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM tb_time WHERE idGrupo = 2";
            PreparedStatement pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            Time time;
            while(rs.next())
            {
            time = new Time(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getBytes(3));
            timesList.add(time);
            }                        
        } catch (Exception e){
            e.printStackTrace();
        }    
        return timesList;
        }
    
    public ArrayList<Time> addTimesC() {
        ArrayList timesList = new ArrayList<Time>();
        Connection conn = ConexaoBD.obtemConexao();
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM tb_time WHERE idGrupo = 3";
            PreparedStatement pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            Time time;
            while(rs.next())
            {
            time = new Time(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getBytes(3));
            timesList.add(time);
            }                        
        } catch (Exception e){
            e.printStackTrace();
        }    
        return timesList;
        }
    
    public ArrayList<Time> addTimesD() {
        ArrayList timesList = new ArrayList<Time>();
        Connection conn = ConexaoBD.obtemConexao();
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM tb_time WHERE idGrupo = 4";
            PreparedStatement pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            Time time;
            while(rs.next())
            {
            time = new Time(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getBytes(3));
            timesList.add(time);
            }                        
        } catch (Exception e){
            e.printStackTrace();
        }    
        return timesList;
        }
    
    public ArrayList<Time> addTimesE() {
        ArrayList timesList = new ArrayList<Time>();
        Connection conn = ConexaoBD.obtemConexao();
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM tb_time WHERE idGrupo = 5";
            PreparedStatement pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            Time time;
            while(rs.next())
            {
            time = new Time(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getBytes(3));
            timesList.add(time);
            }                        
        } catch (Exception e){
            e.printStackTrace();
        }    
        return timesList;
        }
    
    public ArrayList<Time> addTimesF() {
        ArrayList timesList = new ArrayList<Time>();
        Connection conn = ConexaoBD.obtemConexao();
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM tb_time WHERE idGrupo = 6";
            PreparedStatement pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            Time time;
            while(rs.next())
            {
            time = new Time(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getBytes(3));
            timesList.add(time);
            }                        
        } catch (Exception e){
            e.printStackTrace();
        }    
        return timesList;
        }
    
    public ArrayList<Time> addTimesG() {
        ArrayList timesList = new ArrayList<Time>();
        Connection conn = ConexaoBD.obtemConexao();
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM tb_time WHERE idGrupo = 7";
            PreparedStatement pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            Time time;
            while(rs.next())
            {
            time = new Time(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getBytes(3));
            timesList.add(time);
            }                        
        } catch (Exception e){
            e.printStackTrace();
        }    
        return timesList;
        }
    
    public ArrayList<Time> addTimesH() {
        ArrayList timesList = new ArrayList<Time>();
        Connection conn = ConexaoBD.obtemConexao();
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM tb_time WHERE idGrupo = 8";
            PreparedStatement pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            Time time;
            while(rs.next())
            {
            time = new Time(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getBytes(3));
            timesList.add(time);
            }                        
        } catch (Exception e){
            e.printStackTrace();
        }    
        return timesList;
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
}
