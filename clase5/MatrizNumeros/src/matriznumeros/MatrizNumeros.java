/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriznumeros;


/**
 *
 * @author gpennone
 */
public class MatrizNumeros {

    /**
     * @param args the command line arguments
     */
    
    static Matriz data = new Matriz(3,3);
    public static void main(String[] args) {
        System.out.println("Matriz: ");
        System.out.println(data.getData());
        System.out.println("Sumatoria: ");
        System.out.println(data.sumatoria());
        
        
    }
    
}
