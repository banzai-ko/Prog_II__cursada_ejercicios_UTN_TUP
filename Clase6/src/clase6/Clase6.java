/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase6;

/**
 *
 * @author gpennone
 */
public class Clase6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Taller tallerPrueba = new Taller(6);
        tallerPrueba.agregarHerramienta(new LlaveInglesa("Still", 300, LlaveInglesa.TipoMaterial.ACERO, true));
        tallerPrueba.agregarHerramienta(new Taladro("Bahco,", 600, 9000, true ));
        System.out.println(tallerPrueba.mostrarHerramientas());

    }
    
}
