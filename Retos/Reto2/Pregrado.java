/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto2;


public class Pregrado extends Estudiante {
    
    private String cantedad_creditos;

    public Pregrado( String nombre, String edad, String programa, String tipo_etnia, String cantedad_creditos) {
        super(nombre, edad, programa, tipo_etnia);
        this.cantedad_creditos = cantedad_creditos;
    }

   
    @Override
    public String toString() {
       
        return "\t Estudiante Pregrado" +  super.toString() + "\n \t Creditos aprobados: " + cantedad_creditos + "\n" ;
    }

    public String getCantedad_creditos() {
        return cantedad_creditos;
    }

    public void setCantedad_creditos(String cantedad_creditos) {
        this.cantedad_creditos = cantedad_creditos;
    }
    
     
    
}
