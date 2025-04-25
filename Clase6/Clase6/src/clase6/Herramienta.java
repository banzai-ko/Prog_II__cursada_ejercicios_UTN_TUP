/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase6;

/**
 *
 * @author gpennone
 */
public class Herramienta {
   protected String marca;
   protected int peso;

    public Herramienta( String brand, int weitgh) {
        this.marca = brand;
        this.peso = weitgh;
    }  

   protected String mostrarHerramienta() {
           StringBuilder sb = new StringBuilder("Herramienta: ");
           sb.append(this.marca).append("\n");
           sb.append("Peso: ").append(this.peso).append("\n");

           return sb.toString();

       }

   

}
