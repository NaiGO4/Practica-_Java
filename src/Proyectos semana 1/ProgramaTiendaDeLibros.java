import java.util.Scanner;

public class ProgramaTiendaDeLibros {
    public static void main(String[] args) {
        System.out.println("Compra de libro");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre del libro: " );
        var nombre = scanner.nextLine();

        System.out.println("ID del producto: ");
        var id = scanner.nextInt();

        System.out.println("Precio del producto: ");
        var precio = scanner.nextDouble();
        System.out.println("Precion del producto: ");

        boolean envio = java.lang.Boolean.parseBoolean(scanner.nextLine());

        System.out.printf(nombre + " " + '#' + " "+ precio);
        System.out.printf(" Presio: " + '$'+ " "+ precio);
        System.out.printf(" Envio gratis: " + envio);



    }
}
