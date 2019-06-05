/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author AXTEL
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
    //Programando Arreglos, Listas y mapas
   
    //Arreglos
    
        int[]numeros = new int[3];
        int[]numeros2= {12,13,3,6};
        numeros[0]=7;
        numeros[1]=10;
        numeros[2]=13;
        for (int i = 0; i < 3; i++) {
            System.out.println(numeros[i]);
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(numeros2[i]);
        }
    }
  
}
