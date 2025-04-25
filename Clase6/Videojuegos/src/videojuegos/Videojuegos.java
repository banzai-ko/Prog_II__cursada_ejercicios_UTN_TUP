/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package videojuegos;

/**
 *
 * @author gpennone
 */
public class Videojuegos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Consola play5 = new Consola("Playstation 5", TipoConsola.PLAYSTATION, 500);
       Consola xboxSeries = new Consola("Xbox Serie X", TipoConsola.XBOX, 500);
       Consola masterRace = new Consola("Master Race", TipoConsola.PC, 2000);
       
       JuegoAccion bb = new JuegoAccion("Bloodborne", 100);
       JuegoDeportes fifa = new JuegoDeportes("FIFA 98", 12);
       
       play5.agregarJuego(bb);
       xboxSeries.agregarJuego(fifa);
       
        System.out.println(play5.mostrarjuegos());
        System.out.println(xboxSeries.mostrarjuegos());
       
    
    }
    
}
