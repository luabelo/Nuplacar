package com.saojudas.nuplacar.DAO;

import com.saojudas.nuplacar.Time;
import com.saojudas.nuplacar.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;

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
                    times.add(new Time(rs.getString("nome"), rs.getString("bandeira")));
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
                return new Time(rs.getString("nome"), rs.getString("bandeira"));                
            }
            catch(NullPointerException ex) {
                throw new NullPointerException("Time com o nome: " +  nome + " não foi encontrado!");
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
            String sql = "UPDATE tb_times SET pontos=?, jogos=?, vitorias=?, empates=?, derrotas=?, golPro=?, golContra=?, saldoGols=? WHERE nome=?";

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
}