package com.saojudas.nuplacar.DAO;

import com.saojudas.nuplacar.CRUDTime.Time;
import com.saojudas.nuplacar.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import com.saojudas.nuplacar.Partida;
import java.sql.ResultSet;

public class PartidaDAO {
    public static void salvar(Partida partida, int idCampeonato) {
        try (
            Connection conexao = ConexaoBD.obtemConexao();
        ){
            String sql = """
                        INSERT INTO tb_partidas (
                            idCampeonato,
                            time1,
                            time2,
                            gols_time1,
                            gols_time2
                        )
                        VALUES (
                            ?,?,?,?,?
                        )
                        """;

            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, idCampeonato);
            ps.setString(2, partida.getTime1().getNome());
            ps.setString(3, partida.getTime2().getNome());
            ps.setInt(4, partida.getGolsTime1());
            ps.setInt(5, partida.getGolsTime2());
            ps.execute();
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static ArrayList<Partida> getPartidasPorCampeonato(int idCampeonato) throws Exception {
        try (
            Connection conexao = ConexaoBD.obtemConexao();
        ){
            String sql = """
                        SELECT 
                            idPartida,
                            time1,
                            time2,
                         gols_time1,
                         gols_time2
                         FROM tb_partidas 
                         WHERE idCampeonato = ?
                         """;

            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, idCampeonato);
            try (ResultSet rs = ps.executeQuery()){
                ArrayList<Partida> partidas = new ArrayList();
                while(rs.next()) {
                    partidas.add(new Partida(
                            rs.getInt("idPartida"),
                            new Time(rs.getString("time1")),
                            new Time(rs.getString("time2")),
                            rs.getInt("gols_time1"),
                            rs.getInt("gols_time2"),
                            true
                    ));
                }
                return partidas;
            }
            catch(NullPointerException ex) {
                throw ex;
            }
        }
        catch(Exception ex) {
            throw ex;
        }
    }
    
    public static void salvar(ArrayList<Partida> partidas, int idCampeonato) {
        partidas.forEach((partida) -> {
           salvar(partida, idCampeonato); 
        });
    }
}
