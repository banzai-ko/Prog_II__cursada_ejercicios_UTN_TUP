/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queueTest;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author gpennone
 */
public class QueueTest {

    public static void main(String[] args) {
        Queue<Persona> cola = new LinkedList<>();

        cola.add(new Persona("Cosme", "Fulanito"));
        cola.add(new Persona("Pepa", "Pistas"));
        cola.add(new Persona("Maxi", "Casos"));
        cola.add(new Persona("John", "Doe"));
        cola.add(new Persona("Guy", "Incognito"));
        cola.add(new Persona("NN","NoName"));

        
        while (!cola.isEmpty()) {
            Persona persona = cola.poll();
            System.out.println(persona.getNombreCompleto() + " ha comprado su entrada" +" 🎟️");
        }
    }
    
}
