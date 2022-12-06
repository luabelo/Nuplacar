package com.saojudas.nuplacar.DAO;


import com.saojudas.nuplacar.Campeonato;
import com.saojudas.nuplacar.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CampeonatoDAO {
    public static void inserir(String idConjuntoGrupos) {
        try (
            Connection conexao = ConexaoBD.obtemConexao();
        ){
            String sql = """
                        INSERT INTO tb_campeonatos (
                            idConjuntoGrupos,
                            finalizado
                        )
                        VALUES (
                            ?,
                            false
                        )
                        """;

            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, idConjuntoGrupos);
            ps.execute();
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private static int idCampeonatoMaisRecente() {
        try (
            Connection conexao = ConexaoBD.obtemConexao();
        ){
            String sql = "SELECT idCampeonato FROM tb_campeonatos ORDER BY idCampeonato DESC";

            PreparedStatement ps = conexao.prepareStatement(sql);

            try (ResultSet rs = ps.executeQuery()){
                rs.next();
                return rs.getInt("idCampeonato");
            }
            catch(NullPointerException ex) {
            }
            return -1;
        }
        catch(Exception ex) {
            return -1;
        }
    }
    
    public static void finalizar(int idCampeonato) {
        try (
            Connection conexao = ConexaoBD.obtemConexao();
        ){
            String sql = """
                        UPDATE tb_campeonatos 
                        SET finalizado = true
                        WHERE idCampeonato = ?
                        """;

            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, idCampeonato);
            ps.execute();
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    public static int criar(String idConjuntoGrupos) {
        inserir(idConjuntoGrupos);
        return idCampeonatoMaisRecente();
    }
    
    public static int getIdUltimoCampeonatoFinalizado() {
        try (
            Connection conexao = ConexaoBD.obtemConexao();
        ){
            String sql = "SELECT idCampeonato, idConjuntoGrupos FROM tb_campeonatos WHERE finalizado = true ORDER BY idCampeonato DESC";

            PreparedStatement ps = conexao.prepareStatement(sql);

            try (ResultSet rs = ps.executeQuery()){
                rs.next();
                return rs.getInt("idCampeonato");
            }
            catch(NullPointerException ex) {
                return -1;
            }
        }
        catch(Exception ex) {
            return -1;
        }
    }
}
