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
public class Campeonato {
    private ArrayList<Partida> partidasFaseGrupo = new ArrayList();
    private ArrayList<Partida> partidasFaseMataMata = new ArrayList();
    private ArrayList<Grupo> grupos = new ArrayList();
    
    
    public Campeonato(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }
    
    private void criarPartidasFaseGrupo() {
        grupos.forEach(grupo -> {
            partidasFaseGrupo.add(new Partida(
                            grupo.getTimes().get(0),
                            grupo.getTimes().get(1)));
            partidasFaseGrupo.add(new Partida(
                            grupo.getTimes().get(0),
                            grupo.getTimes().get(2)));
            partidasFaseGrupo.add(new Partida(
                            grupo.getTimes().get(0),
                            grupo.getTimes().get(3)));
            partidasFaseGrupo.add(new Partida(
                            grupo.getTimes().get(1),
                            grupo.getTimes().get(2)));
            partidasFaseGrupo.add(new Partida(
                            grupo.getTimes().get(1),
                            grupo.getTimes().get(3)));
            partidasFaseGrupo.add(new Partida(
                            grupo.getTimes().get(2),
                            grupo.getTimes().get(3)));
        });
    }
    
    public void simularPartidasFaseGrupo() {
        criarPartidasFaseGrupo();
        partidasFaseGrupo.forEach(partida -> {
            partida.simularPartida();
        });
        
    }
    
    public ArrayList<Grupo> getClassificacaoTimesPorGrupo() {
        //pegar na base os grupos com os times
        return new ArrayList();
    }
}
