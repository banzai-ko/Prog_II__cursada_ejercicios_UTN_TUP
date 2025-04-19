/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad1parte2;

/**
 *
 * @author gpennone
 */
public class Ejercicio8 {
    
    private static int[] numeros;
    private static int mayor;
    private static int menor;
    private static double promedio;

    
    public static void procesar(int[] numeros) {
      
        procesarNumeros(numeros);
        System.out.println("Entrada");
        System.out.println(java.util.Arrays.toString(numeros));
        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);
        System.out.println("Promedio: " + promedio);
    }

    
    public static  void procesarNumeros(int[] numeros) {
        promedio = calcularPromedio(numeros);
        mayor = calcularExtremo(numeros, true); 
        menor = calcularExtremo(numeros, false);
        // 3 loops, se puede optimizar, se ignora por ahora es para explicar poo
        }
    
    private static double calcularPromedio(int[]numeros) {
        int suma=0;
        for (int numero:numeros) {
            suma += numero;
        }
        return(double)suma/numeros.length;
    }
    
    private static  int calcularExtremo(int[] numeros, boolean buscarMayor) {
    
    int extremo = numeros[0];
    
    for (int numero : numeros) {
        if (buscarMayor) {
            if (numero > extremo) {
                extremo = numero;
            }
        } else {
            if (numero < extremo) {
                extremo = numero;
            }
        }
    }
    
    return extremo;
}
}

