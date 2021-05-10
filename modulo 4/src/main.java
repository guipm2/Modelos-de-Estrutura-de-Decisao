import java.util.Locale;
import java.util.Scanner;

//Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

public class main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("\nInsira uma letra aleatoria: ");
        String letra = myObj.nextLine();
        switch (letra.toLowerCase()) {
            case "a":
                System.out.println("A letra " + letra + " é vogal.");
                break;
            case "e":
                System.out.println("A letra " + letra + " é vogal.");
                break;
            case "i":
                System.out.println("A letra " + letra + " é vogal.");
                break;
            case "o":
                System.out.println("A letra " + letra + " é vogal.");
                break;
            case "u":
                System.out.println("A letra " + letra + " é vogal.");
                break;
            default:
                System.out.println("A letra " + letra + " é consoante.");
        }
    }
}
