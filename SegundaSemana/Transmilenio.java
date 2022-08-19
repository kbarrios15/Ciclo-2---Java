/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segunda.semana;

/**
 *
 * @author keyba
 */
public class Transmilenio{
    private String ruta;
    
    public Transmilenio(){
    }
    
    public boolean detenerseEstacion(String parada){
        if(parada=="Restrepo"){
            return true;
        }else{
            return false;
        }
    }
    
    public String getRuta(){
        return this.ruta;
    }
    
    public void setRuta(String ruta){
        this.ruta=ruta;
    }

    @Override
    public String toString() {
        return "Transmilenio{" + "ruta=" + ruta + '}';
    }
    
}