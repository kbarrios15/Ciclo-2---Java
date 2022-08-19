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
public class Vehiculo {

    private String motor;
    private int ruedas;

    public Vehiculo() {

    }

    public void moverse() {
        System.out.println("Me estoy trasladando");
    }

    public void frenar(String ruta) {
        System.out.println("Estoy frenando en " + ruta);
    }

    public String getMotor() {
        return this.motor;
    }

    public void setMotor(String motor) {
        this.motor=motor;
    }
    
    public int getRuedas() {
        return this.ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas=ruedas;
    }
}