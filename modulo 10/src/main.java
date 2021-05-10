import java.util.Scanner;

//Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
//Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.

public class main {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Em que turno você estuda? M - Matutino V - Vespertino N - Noturno");
        String turno = myObj.next();

        switch (turno){
            case "M","m": {
                System.out.println("Bom Dia!");
            }break;
            case "V","v": {
                System.out.println("Boa Tarde!");
            }break;
            case "N","n": {
                System.out.println("Boa Noite!");
            }break;

            default:
                System.out.println("Valor Inválido");
        }
    }
}

