/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursos;

/**
 *
 * @author gpennone
 */
public class Alumno {
    private String nombre = "";
    private String apellido = "";
    private int edad = 999;

   public Alumno(String name, String lastname, int age) {
        this.nombre = name;
        this.apellido = lastname;
        this.edad = age;
   }
    
    
    public int getEdad() {
        return this.edad;
   }
   
   public String getNombreCompleto() { 
       return this.nombre + " - " + this.apellido;
   }
   
   
    
}
