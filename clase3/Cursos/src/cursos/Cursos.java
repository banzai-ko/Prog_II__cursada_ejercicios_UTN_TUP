/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursos;

/**
 *
 * @author gpennone
 */
public class Cursos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno student = new Alumno("Cosme", "Fulanito", 22);
        Curso course = new  Curso("Nuevo Curso", 100, student);
        course.mostrarInfo();
        Alumno studentInvalid = new Alumno("Cosme", "Fulanito", 16);
        Curso courseInvalid = new  Curso("Nuevo Curso", 100, studentInvalid);
        courseInvalid.mostrarInfo();
    }
    
}
