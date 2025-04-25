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
public class ejercicio5 {
    private String studentName;
    private String studentLastname;
    private int[] values = new int[3];
    
    public void pedirDatos() {
        System.out.println("Ingrese Datos de Usuario");
        System.out.println("Nombre: ");
        this.studentName = obtainString();
        System.out.println("Apellido: ");
        this.studentLastname = obtainString();
        for (int i = 0; i < 3;  i++)  {
            System.out.println("Resultado " + (i +1));
            this.values[i] = obtainValue();
        }
        System.out.println("Resultado: \n");      
        System.out.println(showInfo(this.studentName, this.studentLastname, this.values)Cos);
        
        
        
        
    }
    private static String obtainString() {
        Scanner data = new Scanner(System.in);
        return data.nextLine();
    }
    private static int obtainValue() {
        Scanner data = new Scanner(System.in);
       return data.nextInt();
    }
    private static String getAverageResult(int[] values) {
        double average = (values[0] + values[1] + values[2] )/ 3;
        
        if (average < 4) {
            return "Desaprobado";
        } else if (average >= 4 && average < 6) {
            return "Aprobado";
        } else if (average >= 6 && average <= 10) {
            return "Promocionado";
        } else {
            return "Inválido";
        }
    }
    
    private static String showInfo( String name, String lastname, int[] results) {
        String  message = "Nombre: " + name + "\n"; 
        message += "Apellido:  " + lastname + "\n";
        message += "Estado: " + getAverageResult(results);
        return message;
    }   
}
