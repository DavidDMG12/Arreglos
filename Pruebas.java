/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

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
        Scanner entrada= new Scanner(System.in);
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
        
        //llenando arreglos 
        
        int elementos;
        
        elementos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Cantidad de elementos del arreglo: "));
        char[] letras =new char[elementos];
        System.out.println("Ingrese los elementos del arreglo");
        for (int i = 0; i < elementos; i++) {
            System.out.println(i+1+" ingrese un caracter: ");
            letras[i]=entrada.next().charAt(0);
        }
        
        System.out.println("Los Caracteres en el arreglo son: ");
        for (int i = 0; i < elementos; i++) {
            System.out.print(letras[i]);
            
        }
    }
  
}
