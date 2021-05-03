/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author corre
 */
public class TDA_COLA {
    protected TDA_PRIORIDAD[] vector;
    protected int ini;
    protected int fin;

    public TDA_COLA(int tamano) {
        vector = new TDA_PRIORIDAD[tamano];
        ini = -1;
        fin = -1;
    }
    
    public boolean insertar(TDA_PRIORIDAD dato){
        if(estaColaLlena()) return false;
        fin++;
        vector[fin] = dato;
        //If verifica el ajuste si ini queda en -1 cuando cola vacia
        if(ini == -1)ini = 0;
        if(fin >= 1) AcomodoPrioridad(dato);
        return true;
    }
    
    protected boolean estaColaLlena(){
        return fin == vector.length-1;
    }
    
    public boolean eliminar(){
        if(estaColaVacia()) return false;
        if(hayUnSoloDato()){
            ini = -1;
            fin = -1;
            return true;
        }
        ini++;
        return true;
    }
    
    protected boolean estaColaVacia(){
        return ini == -1 && fin == -1;
    }
    
    protected boolean hayUnSoloDato(){
        return ini == fin;
    }
    
    public TDA_PRIORIDAD getValor(int pos){
        return vector[pos];
    }

    public int getIni() {
        return ini;
    }

    public int getFin() {
        return fin;
    }
    
    public boolean insertarCorrimiento(TDA_PRIORIDAD data){
        boolean respuesta = insertar(data);
        if(respuesta == true){
            return respuesta;
        }
        if(ini>0){
            corrimiento();
            return insertar(data);
        }
        return false;
    }
    
    public void corrimiento(){
        int recibe = 0;
        int envia;
        
        for(recibe = 0, envia = ini; envia <= fin; envia++, recibe++){
            vector[recibe] = vector[envia];
        }
        
        ini = 0;
        fin = recibe - 1;
    }
    
    public void AcomodoPrioridad(TDA_PRIORIDAD data){
        TDA_PRIORIDAD temp;
        for(int i=fin-1; i>=0; i--){
            if(data.getLvl() > vector[i].getLvl()){
                temp = vector[i];
                vector[i] = data;
                vector[i+1] = temp;
            }
        }
    }
    
}
