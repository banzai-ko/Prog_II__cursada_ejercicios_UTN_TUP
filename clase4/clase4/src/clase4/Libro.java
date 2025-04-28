/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase4;

/**
 *
 * @author gpennone
 */
public class Libro {
    private String titulo = "";
    private String autor = "";
    private Genero genero = null;
    
    private enum Genero {
        FICCION("Ficción"),
        NO_FICCION("No Ficción"),
        POESIA("Poesía"),
        ENSAYO("Ensayo"),
        INFANTIL("Literatura Infantil");

        private final String descripcion;

        Genero(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getDescripcion() {
            return descripcion;
        }
    }
    public Libro(String titulo, String autor, Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    public boolean esGenero(String texto) {
        return genero.name().equalsIgnoreCase(texto) || 
               genero.getDescripcion().equalsIgnoreCase(texto);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Genero getGenero() {
        return genero;
    }
    
    
}

