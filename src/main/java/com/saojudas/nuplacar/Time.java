/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saojudas.nuplacar;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
}
