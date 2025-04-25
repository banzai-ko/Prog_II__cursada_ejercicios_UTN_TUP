/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase6;

/**
 *
 * @author gpennone
 */
public class Taladro extends Herramienta{
    private int rpm;
    private boolean inalambrico;

    
    public Taladro(String brand, int weight, int rpm, boolean wireless) {
        super(brand, weight);
        this.rpm = rpm;
        this.inalambrico = wireless; 
       
    }
    
    public String mostrarTaladro() {
        StringBuilder sb = new StringBuilder(super.mostrarHerramienta());
        sb.append("RPM:").append(this.rpm).append("\n");
        sb.append("Wireless:");
        sb.append(this.inalambrico ? "Si" : "No").append("\n");
        
        return sb.toString();
        
    }
}
