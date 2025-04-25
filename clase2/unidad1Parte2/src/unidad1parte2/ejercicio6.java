/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad1parte2;

/**
 *
 * @author gpennone
 */
public class ejercicio6 {
    
    private static Entradas entradas = Entradas.getInstance();

    private static  int hora;
    
    public static void interectuarUsuario(){
        System.out.println("Ingresar hora");
        hora = entradas.obtainNumber();
        System.out.println(saludar(hora));
    }
     
    private static String saludar(int hora) {
    String saludo;
    
    switch (hora) {
        case 6, 7, 8, 9, 10, 11, 12:  
            saludo = "Buenos Días";
            break;
        case 13, 14, 15, 16, 17:  
            saludo = "Buenas Tardes";
            break;
        case 18, 19, 20, 21, 22:  
            saludo = "Buenas Noches";
            break;
        default:
            saludo = "Hora no válida";  
    }
    return saludo;
}
    
    
}
