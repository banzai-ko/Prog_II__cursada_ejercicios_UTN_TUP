/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursos;

/**
 *
 * @author gpennone
 */
public class Curso {
    
    private String nombreCurso = "";
    private int cantidadHoras = 0;
    private Alumno alumno = null;
    
    public Curso (String name, int hours, Alumno student) {
        this.nombreCurso = name;
        this.cantidadHoras = hours;
        setAlumno(student);
    }
    public void mostrarInfo() {
        String message =  "";
        message += "Nombre Curso \n";
        message += this.nombreCurso + "\n";
        message += "Cant Horas \n";
        message +=  this.cantidadHoras + "\n";
        message += "Alumno Agregado: \n";
        if (this.alumno != null) {
            message += this.alumno.getNombreCompleto();
        } else {
            message += "No se pudo agregar el alumno";
        }
        System.out.println(message);
    }
    
    private void setAlumno(Alumno alumno){
        if (validarEdad(alumno.getEdad())){
            this.alumno = alumno;
        } else {
            System.out.println("no se pudo ingresar el alumno");
        }
    }
    
    private boolean validarEdad(int age) {
        return age >= 18;
    }
    
    
}
