/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuegos;

import java.util.ArrayList;

/**
 *
 * @author gpennone
 */
public class Juego {

    private String titulo;
    private double pesoGB;
    protected ArrayList<TipoConsola> consolasCompatibles;
    
    public Juego(String title, double size ) {
        this.titulo = title;
        this.pesoGB = size;
        this.consolasCompatibles = new ArrayList <> ();
    }
    
    public String getTitulo() {
        return this.titulo;
    }
    
    public double getPesoGB() {
        return this.pesoGB;
    }
    
    public ArrayList<TipoConsola> getConsolasCompatibles() {
        return this.consolasCompatibles;
    }
    
    public String mostrarJuego() {
         StringBuilder sb = new StringBuilder("Juego: ").append(this.titulo).append("\n");
        sb.append("Peso: ").append(this.pesoGB).append("\n");
        sb.append("Compatible: ").append(this.consolasCompatibles);
        return sb.toString(); 
    }

    public boolean esCompatible(TipoConsola console) {
        return this.consolasCompatibles.contains(console);
    }

}

