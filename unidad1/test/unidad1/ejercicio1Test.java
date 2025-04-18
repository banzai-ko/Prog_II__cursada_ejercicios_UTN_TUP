package unidad1;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class ejercicio1Test {

    private final InputStream originalSystemIn = System.in;
    private final PrintStream originalSystemOut = System.out;

    @BeforeEach
    public void setUp() {
        // Se asegura de restablecer la entrada y salida estándar antes de cada prueba.
    }

    @AfterEach
    public void tearDown() {
        System.setIn(originalSystemIn); // Restaura la entrada estándar
        System.setOut(originalSystemOut); // Restaura la salida estándar
    }

    /**
     * Test of pedirDatos method, of class ejercicio1.
     */
    @Test
    public void testPedirDatos() {
        // Simulamos la entrada de consola para edad y nombre
        String simulatedInput = "99\nCarlos\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes())); // Redirige la entrada estándar

        // Capturamos la salida estándar
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream)); // Redirige la salida estándar a outputStream

        // Creamos una instancia de ejercicio1 y llamamos al método
        ejercicio1 instance = new ejercicio1();
        instance.pedirDatos(); // Ejecuta el método que leerá la entrada y escribirá en la salida

        // Esperamos la salida correcta
        String expectedOutput = "El usuario ingresado es: \nNombre: Carlos\nEdad: 99\n";

        // Validamos que la salida sea la esperada
        assertEquals(expectedOutput, outputStream.toString());

        // Si la salida es correcta, el test pasa.
    }
}
