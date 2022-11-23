/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saojudas.nuplacar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UsuarioDAO {
    
    
    public ArrayList<Usuario> obterUsuario() {
        ArrayList usuarioList = new ArrayList<Usuario>();
        Connection conn = ConexaoBD.obtemConexao();
        ResultSet rs = null;
        
        try {
            String sql = "SELECT * FROM tb_usuario";
            PreparedStatement pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            Usuario usuario;
            while(rs.next())
            {
            usuario = new Usuario(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(4));
            usuarioList.add(usuario);
            }                        
        } catch (Exception e){
            e.printStackTrace();
        }    
        return usuarioList;

        }
        
    public ArrayList<Usuario> obterUsuarioId(int id) {
        ArrayList usuarioList = new ArrayList<Usuario>();
        Connection conn = ConexaoBD.obtemConexao();
        ResultSet rs = null;
        
        try {
            String sql = "SELECT * FROM tb_usuario WHERE idUsuario = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            Usuario usuario;
            if(rs.next()) {
                usuario = new Usuario(
                    rs.getInt(1),
                    rs.getString(2),
                        rs.getString(3),
                    rs.getString(4));
            usuarioList.add(usuario);
            }                           
        } catch (Exception e){
            e.printStackTrace();
        }    
        return usuarioList;
        }
    
    public void atualizarUsuario(Usuario usuario) {
        Connection conn = ConexaoBD.obtemConexao();
        ResultSet rs = null;
        
        try {
            String sql = "UPDATE tb_usuario SET nome = ?, senha = ?, tipoUsuario = ? WHERE idUsuario = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1,usuario.getNome());
            pstm.setString(2,usuario.getSenha());
            pstm.setString(3,usuario.getTipoUsuario());
            pstm.setInt(4,usuario.getId());
            pstm.executeUpdate();
               
        } catch (Exception e){
            e.printStackTrace();
        }    
        }
    
    public void deletarUsuario(int id) {
        Connection conn = ConexaoBD.obtemConexao();
        
        try {
            String sql = "DELETE FROM tb_usuario WHERE idUsuario = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1,id);
            pstm.executeUpdate();
               
        } catch (Exception e){
            e.printStackTrace();
        }    
        }
    
        }
