import java.util.Scanner;

public class CobresionDeTipos {
    public static void main(String[] args) {

        //Cobertir tipo String a tipo int
        var edad = Integer.parseInt("20");
        System.out.println("Edad: " + edad);
        System.out.println("Edad: " + (edad + 1));

        var consola = new Scanner(System.in);
        System.out.println("Proporciona tu edad: ");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("Edad: " + edad);

        var edadTexto = String.valueOf(10);
        System.out.println("Edad en texto: " + edadTexto);
    }
}
