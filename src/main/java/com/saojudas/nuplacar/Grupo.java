package com.saojudas.nuplacar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.saojudas.nuplacar.CRUDTime.Time;
import java.util.ArrayList;

public class Grupo {
    private ArrayList<Time> times = new ArrayList();
    private int idGrupo;

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    private String nome;

    public Grupo(int idGrupo, ArrayList<Time> times) {
        this.idGrupo = idGrupo;
        this.times = times;
    }

    public Grupo(int idGrupo, String nome) {
        this.idGrupo = idGrupo;
        this.nome = nome;
    }
    
    public ArrayList<Time> getTimes() {
        return times;
    }

    public void setTimes(ArrayList<Time> times) {
        this.times = times;
    }
    
    @Override
    public String toString () {
        return nome;
    }
}
    
    
