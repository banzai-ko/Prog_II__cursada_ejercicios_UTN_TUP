/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stock.Entidades;

/**
 *
 * @author gpennone
 */
public class Producto {
    private String nombre;
    private double precio;
    private int stock;
    
    public Producto(String name, double price, int amount) {
        this.nombre = name;
        this.precio = price;
        this.stock = amount; 
    }
     
    public String getNombre(){
        return this.nombre;
    }
    
    public double getPrecio(){
        return this.precio;
    }
    
    public int getStock() {
        return this.stock;
    } 
    
    public boolean reducirStock(int cantidad) {
        // asume entrada válida
        if ( !tieneStockDisponible(cantidad)) {
            return false;
        }
        
        this.stock -= cantidad;
        return true;
        
        
    }
    
    private boolean tieneStockDisponible(int cantidad) {
        return this.stock >= cantidad;
    }
}
