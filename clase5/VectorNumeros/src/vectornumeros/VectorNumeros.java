/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectornumeros;
import java.util.ArrayList;


/**
 *
 * @author gpennone
 */
public class VectorNumeros {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {}
// Simula entrada
    public int[] data ;
    private double average;
    
    public VectorNumeros() {
        this.data = java.util.stream.IntStream.generate(() -> (int)(Math.random() * 100)).limit(10).toArray(); // Random 10;
        this.average = average(this.data);
        
    }
    
    
    private double average(int[] vector) {
        int sum = 0;
        for(int number : vector) {
            sum += number;

     } 
        return (double) sum / vector.length; // El casting es necesario, o es implicito?
    }
    
    public double getAverage() {
        return this.average;
    }
    
    public int[] getData() {
        return this.data;
    }
    
    public ArrayList<Integer> getLimitsAvg(double avg, int[] data, boolean above) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int elem : data) {
            if(above && elem > avg || !above && elem < avg) 
                result.add(elem);
        }
        return result;
    }
    
    public int[] getLimitsAvgStatic(double avg, int[] data, boolean above) { // Estático con arrays
    
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > avg) {
                count++;
            }
        }

        int[] result = new int[count];
        int idx = 0;


        for (int i = 0; i < data.length; i++) {
            if (above && data[i] > avg || !above && data[i] < avg) 
                result[idx++] = data[i];
        }
        
        return result;
    }
    
}
    
    