import java.util.Scanner;

//Faça um Programa que leia três números e mostre-os em ordem decrescente.

public class main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Insira 3 numeros distintos:");
        int num1 = myObj.nextInt();
        int num2 = myObj.nextInt();
        int num3 = myObj.nextInt();
        if (num1 > num2 && num2 > num3) {
            System.out.println(num1 + " " + num2 + " " + num3);
        } else if (num2 > num1 && num1 > num3) {
            System.out.println(num2 + " " + num1 + " " + num3);
        } else if (num3 > num1 && num1 > num2) {
            System.out.println(num3 + " " + num1 + " " + num2);
        } else if (num3 > num2 && num2 > num1) {
            System.out.println(num3 + " " + num2 + " " + num1);
        } else if (num1 > num3 && num3 > num2) {
            System.out.println(num1 + " " + num3 + " " + num2);
        } else if (num2 > num3 && num3 > num1) {
            System.out.println(num2 + " " + num3 + " " + num1);
        } else {
            System.out.println("os números são iguais");
        }
    }
    }


