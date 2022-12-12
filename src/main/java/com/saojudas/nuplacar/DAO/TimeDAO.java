package com.saojudas.nuplacar.DAO;

import com.saojudas.nuplacar.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.saojudas.nuplacar.CRUDTime.Time;

public class TimeDAO {

    public static ArrayList<Time> listarTimes(){
        ArrayList<Time> times = new ArrayList<>();
        try (
            Connection conexao = ConexaoBD.obtemConexao();
        ){
            String sql = "SELECT * FROM tb_times";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.execute();
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    times.add(new Time(
                            rs.getString("nome"),
                            rs.getBytes("bandeira")));
                }
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return times;
    }
    
    public static Time getTimePorNome(String nome) throws Exception{
        try (
            Connection conexao = ConexaoBD.obtemConexao();
        ){
            String sql = "SELECT * FROM tb_times WHERE nome = ?";

            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setString(1, nome);

            try (ResultSet rs = ps.executeQuery()){
                rs.next();
                return new Time(
                        rs.getString("nome"), 
                        rs.getBytes("bandeira"));                
            }
            catch(NullPointerException ex) {
                throw new NullPointerException(
                        "Time com o nome: " +  nome + " não foi encontrado!");
            }
        }
        catch(Exception ex) {
            throw ex;
        }
    }

    public static void atualizaStatus(Time time) {
        try (
            Connection conexao = ConexaoBD.obtemConexao();
        ){
            String sql = """
                        UPDATE tb_times 
                        SET 
                            pontos=?, 
                            jogos=?,
                            vitorias=?, 
                            empates=?, 
                            derrotas=?, 
                            golPro=?, 
                            golContra=?, 
                            saldoGols=? 
                        WHERE nome=?
                        """;

            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setInt(1, time.getPontos());
            ps.setInt(2, time.getJogos());
            ps.setInt(3, time.getVitorias());
            ps.setInt(4, time.getEmpates());
            ps.setInt(5, time.getDerrotas());
            ps.setInt(6, time.getGolPro());
            ps.setInt(7, time.getGolContra());
            ps.setInt(8, time.getSaldoGols());
            ps.setString(9, time.getNome());

            ps.execute();
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void zerarClassificacaoGeral() {
        try (
            Connection conexao = ConexaoBD.obtemConexao();
        ){
            String sql = """
                        UPDATE 
                            tb_times 
                        SET 
                            pontos = 0, 
                            jogos = 0, 
                            vitorias = 0, 
                            empates = 0,
                            derrotas = 0,
                            golPro = 0,
                            golContra = 0, 
                            saldoGols = 0
                        """;

            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.execute();
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    public void cadastrarTime(Time time) {
        String sql = "INSERT INTO tb_times (nome, bandeira) values (?, ?)";
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
            String sql = "SELECT * FROM tb_times";
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
    
    public ArrayList<Time> obterTimeId(int id) {
        ArrayList timeList = new ArrayList<Time>();
        Connection conn = ConexaoBD.obtemConexao();
        ResultSet rs = null;
        
        try {
            String sql = "SELECT * FROM tb_times WHERE idTime = ?";
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
            String sql = """
                         UPDATE tb_times 
                         SET 
                            nome = ?
                         WHERE idTime = ?
                         """;
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1,time.getNome());
            pstm.setInt(2,time.getIdTime());
            pstm.executeUpdate();
               
        } catch (Exception e){
            e.printStackTrace();
        }    
    }
    
    public void deletarTime(int id) {
        Connection conn = ConexaoBD.obtemConexao();
        
        try {
            String sql = "DELETE FROM tb_times WHERE idTime = ?";
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
            String sql = "SELECT * FROM tb_times WHERE nome = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, nome);
            ResultSet rs = pstm.executeQuery();
            return rs.next();

        } catch (Exception e){
            e.printStackTrace();
        }    
        return false;
    }
     
    
    public ArrayList<Time> listarRankTimes(){
        ArrayList<Time> times = new ArrayList<>();
        try (
            Connection conexao = ConexaoBD.obtemConexao();
        ){
            String sql = "SELECT * FROM tb_times";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.execute();
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    times.add(new Time(
                            rs.getString("nome"),
                            rs.getInt("pontos"),
                            rs.getInt("jogos"),
                            rs.getInt("vitorias"),
                            rs.getInt("empates"),
                            rs.getInt("derrotas"),
                            rs.getInt("golPro")
                            ));
                }
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return times;
    }
    
    public String getCampeao(){   
    String returned = null;
    try {
        Connection conexao = ConexaoBD.obtemConexao();
        String sql = "SELECT nome, pontos FROM tb_times WHERE pontos = (SELECT MAX(pontos) FROM tb_times)";
        PreparedStatement pstm = conexao.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        while(rs.next())
        {
            returned = rs.getString("nome");
        }
    } catch (Exception e){
    }
    return returned;
    }
    
    public String getJogosCampeao(String campeao){   
    String returned = null;
    try {
        Connection conexao = ConexaoBD.obtemConexao();
        String sql = "SELECT jogos FROM tb_times WHERE nome = ?";
        PreparedStatement pstm = conexao.prepareStatement(sql);
        pstm.setString(1, campeao);
        ResultSet rs = pstm.executeQuery();
        while(rs.next())
        {
            returned = rs.getString("jogos");
        }
    } catch (Exception e){
    }
    return returned;
    }
    
    public String getVitoriasCampeao(String campeao){   
    String returned = null;
    try {
        Connection conexao = ConexaoBD.obtemConexao();
        String sql = "SELECT vitorias FROM tb_times WHERE nome = ?";
        PreparedStatement pstm = conexao.prepareStatement(sql);
        pstm.setString(1, campeao);
        ResultSet rs = pstm.executeQuery();
        while(rs.next())
        {
            returned = rs.getString("vitorias");
        }
    } catch (Exception e){
    }
    return returned;
    }
        
    public String getDerrotasCampeao(String campeao){   
    String returned = null;
    try {
        Connection conexao = ConexaoBD.obtemConexao();
        String sql = "SELECT derrotas FROM tb_times WHERE nome = ?";
        PreparedStatement pstm = conexao.prepareStatement(sql);
        pstm.setString(1, campeao);
        ResultSet rs = pstm.executeQuery();
        while(rs.next())
        {
            returned = rs.getString("derrotas");
        }
    } catch (Exception e){
    }
    return returned;
    }
    
    public String getEmpatesCampeao(String campeao){   
    String returned = null;
    try {
        Connection conexao = ConexaoBD.obtemConexao();
        String sql = "SELECT empates FROM tb_times WHERE nome = ?";
        PreparedStatement pstm = conexao.prepareStatement(sql);
        pstm.setString(1, campeao);
        ResultSet rs = pstm.executeQuery();
        while(rs.next())
        {
            returned = rs.getString("empates");
        }
    } catch (Exception e){
    }
    return returned;
    }
    
    public String getGolsCampeao(String campeao){   
    String returned = null;
    try {
        Connection conexao = ConexaoBD.obtemConexao();
        String sql = "SELECT golPro FROM tb_times WHERE nome = ?";
        PreparedStatement pstm = conexao.prepareStatement(sql);
        pstm.setString(1, campeao);
        ResultSet rs = pstm.executeQuery();
        while(rs.next())
        {
            returned = rs.getString("golPro");
        }
    } catch (Exception e){
    }
    return returned;
    }
    
}


