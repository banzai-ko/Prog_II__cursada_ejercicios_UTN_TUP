/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase6;

import java.util.ArrayList;

/**
 *
 * @author gpennone
 */
public class Taller {
    private  ArrayList<Herramienta> coleccionDeHerramientas;
    private int cantidadMaxima;
    
    
    public Taller(int cantidad) {
        this.cantidadMaxima = cantidad;
        this.coleccionDeHerramientas = new ArrayList <> ();
    }
    
    public boolean agregarHerramienta(Herramienta herramienta) {
        boolean result;
 
        
        if (this.getCantidadHerramientas() >= cantidadMaxima) {
            result = false;
        }else {
            this.coleccionDeHerramientas.add(herramienta);
            result =  true;
        } // mejorar
        
        return result;
    }
    
    public int getCantidadHerramientas(){
         return coleccionDeHerramientas.size();
    }
    
    public String mostrarHerramientas() {
        StringBuilder sb = new StringBuilder();
        for (Herramienta herramienta:coleccionDeHerramientas) { 
             sb.append(herramienta instanceof Taladro
                ? ((Taladro) herramienta).mostrarTaladro()
                : ((LlaveInglesa) herramienta).mostrarLlaveInglesa());
        }
        return sb.toString();
    }
}
