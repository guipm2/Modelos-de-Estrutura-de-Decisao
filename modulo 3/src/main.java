import java.util.Scanner;

//Faça um Programa que verifique se uma letra digitada é "F" ou "M".
//Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.

public class main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("\nDigite F ou M: ");
        String letra = myObj.nextLine();
        switch(letra) {
            case "F":
                System.out.println("F - Feminino.");
                break;
            case "M":
                System.out.println("M - Masculino.");
                break;
            default:
                System.out.println("Sexo Inválido.");
            }
        }

    }
