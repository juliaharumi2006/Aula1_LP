import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option, value, installments;
        double discount5, discount10, rate2, rate5;

        Scanner in = new Scanner(System.in);

        System.out.print("Insira o valor da compra: ");
        value = in.nextInt();
        System.out.println("------------------------------");
        System.out.println("Menu: \n");
        System.out.println("1. Débito");
        System.out.println("2. PIX");
        System.out.println("3. Crédito\n");
        System.out.println("-------------------------------");
        System.out.print("Escolha forma de pagamento: ");
        option = in.nextInt();
        System.out.println("-------------------------------");

        if (option>3) {
            System.out.println("Opção inválida");
        }
        else{
            if (option == 1) {
                System.out.println("Débito selecionado");
            }
            if (option == 2) {
                System.out.println("PIX selecionado");
            }
            if (option == 3) {
                System.out.println("Crédito selecionado");
            }

            System.out.println("-------------------------------");
            System.out.print("Escolha o número de parcelas: ");
            installments = in.nextInt();
            if (installments > 10) {
                System.out.println("Número de parcelas inválida");
            }else{
                switch (option) {
                    case 1:
                        discount5 = (value / 100) * 5;
                        System.out.println("Valor final da compra = R$" + String.format("%.2f", ((value - discount5) / installments)));
                        break;
                    case 2:
                        discount10 = (value / 100) * 10;
                        System.out.println("Valor final da compra = R$" + String.format("%.2f", ((value - discount10) / installments)));
                        break;
                    case 3:
                        if (installments <= 4) {
                            rate2 = (value / 100) * 2;
                            System.out.println("Valor final da compra = R$" + String.format("%.2f", (rate2 + (value / installments))));
                        } else {
                            rate5 = (value / 100) * 5;
                            System.out.println("Valor final da compra = R$" + String.format("%.2f", (rate5 + (value / installments))));
                        }
                        break;
                    default:
                        System.out.println("Esta opção é inválida!");
                }
            }
        }
    }
}