/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase4;

/**
 *
 * @author gpennone
 */
public class CadenaNumerica {

    private StringBuilder cadena;

    public CadenaNumerica() {
        this.cadena = new StringBuilder();
    }

    public void construirCadena() {
        for (int i = 1; i <= 100; i++) {
            cadena.append(i);
            if (i < 100) {
                cadena.append("-");
            }
        }
    }

    public int obtenerLongitud() {
        return cadena.length();
    }

    public String generarMensaje() {
        construirCadena();

        String message = "Cadena generada:\n";
        message += cadena.toString() + "\n" ;
        message += "Longitud total: " + obtenerLongitud();

        return message;
    }

    public static void mostrarCadena(String[] args) {
        CadenaNumerica cn = new CadenaNumerica();
        String resultado = cn.generarMensaje();
        System.out.println(resultado);
    }
}


