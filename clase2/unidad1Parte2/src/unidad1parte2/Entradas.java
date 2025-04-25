/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad1parte2;

import java.util.Scanner;

/**
 *
 * @author gpennone
 */
public class Entradas {
    
    private static Entradas instance;
    
    private Entradas() {
    }

    
    public static Entradas getInstance() {
        // Singleton Pattern
        if (instance == null) {
            instance = new Entradas();
        }
        return instance;
    }

    public  String obtainName() {
        Scanner data = new Scanner(System.in);
        return data.nextLine();
    }
    
    public  int obtainNumber() {
        Scanner data = new Scanner(System.in);
        return data.nextInt();
    }
    public char obtainLetter() {
        Scanner data = new Scanner(System.in);
        String input = data.nextLine().trim();
        return input.charAt(0);
    }    
}


