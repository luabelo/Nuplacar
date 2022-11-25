/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saojudas.nuplacar.DAO;

import com.saojudas.nuplacar.Grupo;
import com.saojudas.nuplacar.ConexaoBD;
import com.saojudas.nuplacar.CRUDTime.Time;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Mathe
 */
public class GrupoDAO {
    
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
                    rs.getString(3));
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
                    rs.getString(3));
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
                    rs.getString(3));
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
                    rs.getString(3));
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
                    rs.getString(3));
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
                    rs.getString(3));
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
                    rs.getString(3));
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
                    rs.getString(3));
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
                int id = rs.getInt("idGrupo");
                String nome = rs.getString("nome");
                grupos[cont++] = new Grupo(id,nome);
            }
            return grupos;
        }
    
    }
}
