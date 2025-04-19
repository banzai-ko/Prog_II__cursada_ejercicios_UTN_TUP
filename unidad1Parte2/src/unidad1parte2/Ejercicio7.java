/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad1parte2;

/**
 *
 * @author gpennone
 */
public class Ejercicio7 {
   
    private static Entradas entradas = Entradas.getInstance();
   private static int age;
   private static int salary;
    
   public static void apto() {
       System.out.println("Ingresar Edad");
       age = entradas.obtainNumber();
       System.out.println("Especifique Ingreso - Entero");
       salary = entradas.obtainNumber();
       if( esApto(age, salary)) {
           System.out.println("Es apto para crédito");
       } else {
           System.out.println("No es apto para crédito");
       }
   }

    private static boolean esApto(int edad, int salario) {
       return edad >= 21 && salario > 150000;
}
}
