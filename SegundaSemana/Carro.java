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
public class Carro {

    String color;
    String tipoMotor;
    String tipoAuto;
    double cilindraje;
    int modelo;

    public Carro(String colorcito, String tipoMotor, String tipoAuto,
            double cilindraje, int modelo) {
        this.color = colorcito;
        this.tipoMotor = tipoMotor;
        this.tipoAuto = tipoAuto;
        this.cilindraje = cilindraje;
        this.modelo = modelo;
    }

    public Carro(String tipoMotor, String tipoAuto,
            double cilindraje, int modelo) {
        this.color = "Verde";
        this.tipoMotor = tipoMotor;
        this.tipoAuto = tipoAuto;
        this.cilindraje = cilindraje;
        this.modelo = modelo;
    }

    public Carro() {
    }

    public boolean transportar(int distancia) {
        if (distancia > 5) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esMasViejo(int modelo) {

        if (this.modelo < modelo) {

            return true;
        } else {
            return false;
        }
    }

    public void acelerar() {
        System.out.println("Aceleerando run, run....");
    }

    public void modificarTipoAuto(String tipoAuto) {
        this.tipoAuto = tipoAuto;
        //System.out.println("El auto es " + this.tipoAuto);
    }

}