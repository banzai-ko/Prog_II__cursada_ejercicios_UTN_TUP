/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad1parte2;

/**
 *
 * @author gpennone
 */

public class Ejercicio10 {

    private static Entradas entradas = Entradas.getInstance();

    public static void interactuarUsuario() {
        int lados;
        do {
            System.out.println("Ingrese un número entero (mínimo 2) para el tamaño del cuadrado:");
            lados = entradas.obtainNumber();
            if (lados < 2) {
                System.out.println("El número debe ser mayor o igual a 2.");
            }
        } while (lados < 2);

        dibujarCuadrado(lados);
    }

    private static void dibujarCuadrado(int size) {
        for (int fila = 0; fila < size; fila++) {
            for (int col = 0; col < size; col++) {
                
                if (fila == 0 || fila == size - 1 || col == 0 || col == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Salto de línea por fila.
        }
    }
}

