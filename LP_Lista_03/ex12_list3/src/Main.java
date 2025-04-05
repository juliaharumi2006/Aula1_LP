import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number1, number2, result;
        int option;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite dois numeros separados por espaços");
        number1 = in.nextDouble();
        number2 = in.nextDouble();

        System.out.println("-----------------------------------------------" +
                            "MENU" +
                            "\n----------------------------------------------" +
                            "\n1. Soma" +
                            "\n2. Subtração" +
                            "\n3. Multiplicação" +
                            "\n4. Divisão" +
                            "\n----------------------------------------------" +
                            "\nEscolha uma opção: ");

        option = in.nextInt();

        switch (option){
            case 1:
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case 2:
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case 3:
                result = number1 * number2;
                System.out.println(number1 + " x " + number2 + " = " + result);
                break;
            case 4:
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;
            default:
                System.out.println("Esta opção é inválida");

        }


    }
}