/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuegos;
import java.util.ArrayList;
import videojuegos.*;
/**
 *
 * @author gpennone
 */
public class Consola {
    
    private String nombre;
    private TipoConsola tipo;
    private double capacidadMaximaGB;
    private ArrayList<Juego> juegosInstalados;
    

    public Consola( String nombre, TipoConsola tipo, double capacidadMaximaGB) {
            this.nombre = nombre;
            this.tipo = tipo;
            this.capacidadMaximaGB = capacidadMaximaGB;
            this.juegosInstalados = new ArrayList <> ();
        }
        
        public boolean agregarJuego(Juego game) {
            if (game.esCompatible(tipo)){
                if (juegosInstalados.size() < 1) 
                    this.juegosInstalados.add(game);

            } else if (this.haySuficienteEspacio(game)) {
                    this.juegosInstalados.add(game);
            } 
            return true;
        }
        
        private boolean haySuficienteEspacio(Juego game) {
            double totalSpace = 0;
            
            for (Juego juego:this.juegosInstalados) {
                System.out.println(juego.getTitulo());
                totalSpace += juego.getPesoGB();
            }
            
            return totalSpace >= game.getPesoGB();
        }
        
        public String mostrarjuegos() {
            StringBuilder sb = new StringBuilder("Lista juegos: ").append(this.nombre).append("\n");
            for(Juego game:this.juegosInstalados) {
                sb.append(game.mostrarJuego());
            }
            return sb.toString();
        }
        

}
