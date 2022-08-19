/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto2;

import java.util.ArrayList;
import java.util.Scanner;


public class Registro {
  
    
    public static Scanner ingreseOpcion;
    public static String[] listaEntrada;
    public static ArrayList <Estudiante> estudiantes;
    public static Estudiante pregrado;
    public static Estudiante posgrado;
    
   
    
            
    public static void main(String[] args) {
      
      procesarComandos (); }
    
        public static void agregarEstudiante(){
            if (listaEntrada [1].equals("Pregrado")){
           pregrado = new Pregrado(
                   listaEntrada[2],
                        listaEntrada[3],
                        listaEntrada[4],
                       listaEntrada[5],
                       listaEntrada[6]);
                estudiantes.add(pregrado);        } else if (listaEntrada[1].equals("Posgrado")) {
            posgrado = new Posgrado(listaEntrada[6],
                    listaEntrada[2],
                    listaEntrada[3],
                    listaEntrada[4],
                    listaEntrada[5]);
            estudiantes.add(posgrado);
        }
        }
           
    
    public static void listarEstudiantes(){
        System.out.println("***Listado de estudiantes***");
        for(Estudiante item:estudiantes){
            System.out.print(item.toString());
        }
   
    }
    public static void procesarComandos(){
        ingreseOpcion = new Scanner(System.in);
        String entrada = ingreseOpcion.nextLine();
        listaEntrada = entrada.split("&");
        estudiantes = new ArrayList<>();
        do{
            if (listaEntrada[0].equals("1")){
                agregarEstudiante();
            } else if (listaEntrada[0].equals("2")) {
                listarEstudiantes();
            }
            entrada = ingreseOpcion.nextLine();
            listaEntrada = entrada.split("&");
        }while(!listaEntrada[0].equals("3"));
    
}




} 
          
    
