/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stock;

import stock.Entidades.Producto;
import stock.Entidades.Venta;


/**
 *
 * @author gpennone
 */

public class Stock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto product = new Producto("Coca Cola Regular", 3000, 10);
        Venta venta = new Venta(product, 5);
        System.out.println(venta.mostrarDetalle());
        
        Producto noSale = new Producto("Fernet Branca", 15000, 2);
        Venta fail = new Venta(noSale, 5);
        System.out.println(fail.mostrarDetalle());
    }
    
}
