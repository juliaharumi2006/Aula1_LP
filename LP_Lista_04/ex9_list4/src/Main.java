import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int result, option;
        boolean again = true;
        boolean voltar=true;

        Scanner in = new Scanner(System.in);

        while (again) {
            System.out.println("Seja bem vindo ao jogo da tabuada!!!");
            System.out.println("------------------------------------");

            for (int i = 1; i <= 2; i++) {
                for (int j = 1; j <= 2; j++) {
                    System.out.println("\n" + i + " x " + j);
                    System.out.print("Resultado: ");
                    result = in.nextInt();

                    if (result != i * j) {
                        System.out.println("\nResposta errada!");
                        System.out.println("Deseja jogar novamente? ");
                        System.out.println("1. Sim");
                        System.out.println("2. Não");
                        option = in.nextInt();

                        switch (option) {
                            case 1:
                                System.out.println("Voltando");
                                break;
                            case 2:
                                again = false;
                                break;
                            default:
                                System.out.println("Opção inválida!");
                        }
                    }
                }
            }
            System.out.println("Parabéns! Você acertou todas as questões!");
            System.out.println("Deseja jogar novamente?");

        }
    }
}