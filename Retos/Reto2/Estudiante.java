/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto2;

import java.util.ArrayList;

public class Estudiante {

    private String nombre;
    private String edad;
    private String programa;
    private String tipo_etnia;
    private ArrayList<Estudiante> estudiantes;

    public Estudiante(String nombre, String edad, String programa, String tipo_etnia) {
        this.nombre = nombre;
        this.edad = edad;
        this.programa = programa;
        this.tipo_etnia = tipo_etnia;
    }

    Estudiante() {
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getTipo_etnia() {
        return tipo_etnia;
    }

    public void setTipo_etnia(String tipo_etnia) {
        this.tipo_etnia = tipo_etnia;
    }

    @Override
    public String toString() {
        return  "\n \t Nombre:" + nombre + "\n \t Edad:" + edad +" anios" + "\n \t Programa:" + programa + "\n \t Etnia:" + tipo_etnia ;
    }


}
