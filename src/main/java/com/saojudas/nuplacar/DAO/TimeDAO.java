package com.saojudas.nuplacar.DAO;

import com.saojudas.nuplacar.ConexaoBD;
import com.saojudas.nuplacar.CRUDTime.Time;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class TimeDAO {
    
    public void cadastrarTime(Time time) {
        String sql = "INSERT INTO tb_time (nome, bandeira) values (?, ?)";
        Connection connection = new ConexaoBD().obterConexao();
        try ( PreparedStatement ps = connection.prepareStatement(sql);) {
            ps.setString(1,time.getNome());
            ps.setBytes(2,time.getBandeira());
            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
}
    
    public ArrayList<Time> obterTimes() {
        ArrayList timeList = new ArrayList<TimeDAO>();
        Connection conn = ConexaoBD.obtemConexao();
        try {
            String sql = "SELECT * FROM tb_time";
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            Time time;
            while(rs.next())
            {
            time = new Time(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getBytes(3));
            timeList.add(time);
            }                        
        } catch (Exception e){
            e.printStackTrace();
        }    
        return timeList;

        }
    
    public ArrayList<Time> obterTimeId(int id) {
        ArrayList timeList = new ArrayList<Time>();
        Connection conn = ConexaoBD.obtemConexao();
        ResultSet rs = null;
        
        try {
            String sql = "SELECT * FROM tb_time WHERE idTime = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            Time time;
            if(rs.next()) {
                time = new Time(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getBytes(3));
            timeList.add(time);
            }                           
        } catch (Exception e){
            e.printStackTrace();
        }    
        return timeList;
        }
    
    public void atualizarTime(Time time) {
        Connection conn = ConexaoBD.obtemConexao();
        ResultSet rs = null;
        
        try {
            String sql = "UPDATE tb_time SET nome = ?, bandeira = ? WHERE idTime = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1,time.getNome());
            pstm.setBytes(2,time.getBandeira());
            pstm.setInt(3,time.getIdTime());
            pstm.executeUpdate();
               
        } catch (Exception e){
            e.printStackTrace();
        }    
        }
    
    public void deletarTime(int id) {
        Connection conn = ConexaoBD.obtemConexao();
        
        try {
            String sql = "DELETE FROM tb_time WHERE idTime = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1,id);
            pstm.executeUpdate();
               
        } catch (Exception e){
            e.printStackTrace();
        }    
        }
    
     public boolean timeExiste(String nome) {
        Connection conn = ConexaoBD.obtemConexao();
        
        try {
            String sql = "SELECT * FROM tb_time WHERE nome = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, nome);
            ResultSet rs = pstm.executeQuery();
            return rs.next();

        } catch (Exception e){
            e.printStackTrace();
        }    
        return false;
    }
}
