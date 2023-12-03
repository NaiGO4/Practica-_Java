import java.util.Scanner;

public class RegistroDeLibro {
    public static void main(String[] args) {
        System.out.println("Hola, ingresa el registro del libro con cautor ");
        System.out.println("Nombre del libro: ");
        Scanner scanner = new Scanner(System.in);

        String nombre = scanner.nextLine();

        System.out.println("Ingresa el nombre del Autor: ");
        String autor = scanner.nextLine();

        System.out.println("El nombre del libro es: " + nombre + ", el nombre del autor es: " + autor);

    }
}
