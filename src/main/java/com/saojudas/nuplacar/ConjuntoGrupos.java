package com.saojudas.nuplacar;

public class ConjuntoGrupos {
    String nomeConjuntoGrupos;

    public String getNomeConjuntoGrupos() {
        return nomeConjuntoGrupos;
    }
    
    public ConjuntoGrupos(String nomeConjuntoGrupos) {
        this.nomeConjuntoGrupos = nomeConjuntoGrupos;
    }

    public void setNomeConjuntoGrupos(String nomeConjuntoGrupos) {
        this.nomeConjuntoGrupos = nomeConjuntoGrupos;
    }
    
    @Override
    public String toString() {
        return nomeConjuntoGrupos;
    }
    
}
