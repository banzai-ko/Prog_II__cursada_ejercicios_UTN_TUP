/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad1;

import java.util.Scanner;

/**
 *
 * @author gpennone
 */
public class ejercicio4 {
    
            public void interactuarUsuario() {
        System.out.println("Ingrese Número");
       int value = obtainNumber();
       System.out.println("Tabla de Multiplicar:");
       showTable(value);
        
    }
    
     private static int obtainNumber() {
        Scanner data = new Scanner(System.in);
       return data.nextInt();
    }
     
     private static void showTable(int number) {
         for (int i = 0; i < 10; i++) {
             System.out.println( number + " x " + ( i + 1 ) + " = " + number * (i + 1) );
         
         }
     }
}
