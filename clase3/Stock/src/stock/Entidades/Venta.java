package stock.Entidades;
/**
 *
 * @author gpennone
 */
public class Venta {
    private Producto producto = null;
    private int cantidadVendida = 0;
 
    public Venta (Producto product, int amount) {
        this.producto = product;
        this.cantidadVendida = amount;
        this.producto.reducirStock(this.cantidadVendida);

     }
    
    private double getPrecioTotal() {
         return this.cantidadVendida * producto.getPrecio();
    }
    
    public boolean realizarVenta() {
            return producto.reducirStock(cantidadVendida);
    }
    
    public String mostrarDetalle() {
        String message = "Detalles de Venta \n";
        message += "Producto:  " + producto.getNombre() + "\n" ;
        message += "Cantidad: " + this.cantidadVendida + "\n";
        message += "Total :" + getPrecioTotal() + "\n";
        message += "Stock:" + producto.getStock();
        return message;

    }
}
