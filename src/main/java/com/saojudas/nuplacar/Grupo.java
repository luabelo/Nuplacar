/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saojudas.nuplacar;

import java.util.ArrayList;
/**
 *
 * @author Mathe
 */
public class Grupo {
    private ArrayList<Time> times = new ArrayList();
    private char id;

    public Grupo(char id, ArrayList<Time> times) {
        this.id = id;
        this.times = times;
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
    
    
}
