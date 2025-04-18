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
public class ejercicio3 {
    private int numberA;
    private int numberB;
    
    public void interactuarUsuario() {
        System.out.println("Ingrese Número A");
        this.numberA = obtainNumber();
        System.out.println("Ingrese Número B");
        this.numberB = obtainNumber();
        
        if (esMultiplo(numberA, numberB)) {
            System.out.println("El primero es múltiplo del segundo: ");
        } else {
            System.out.println("El primero NO es múltiplo del segundo: ");
        }
        
    }
    
     private static int obtainNumber() {
        Scanner data = new Scanner(System.in);
       return data.nextInt();
    }
     private static boolean esMultiplo(int valueA, int valueB) {
         return  valueA  %  valueB == 0;
     }
}
