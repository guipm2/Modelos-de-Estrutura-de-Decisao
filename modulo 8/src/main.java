import java.util.Scanner;

//Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar,
//sabendo que a decisão é sempre pelo mais barato.

public class main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Insira o valor dos 3 produtos abaixo:");
        float valor1 = myObj.nextFloat();
        float valor2 = myObj.nextFloat();
        float valor3 = myObj.nextFloat();
        if (valor1 < valor2) {
            if (valor1 < valor3) {
                System.out.println("Você deve comprar o produto de valor " + valor1 + " pois é mais barato.");
            }
        }
        if (valor2 < valor1) {
            if (valor2 < valor3) {
                System.out.println("Você deve comprar o produto de valor " + valor2 + " pois é mais barato.");
            }
        }
        if (valor3 < valor1) {
            if (valor3 < valor2) {
                System.out.println("Você deve comprar o produto de valor " + valor3 + " pois é mais barato.");
            }
        }
    }
}
