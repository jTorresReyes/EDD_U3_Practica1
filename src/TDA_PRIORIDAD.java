/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author corre
 */
public class TDA_PRIORIDAD {
    private char dato;
    private int lvl;

    public TDA_PRIORIDAD() {
    }

    public TDA_PRIORIDAD(char dato, int lvl) {
        this.dato = dato;
        this.lvl = lvl;
    }

    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    @Override
    public String toString(){
        return "Char: " + dato + ". Lvl de importancia: " + lvl;
    }
    
    
}
