import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int result, option=0;
        boolean again = true;
        boolean voltar=true;

        Scanner in = new Scanner(System.in);

        while (again) {
            System.out.println("Seja bem vindo ao jogo da tabuada!!!");
            System.out.println("------------------------------------");

            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.println("\n" + i + " x " + j);
                    System.out.print("Resultado: ");
                    result = in.nextInt();

                    if (result != i * j) {
                        System.out.println("\nResposta errada!");
                        System.out.println("Deseja jogar novamente? ");
                        System.out.println("1. Sim");
                        System.out.println("2. Não");
                        option = in.nextInt();

                        if(option==1) {
                            System.out.println("Voltando");
                            break;
                        }
                        else if(option==2) {
                            again = false;
                            return;
                        }else{
                            System.out.println("Opção inválida!");
                        }
                    }
                }
                if(option==1){
                    option=0;
                    break;
                }
            }
        }

            System.out.println("Parabéns! Você acertou todas as questões!");
    }
}