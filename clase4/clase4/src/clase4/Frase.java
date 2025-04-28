import java.util.Scanner;

public class Frase {

    private String frase;

    public Frase(String frase) {
        this.frase = frase;
    }

    public int contarCaracteres() {
        return frase.length();
    }

    public int contarPalabras() {
        String[] palabras = frase.trim().split("\\s+");
        return frase.trim().isEmpty() ? 0 : palabras.length;
    }

    public String convertirMayusculas() {
        return frase.toUpperCase();
    }

    public String convertirMinusculas() {
        return frase.toLowerCase();
    }

    public boolean contieneJava() {
        return frase.toLowerCase().contains("java");
    }

    public String mostrarResultados() {
        StringBuilder message = new StringBuilder();
        message.append("Cantidad de caracteres: ").append(contarCaracteres()).append("\n");
        message.append("Cantidad de palabras: ").append(contarPalabras()).append("\n");
        message.append("Frase en mayúsculas: ").append(convertirMayusculas()).append("\n");
        message.append("Frase en minúsculas: ").append(convertirMinusculas()).append("\n");
        message.append("¿Contiene la palabra \"java\"?: ").append(contieneJava() ? "Sí" : "No");

        return message.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String input = scanner.nextLine();

        Frase fraseUsuario = new Frase(input);
        System.out.println("\n--- RESULTADOS ---");
        System.out.println(fraseUsuario.mostrarResultados());

        scanner.close();
    }
}
