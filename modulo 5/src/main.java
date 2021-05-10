import java.util.Scanner;

//Faça um programa para a leitura de duas notas parciais de um aluno.
//O programa deve calcular a média alcançada por aluno e apresentar:
//A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
//A mensagem "Reprovado", se a média for menor do que sete;
//A mensagem "Aprovado com Distinção", se a média for igual a dez.

public class main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("\nInsira as duas notas parciais: ");
        float nota1 = myObj.nextFloat();
        float nota2 = myObj.nextFloat();
        float media = (nota1 + nota2) / 2f;
        if (media < 7 & media >= 0) {
            System.out.println("Reprovado.");
        }
        else if (media >= 7 & media < 10) {
            System.out.println("Aprovado.");
        }
        else if (media == 10) {
            System.out.println("Aprovado com Distinção.");
        }
        else {
            System.out.println("Suas notas estao erradas.");

        }

        }

    }
