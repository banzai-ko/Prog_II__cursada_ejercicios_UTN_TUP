/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matriznumeros;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author gpennone
 */
public class Matriz {
    
    private int filas;
    private int columnas;
    private int [][] matriz;
   
     public Matriz(int rows, int cols) {
        this.matriz = new int[rows][cols];
        Random random = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100); // Números aleatorios de 0 a 99
            }
        }
    }
     public int getFilas() {
         return this.filas;
     }
     
     public int getCoumnas() {
         return this.filas;
     }
     
     public String getData() {
        StringBuilder sb = new StringBuilder();
        for (int[] fila : this.matriz) {
            for (int elem : fila) {
                sb.append(elem).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

     
     public int sumatoria() {
        int suma = 0;
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz[i].length; j++) {
                suma += this.matriz[i][j];
            }
        }
        return suma;
     }
     
}
