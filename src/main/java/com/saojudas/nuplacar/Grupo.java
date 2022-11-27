package com.saojudas.nuplacar;

import java.util.ArrayList;
//import com.saojudas.nuplacar.CRUDTime.Time;

 public class Grupo {
    private ArrayList<Time> times = new ArrayList();
    private char id;
    private String nome;

    public Grupo(char id, ArrayList<Time> times) {
        this.id = id;
        this.times = times;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public ArrayList<Time> getTimes() {
        return times;
    }

    public void setTimes(ArrayList<Time> times) {
        this.times = times;
    }

    public char getId() {
        return id;
    }

    public void setId(char id) {
        this.id = id;
    }
    
//    @Override
//    public String toString () {
//        return id.toString();
//    }
}