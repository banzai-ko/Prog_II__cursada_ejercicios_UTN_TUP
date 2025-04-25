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
public class ejercicio1 {
 
    private  int userAge;
    private String userName;
            
            
    public void pedirDatos() {
        System.out.println("Ingrese Datos de Usuario");
        System.out.println("Edad ");
        this.userAge  = obtainAge();
        System.out.println("Nombre: ");
        this.userName = obtainName();
        System.out.println("El usuario ingresado es: \n");      
        System.out.println(showInfo(userAge, userName));
        
    }
    private static String obtainName() {
        Scanner data = new Scanner(System.in);
        return data.nextLine();
    }
    private static int obtainAge() {
        Scanner data = new Scanner(System.in);
       return data.nextInt();
    }
    private static String showInfo( int age, String name) {
        String  message = "Nombre: " + name + "\n"; 
        message += "Edad:  " + String.valueOf(age) + "\n";
        return message;
    }   
}
