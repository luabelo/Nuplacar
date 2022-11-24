/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saojudas.nuplacar.CRUDTime;

import com.saojudas.nuplacar.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Mathe
 */
public class Time {
    private int idTime;
    private String nome;
    private String bandeira;

    public Time(int idTime, String nome, String bandeira) {
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
    
    public Time (String nome, String bandeira) {
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


    public String getBandeira() {
        return "./bandeiras/" + nome + ".png";
    }
    
    public void cadastrarTime() {
        String sql = "INSERT INTO tb_time (nome, bandeira) values (?, ?)";
        Connection connection = new ConexaoBD().obterConexao();
        try ( PreparedStatement ps = connection.prepareStatement(sql);) {
            ps.setString(1,nome);
            ps.setString(2,bandeira);
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
                    rs.getString(3));
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
