import java.util.Scanner;

//Faça um Programa que leia três números e mostre o maior e o menor deles.

public class main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("\nInsira 3 numeros distintos:");
        float num1 = myObj.nextFloat();
        float num2 = myObj.nextFloat();
        float num3 = myObj.nextFloat();
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("O maior numero é " + num1);
            }
        }
        if (num2 > num1) {
            if (num2 > num3) {
                System.out.println("O maior numero é " + num2);
            }
        }
        if (num3 > num1) {
            if (num3 > num2) {
                System.out.println("O maior numero é " + num3);
            }
        }
        if (num1 < num2) {
            if (num1 < num3) {
                System.out.println("O menor numero é " + num1);
            }
        }
        if (num2 < num1) {
            if (num2 < num3) {
                System.out.println("O menor numero é " + num2);
            }
        }
        if (num3 < num1) {
            if (num3 < num2) {
                System.out.println("O menor numero é " + num3);
            }
        }
    }

}
