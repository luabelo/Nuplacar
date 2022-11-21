package com.saojudas.nuplacar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Usuario {
    private int id;
    private String nome;
    private String senha;
    private String tipoUsuario;
            
    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public Usuario() {   
    }
    
    public Usuario(int id, String nome, String tipoUsuario) {
        this.id = id;
        this.nome = nome;
        this.tipoUsuario = tipoUsuario;
    }
    
    public Usuario(String nome, String senha, String tipoUsuario) {
        this.nome = nome;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }


    public void cadastrarUsuario() {
        String sql = "INSERT INTO tb_usuario (nome, senha, tipoUsuario) values (?, ?, ?)";
        Connection connection = new ConexaoBD().obterConexao();
        try ( PreparedStatement ps = connection.prepareStatement(sql);) {
            ps.setString(1,nome);
            ps.setString(2,senha);
            ps.setString(3,tipoUsuario);
            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
}
    
    public ArrayList<Usuario> ObterUsuario() {
        ArrayList usuarioList = new ArrayList<Usuario>();
        Connection conn = ConexaoBD.obtemConexao();
        try {
            String sql = "SELECT * FROM tb_usuario";
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
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
}