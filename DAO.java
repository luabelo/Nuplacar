/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nu.nuplacarproto2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author PC Gamer
 */
public class DAO {

    public boolean acessoAdm( Administrador adm){
        
        Connection con = ConexaoBD.obtemConexao();
        PreparedStatement pstm = null;
        
        try{
        String sql = "SELECT * FROM tb_adm WHERE nome = ? AND senha = ?";
            pstm = con.prepareStatement(sql);
                
            pstm.setString(1, adm.getNome());
            pstm.setString(2, adm.getSenha());  
            pstm.execute();
            try (ResultSet rs = pstm.executeQuery()) {
                return rs.next();
            }
            
        }
        catch(SQLException ex){
            
        }
        return false;
     
            
        
    }

}

