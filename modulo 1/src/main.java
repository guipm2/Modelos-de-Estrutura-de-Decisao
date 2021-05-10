import java.util.Scanner;

//Faça um Programa que peça dois números e imprima o maior deles.


public class main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("\nInsira dois numeros aleatorios: ");
        float numero1 = myObj.nextFloat();
        float numero2 = myObj.nextFloat();
        if (numero1 > numero2) {
            System.out.println("O maior numero que voce digitou é: " + numero1);
        }
        else
        System.out.println("O maior numero que voce digitou é: " + numero2);
    }
}
