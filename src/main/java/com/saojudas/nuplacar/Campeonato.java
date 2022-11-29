package com.saojudas.nuplacar;

import java.util.ArrayList;
import java.util.Comparator;
import com.saojudas.nuplacar.CRUDTime.Time;
import com.saojudas.nuplacar.DAO.GrupoDAO;
import com.saojudas.nuplacar.DAO.TimeDAO;
import javax.swing.JOptionPane;

public class Campeonato implements Cloneable{
    private ArrayList<Partida> partidasFaseGrupo = new ArrayList();
    private ArrayList<Partida> partidasOitavasDeFinal = new ArrayList();
    private ArrayList<Partida> partidasQuartasDeFinal = new ArrayList();
    private ArrayList<Partida> partidasSemifinal = new ArrayList();
    private ArrayList<Partida> partidasFinal = new ArrayList();
    private ArrayList<Grupo> grupos = new ArrayList();
    
    public Campeonato(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public ArrayList<Partida> getPartidasFaseGrupo() {
        return partidasFaseGrupo;
    }

    public ArrayList<Partida> getPartidasOitavasDeFinal() {
        return partidasOitavasDeFinal;
    }

    public ArrayList<Partida> getPartidasQuartasDeFinal() {
        return partidasQuartasDeFinal;
    }

    public ArrayList<Partida> getPartidasSemifinal() {
        return partidasSemifinal;
    }

    public ArrayList<Partida> getPartidasFinal() {
        return partidasFinal;
    }
    
    public static boolean iniciarCampeonato() {
        int totalTimes = TimeDAO.listarTimes().size();
        String conjuntoGrupos = null;
        ArrayList<Grupo> grupos = GrupoDAO.listarGruposCompletos(conjuntoGrupos);
        
        if (totalTimes < 32) {
            JOptionPane.showInputDialog(null, "Há somente " + totalTimes  + " times cadastrados, cadastre mais " + (totalTimes - 32) + " times para iniciar a simulação");
            return false;
        }
        
        if (grupos.size() != 8) {
            JOptionPane.showInputDialog(null, "Há grupos incompletos, por favor cadastre todos antes de fazer a simulação!");
            return false;
        }
        
        new TelaSimularFaseGrupos(grupos).setVisible(true);
        return true;
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
    
    private void criarPartidasOitavasDeFinal() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <= 7; j+= 2) {
                if (partidasOitavasDeFinal.size() < 4) {
                    partidasOitavasDeFinal.add(new Partida(
                        grupos.get(j).getTimes().get(0),
                        grupos.get(j+1).getTimes().get(1)
                    ));
                }
                else {
                    partidasOitavasDeFinal.add(new Partida(
                        grupos.get(j).getTimes().get(1),
                        grupos.get(j+1).getTimes().get(0)
                    ));
                }
            }            
        }
    }
    
    private void criarPartidasQuartasDeFinal() {
        for (int i = 0; i < 8; i += 2) {
            Time time1;
            Time time2;
            
            if (partidasOitavasDeFinal.get(i).getGolsTime1() > partidasOitavasDeFinal.get(i).getGolsTime2()) {
                //entra time 1 da partida anterior
                time1 = partidasOitavasDeFinal.get(i).getTime1();
            }
            else {
                time1 = partidasOitavasDeFinal.get(i).getTime2();
            }

            if (partidasOitavasDeFinal.get(i+1).getGolsTime1() > partidasOitavasDeFinal.get(i+1).getGolsTime2()) {
                time2 = partidasOitavasDeFinal.get(i+1).getTime1();
            }
            else {
                time2 = partidasOitavasDeFinal.get(i+1).getTime2();
            }

            partidasQuartasDeFinal.add(new Partida(time1, time2));
        }
    }

    private void criarPartidasSemifinal() {
        for (int i = 0; i < 4; i += 2) {
            Time time1;
            Time time2;
        
            if (partidasQuartasDeFinal.get(i).getGolsTime1() > partidasQuartasDeFinal.get(i).getGolsTime2()) {
                time1 = partidasQuartasDeFinal.get(i).getTime1();
            }
            else {
                time1 = partidasQuartasDeFinal.get(i).getTime2();
            }
            
            if (partidasQuartasDeFinal.get(i+1).getGolsTime1() > partidasQuartasDeFinal.get(i+1).getGolsTime2()) {
                time2 = partidasQuartasDeFinal.get(i+1).getTime1();
            }
            else {
                time2 = partidasQuartasDeFinal.get(i+1).getTime2();
            }
            
            partidasSemifinal.add(new Partida (time1, time2));
        }
    }
    
    private void criarPartidasFinal() {
        // Partida com ganhador
        // Partida com perdedor
            Time time1Final;
            Time time2Final;
            Time time1Terceiro;
            Time time2Terceiro;
        
            if (partidasSemifinal.get(0).getGolsTime1() > partidasSemifinal.get(0).getGolsTime2()) {
                time1Final = partidasSemifinal.get(0).getTime1();
                time1Terceiro = partidasSemifinal.get(0).getTime2();
            }
            else {
                time1Final = partidasSemifinal.get(0).getTime2();
                time1Terceiro = partidasSemifinal.get(0).getTime1();
            }

            
            if (partidasSemifinal.get(1).getGolsTime1() > partidasSemifinal.get(1).getGolsTime2()) {
                time2Final = partidasSemifinal.get(1).getTime1();
                time2Terceiro = partidasSemifinal.get(1).getTime2();

            }
            else {
                time2Final = partidasSemifinal.get(1).getTime2();
                time2Terceiro = partidasSemifinal.get(1).getTime1();

            }
            
            partidasFinal.add(new Partida (time1Terceiro, time2Terceiro));
            partidasFinal.add(new Partida (time1Final, time2Final));
    }
    
    public void simularPartidasFaseMataMata() {
        criarPartidasOitavasDeFinal();
        partidasOitavasDeFinal.forEach((partida) -> {
            partida.simularPartidaSemEmpate();
        });
        
        criarPartidasQuartasDeFinal();
        partidasQuartasDeFinal.forEach((partida) -> {
            partida.simularPartidaSemEmpate();
        });
        
        criarPartidasSemifinal();
        partidasSemifinal.forEach((partida) -> {
            partida.simularPartidaSemEmpate();
        });
        
        criarPartidasFinal();
        partidasFinal.forEach((partida) -> {
            partida.simularPartidaSemEmpate();
        });
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    
    public void zerarJogosFaseMataMata() {
        partidasOitavasDeFinal = new ArrayList();
        partidasQuartasDeFinal = new ArrayList();
        partidasSemifinal = new ArrayList();
        partidasFinal = new ArrayList();    
    }
}

class ClassificacaoComparator implements Comparator<Time> {
    
    @Override
    public int compare(Time time1, Time time2) {
        if (time1.getPontos() == time2.getPontos()) {
            if (time1.getSaldoGols() > time2.getSaldoGols()) {
                return -1;
            }
            else {
                return 1;
            }
        }
        else if (time1.getPontos() > time2.getPontos()){
            return -1;
        }
        else {
            return 1;
        }
    }
}