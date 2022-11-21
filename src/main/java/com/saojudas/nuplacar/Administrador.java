package com.saojudas.nuplacar;

public class Administrador {
    private int id;
    private String nome;
    private String senha;
    private String tipoUsuario;
            
    public Administrador(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }
    
    public Administrador(String nome, String senha, String tipoUsuario) {
        this.nome = nome;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
    }
    
    public Administrador(int id, String nome, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
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