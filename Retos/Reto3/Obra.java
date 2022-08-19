/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto3;

import java.util.ArrayList;

public class Obra {

    public static ArrayList<Integer> clases(ArrayList<Integer> listaObras) {

        ArrayList<Integer> resultado = new ArrayList<>();

        for (Integer item : listaObras) {
            if (!resultado.contains(item)) {

                resultado.add(item);

            }
        }
        return resultado;

    }

    public static ArrayList<Integer> meFaltanDeLaClase(ArrayList<Integer> obrasFaltantes, ArrayList<Integer> categorias, int obra) {

        ArrayList<Integer> salida = new ArrayList<>();
        ArrayList<Integer> numeroObras = new ArrayList<>();

        for (int i = 0; i < categorias.size(); i++) {
            if (obra == categorias.get(i)) {
                numeroObras.add(i);
            }
        }
        for (Integer i : obrasFaltantes) {
            if (numeroObras.contains(i)) {
                salida.add(i);
            }
        }
        return salida;

    }

    public static ArrayList<Integer> noTengo(ArrayList<Integer> museoA, ArrayList<Integer> museoB) {
        ArrayList<Integer> obrasInteres = new ArrayList<>();

        for (Integer obra : museoA) {
            if (!museoB.contains(obra)) {
                obrasInteres.add(obra);
            }

        }
        return obrasInteres;
    }

    public static Integer puedoCambiar(ArrayList<Integer> duplicadosA, ArrayList<Integer> duplicadosB) {
        int cambios = 0;

        if (duplicadosA.size() > duplicadosB.size()) {
            for (Integer obra : duplicadosB) {
                if (!duplicadosA.contains(obra)) {
                    cambios++;
                }
            }
        }
        if (duplicadosB.size() > duplicadosA.size()) {

            for (Integer obra : duplicadosA) {
                if (!duplicadosB.contains(obra)) {
                    cambios++;
                }
            }
        }
        if (duplicadosB.size() == duplicadosA.size()) {
            for (Integer obra : duplicadosA) {
                if (!duplicadosB.contains(obra)) {
                    cambios++;
                }
            }
           
        }
        return cambios;

    }
}