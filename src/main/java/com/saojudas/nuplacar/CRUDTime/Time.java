package com.saojudas.nuplacar.CRUDTime;

import com.saojudas.nuplacar.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Time {
    private int idTime;
    private String nome;
    private byte[] bandeira;
    private String tipo;

    public Time(int idTime, String nome, byte[] bandeira) {
        this.idTime = idTime;
        this.nome = nome;
        this.bandeira = bandeira;
    }
    
    public Time() {
    }
    
    public Time(int idTime, String nome) {
        this.idTime = idTime;
        this.nome = nome;
    }
    
    public Time (String nome, byte[] bandeira) {
        this.nome = nome;
        this.bandeira = bandeira;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdTime() {
        return idTime;
    }

    public void setIdTime(int idTime) {
        this.idTime = idTime;
    }    

    public byte[] getBandeira() {
        return bandeira;
    }
      
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void cadastrarTime() {
        String sql = "INSERT INTO tb_time (nome, bandeira) values (?, ?)";
        Connection connection = new ConexaoBD().obterConexao();
        try ( PreparedStatement ps = connection.prepareStatement(sql);) {
            ps.setString(1,nome);
            ps.setBytes(2,bandeira);
            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
}
    
    public ArrayList<Time> ObterTimes() {
        ArrayList timeList = new ArrayList<Time>();
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
    
    @Override
    public String toString () {
        return nome;
    }
}
