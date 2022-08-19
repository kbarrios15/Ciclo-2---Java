/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto2;


public class Posgrado extends Estudiante {
    private String modalidad;

    public Posgrado(String modalidad, String nombre, String edad, String programa, String tipo_etnia) {
        super(nombre, edad, programa, tipo_etnia);
        this.modalidad = modalidad;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    @Override
    public String toString() {
        return "\t Estudiante Posgrado" +  super.toString() + "\n \t Modalidad:" + modalidad + '\n';
    }
    
    
    
}
