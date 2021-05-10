import java.util.Scanner;

//Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

public class main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("\nInsira um valor: ");
        float valor = myObj.nextFloat();
        if (valor > 0) {
            System.out.println("O numero " + valor + " é positivo.");
        }
        else if (valor < 0) {
            System.out.println("O numero " + valor + " é negativo.");
        }
        else {
            System.out.println("O numero digitado é 0.");
        }
    }
}
