package com.saojudas.nuplacar;

import java.util.Random;
import com.saojudas.nuplacar.CRUDTime.Time;

public class Partida {
    private int id; 
    private Time time1;    
    private Time time2;
    private int golsTime1;
    private int golsTime2;
    private boolean partidaFinalizada = false;
    

    public Partida(int id, Time time1, Time time2, int golsTime1, int golsTime2, boolean partidaFinalizada) {
        this.id = id;
        this.time1 = time1;
        this.time2 = time2;
        this.golsTime1 = golsTime1;
        this.golsTime2 = golsTime2;
        this.partidaFinalizada = partidaFinalizada;
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
        golsTime1 = random.nextInt(3);
        golsTime2 = random.nextInt(3);
        partidaFinalizada = true;
        atualizarStatusTimes();
    }
    
    public void simularPartidaSemEmpate() {
        Random random = new Random();
        golsTime1 = random.nextInt(3);
        golsTime2 = random.nextInt(3);
        
        if (golsTime1 == golsTime2) {
            simularPartidaSemEmpate();
        }
        else {
            partidaFinalizada = true;
            atualizarStatusTimes();
        }
    }
    
    private void atualizarStatusTimes() {
        if (partidaFinalizada) {
            if (golsTime1 > golsTime2) {
                time1.ganhouPartida(golsTime1);
                time2.perdeuPartida(golsTime2);
            }
            else if (golsTime1 == golsTime2) {
                time1.empatouPartida(golsTime1);
                time2.empatouPartida(golsTime2);
            }
            else {
                time1.perdeuPartida(golsTime1);
                time2.ganhouPartida(golsTime2);
            }
        }
        else {
            System.out.println("Partida ainda não foi finalizada");
        }
    }
}
