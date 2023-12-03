public class Char {
    public static void main(String[] args) {
        //char solo soporta una comilla
        char miCaracter = 'a';
        System.out.println("Mi caracter: " + miCaracter);

        //Usando la lista de Unicode characters
        char varChar = '\u0021';
        System.out.println("Mi caracter: " + varChar);

        char varCharDecimal = 33;
        System.out.println("Mi caracter: " + varCharDecimal);

        char varCharSimbolo = '!';
        System.out.println("Mi caracter: " + varCharSimbolo);
    }
}
