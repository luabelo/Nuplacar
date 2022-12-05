package com.saojudas.nuplacar.CRUDUsuario;

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
    
    public Usuario(int id) {   
        this.id = id;
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

    public Usuario(int id, String nome, String senha, String tipoUsuario) {
        this.id = id;
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


}