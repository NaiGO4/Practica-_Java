import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ingresa tu nombre: ");
        Scanner cosnola = new Scanner(System.in);
        
        var usurio = cosnola.nextLine();

        System.out.println("Ingresa tu cargo: ");
        var cargo = cosnola.nextLine();

        System.out.println("Hola " + cargo + " " + usurio);
    }

}