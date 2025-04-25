/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad1parte2;

/**
 *
 * @author gpennone
 */
public class Ejercicio9 {

    private static Entradas entradas = Entradas.getInstance();

    public static void interactuarUsuario() {
        System.out.println("Ingrese una letra:");
        char letra = entradas.obtainLetter(); 

        switch (Character.toLowerCase(letra)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("La letra '" + letra + "' es una vocal.");
                break;
            default:
                if (Character.isLetter(letra)) {
                    System.out.println("La letra '" + letra + "' es una consonante.");
                } else {
                    System.out.println("El carácter ingresado no es una letra.");
                }
        }
    }
}