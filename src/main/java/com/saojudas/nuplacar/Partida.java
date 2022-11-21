/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saojudas.nuplacar;

import java.util.Random;
/**
 *
 * @author Mathe
 */
public class Partida {
    private int id; 
    private Time time1;    
    private Time time2;
    private int golsTime1;
    private int golsTime2;

    public Partida(int id, Time time1, Time time2, int golsTime1, int golsTime2) {
        this.id = id;
        this.time1 = time1;
        this.time2 = time2;
        this.golsTime1 = golsTime1;
        this.golsTime2 = golsTime2;
    }

    public Partida(Time time1, Time time2) {
        this.time1 = time1;
        this.time2 = time2;
    }

    public int getId() {
        return id;
    }

    public Time getTime1() {
        return time1;
    }

    public Time getTime2() {
        return time2;
    }

    public int getGolsTime1() {
        return golsTime1;
    }

    public int getGolsTime2() {
        return golsTime2;
    }

    public void setGolsTime1(int golsTime1) {
        this.golsTime1 = golsTime1;
    }

    public void setGolsTime2(int golsTime2) {
        this.golsTime2 = golsTime2;
    }
    
    public void simularPartida() {
        Random random = new Random();
        golsTime1 = random.nextInt(10);
        golsTime2 = random.nextInt(10);
    }
    
    private void atualizarStatusTimes() {
        // aplicar as alterações na classificacao dos times
    }
}
