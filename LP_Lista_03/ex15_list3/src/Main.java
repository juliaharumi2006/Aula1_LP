import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value, option;

        Scanner in = new Scanner(System.in);

        System.out.print("Insira o dinheiro: ");
        value = in.nextInt();
        System.out.println("---------------------------");
        System.out.println("Menu:");
        System.out.println("1. Café Expresso R$0,50");
        System.out.println("2. Café Longo R$1,00");
        System.out.println("3. Capuccino R$2,50");
        System.out.println("4. Chocolate R$2,00");
        System.out.println("---------------------------");
        System.out.print("Escolha uma opção: ");
        option = in.nextInt();
        System.out.println("---------------------------");

        if (option > 4) {
            System.out.println("Opção não indisponível");
        } else {
            if (option == 1) {
                if(value<0.50){
                    System.out.println("Saldo insuficiente");
                }else{
                    System.out.println("Bebida selecionada: Café Expresso");
                    System.out.println("Seu troco = " + String.format("%.2f", (value-0.50) ));
                }
            }

            if (option == 2) {
                if(value<1.00){
                    System.out.println("Saldo insuficiente");
                }else{
                    System.out.println("Bebida selecionada: Café Longo");
                    System.out.println("Seu troco = " + String.format("%.2f", (value-1.00) ));
                }
            }
            if (option == 3) {
                if(value<2.50){
                    System.out.println("Saldo insuficiente");
                }else{
                    System.out.println("Bebida selecionada: Capuccino");
                    System.out.println("Seu troco = " + String.format("%.2f", (value-2.50) ));
                }
            }
            if (option == 4) {
                if(value<2.00){
                    System.out.println("Saldo insuficiente");
                }else{
                    System.out.println("Bebida selecionada: Chocolate");
                    System.out.println("Seu troco = " + String.format("%.2f", (value-2.00) ));
                }
            }
        }
    }
}