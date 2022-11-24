/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saojudas.nuplacar.DAO;

import com.saojudas.nuplacar.ConexaoBD;
import com.saojudas.nuplacar.CRUDTime.Time;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Mathe
 */
public class GrupoDAO {
    
    public Time[] obterTimes () throws Exception {
        String sql = "SELECT * FROM tb_time";
        try (Connection conn = ConexaoBD.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(
             sql, ResultSet.TYPE_SCROLL_INSENSITIVE, 
                  ResultSet.CONCUR_READ_ONLY); 
            ResultSet rs = ps.executeQuery()){
            int totalTimes = rs.last()? rs.getRow(): 0;
            Time[] times = new Time[totalTimes];
            rs.beforeFirst();
            int cont = 0;
            while (rs.next()) {
                int id = rs.getInt("idTime");
                String nome = rs.getString("nome");
                times[cont++] = new Time(id,nome);
            }
            return times;
        }
    }
    
}
