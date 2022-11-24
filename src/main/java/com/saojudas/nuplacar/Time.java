/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saojudas.nuplacar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.saojudas.nuplacar.DAO.TimeDAO;

/**
 *
 * @author Mathe
 */
public class Time {
    private String nome;
    private String bandeira;
    private int pontos;
    private int jogos;
    private int vitorias;
    private int empates;
    private int derrotas;
    private int golPro;
    private int golContra;
    private int saldoGols;

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getJogos() {
        return jogos;
    }

    public void setJogos(int jogos) {
        this.jogos = jogos;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getGolPro() {
        return golPro;
    }

    public void setGolPro(int golPro) {
        this.golPro = golPro;
    }

    public int getGolContra() {
        return golContra;
    }

    public void setGolContra(int golContra) {
        this.golContra = golContra;
    }

    public int getSaldoGols() {
        return saldoGols;
    }

    public void setSaldoGols(int saldoGols) {
        this.saldoGols = saldoGols;
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

    public void ganhouPartida(int gols) {
        setGolPro(getGolPro() + gols);
        setVitorias(getVitorias() + 1);
        setPontos(getPontos() + 3);
        setJogos(getJogos() + 1);
        setSaldoGols(getSaldoGols() + gols);
        TimeDAO.atualizaStatus(this);
    }

    public void perdeuPartida(int gols) {
        setGolPro(getGolPro() + gols);
        setDerrotas(getDerrotas() + 1);
        setJogos(getJogos() + 1);
        setSaldoGols(getSaldoGols() + gols);
        TimeDAO.atualizaStatus(this);
    }

    public void empatouPartida(int gols) {
        setGolPro(getGolPro() + gols);
        setEmpates(getEmpates() + 1);
        setPontos(getPontos() + 1);
        setJogos(getJogos() + 1);
        setSaldoGols(getSaldoGols() + gols);
        TimeDAO.atualizaStatus(this);
    }
}
