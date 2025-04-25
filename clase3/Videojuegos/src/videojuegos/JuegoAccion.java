/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuegos;

/**
 *
 * @author gpennone
 */
public class JuegoAccion  extends Juego{
    public JuegoAccion(String title, double size) {
        super(title, size);
        super.consolasCompatibles.add(TipoConsola.PC);
         super.consolasCompatibles.add(TipoConsola.PLAYSTATION);
      
    }
    
            
            
            
}
