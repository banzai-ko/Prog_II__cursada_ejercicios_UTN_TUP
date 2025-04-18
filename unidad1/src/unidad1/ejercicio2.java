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

public class ejercicio2 {
    private int limit;
    
    public void pedirEntrada() {
        System.out.println("Ingrese Número N");
        this.limit = obtainNumber();
        showEvenNumbers(this.limit);
    }
    
     private static int obtainNumber() {
        Scanner data = new Scanner(System.in);
       return data.nextInt();
    }
     
     private static void showEvenNumbers(int value){
         System.out.println("Numeros Pares");
         int total = 0;
         for (int i = 0; i <= value; i++) { 
             if ( i  % 2 == 0) {
                 total++;
                 System.out.println("Elemento  " + total +": " + i);
             }
         }
     }
}
