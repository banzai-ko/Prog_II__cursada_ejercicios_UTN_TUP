/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duplicadoshashset;
import java.util.HashSet;
import java.util.Set;
import Array.Utils;

/**
 *
 * @author gpennone
 */
public class DuplicadosHashSet {

    public static void main(String[] args) {
        
        int[] numeros = {5, 7, 2, 5, 9, 2, 8, 7, 1};

        
        Set<Integer> numerosSinDuplicados = new HashSet<>();
        
     
        for (int num : numeros) {
            numerosSinDuplicados.add(num); //hash set evita los duplicados
        }

     
        System.out.println("Números sin duplicados:");
        for (int num : numerosSinDuplicados) {
            System.out.print(num + " ");
        }
    }
    
}
