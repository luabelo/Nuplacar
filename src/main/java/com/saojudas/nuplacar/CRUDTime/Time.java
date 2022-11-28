package com.saojudas.nuplacar.CRUDTime;

import com.saojudas.nuplacar.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.saojudas.nuplacar.DAO.TimeDAO;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Time {
    private int idTime;
    private String nome;
    private byte[] bandeira;
    private String tipo;
    
    private int pontos;
    private int jogos;
    private int vitorias;
    private int empates;
    private int derrotas;
    private int golPro;
    private int golContra;
    private int saldoGols;

    public Time() {
    }
    
    public Time(String nome) {
        this.nome = nome;
    }

    public Time (String nome, byte[] bandeira) {
        this.nome = nome;
        this.bandeira = bandeira;
    }
    
    public Time(int idTime, String nome) {
        this.idTime = idTime;
        this.nome = nome;
    }
    
    public Time(int idTime, String nome, byte[] bandeira) {
        this.idTime = idTime;
        this.nome = nome;
        this.bandeira = bandeira;
    }

    public int getIdTime() {
        return idTime;
    }

    public void setIdTime(int idTime) {
        this.idTime = idTime;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public byte[] getBandeira() {
        return bandeira;
    }
    
    public void setBandeira(byte[] bandeira) {
        this.bandeira = bandeira;
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
                    rs.getInt("idTime"),
                    rs.getString("nome"),
                    rs.getBytes("bandeira"));
            timeList.add(time);
            }                        
        } catch (Exception e){
            e.printStackTrace();
        }    
        return timeList;

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
    
    @Override
    public String toString() {
    return nome;
    }
}
