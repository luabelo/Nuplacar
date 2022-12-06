package com.saojudas.nuplacar.DAO;

import com.saojudas.nuplacar.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.saojudas.nuplacar.CRUDTime.Time;
import com.saojudas.nuplacar.Partida;

public class PartidaDAO {
    public void salvarPartida(Partida partida) {
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
                        );
                        VALUES (
                            ?,?,?,?,?
                        )
                        """;

            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.execute();
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
