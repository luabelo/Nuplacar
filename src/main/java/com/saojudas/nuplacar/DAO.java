package com.saojudas.nuplacar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

    public boolean acessoAdm(Administrador adm){
        
        Connection con = ConexaoBD.obtemConexao();
        PreparedStatement pstm = null;
        
        try{
        String sql = "SELECT * FROM tb_usuario WHERE nome = ? AND senha = ?";
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
    
    public boolean acessoUsuario (Usuario usuario) {
        
        Connection con = ConexaoBD.obtemConexao();
        
        try {
        String sql = "SELECT * FROM tb_usuario WHERE nome = ? AND senha = ?";
        PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getSenha());
            pstm.execute();
            try (ResultSet rs = pstm.executeQuery()) {
                return rs.next();
            }
        }
         catch(SQLException ex){
            
        }
        return false;
        }
    
    public void acessoTipoUsuario (Usuario usuario) {
        
        Connection con = ConexaoBD.obtemConexao();
        ResultSet rs = null;
        
        try {
        String sql = "SELECT * FROM tb_usuario WHERE nome = ? AND senha = ? AND tipoUsuario = 'Administrador'";
        PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getSenha());
            pstm.setString(3, usuario.getTipoUsuario());
            pstm.execute();
            rs = pstm.executeQuery();     
        }
         catch(SQLException ex){    
        }
        
        }        
        }
        
      
