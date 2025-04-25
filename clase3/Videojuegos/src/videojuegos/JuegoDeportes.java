/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuegos;

/**
 *
 * @author gpennone
 */
public class JuegoDeportes extends Juego{
    
    public JuegoDeportes(String title, double size) {
        super(title, size);
        super.consolasCompatibles.add(TipoConsola.XBOX);
         super.consolasCompatibles.add(TipoConsola.PLAYSTATION);
      
    }
    
}
