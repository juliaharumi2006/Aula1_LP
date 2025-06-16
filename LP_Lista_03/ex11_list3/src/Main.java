import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        String dia;

        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        num = in.nextInt();

        switch (num) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-feira";
                break;
            case 3:
                dia = "Terça-feira";
                break;
            case 4:
                dia = "Quarta-feira";
                break;
            case 5:
                dia = "Quinta-feira";
                break;
            case 6:
                dia = "Sexta-feira";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Número inválido! Digite um número de 1 a 7.";
                break;
        }
        System.out.println("O número digitado é referente ao dia da semana: "+ dia);
    }
}