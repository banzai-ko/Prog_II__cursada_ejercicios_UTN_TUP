
import vectornumeros.VectorNumeros;
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gpennone
 */
    public class TestVector {
        
        public static void main(String[] args) {
            VectorNumeros vector  = new VectorNumeros();
            System.out.println("VECTOR: "  + Arrays.toString(vector.getData()) + "\n");
            System.out.println("AVG: " + vector.getAverage() + "\n");
            System.out.println("Above AVG: " + vector.getLimitsAvg(vector.getAverage(), vector.data, true)+ "\n");
            System.out.println("Below AVG: " + vector.getLimitsAvg(vector.getAverage(), vector.data, false)+ "\n");
            String resultStaticA = Arrays.toString(vector.getLimitsAvgStatic(vector.getAverage(), vector.data, true));
            String resultStaticB = Arrays.toString(vector.getLimitsAvgStatic(vector.getAverage(), vector.data, false));
            System.out.println("Above AVG St.: " + resultStaticA + "\n");
            System.out.println("Below AVG St.: " + resultStaticB + "\n");

        }
        
       
    
    
}
