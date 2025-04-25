/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase6;

/**
 *
 * @author gpennone
 */
public class LlaveInglesa extends Herramienta {
    private TipoMaterial material;
    private boolean regulable;
    
    public LlaveInglesa (String brand, int weight , TipoMaterial material, boolean regulable ) {
        
        super(brand, weight );
         this.material = material;
         this.regulable = regulable;
    }
    public String mostrarLlaveInglesa() {
        StringBuilder sb = new StringBuilder(super.mostrarHerramienta());
        sb.append("Material: ").append(this.material).append("\n");
        sb.append("Regulable: ").append(this.regulable ? "Si" : "No").append("\n");
        
        return sb.toString();
    }   
    
    public enum TipoMaterial {
        ACERO, 
        TITANIO, 
        ALUMINIO, 
        HIERRO, 
        CROMO_VANADIO,
       FIBRA_CARBONO

   }
    
}
    
