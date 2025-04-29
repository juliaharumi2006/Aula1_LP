import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int n;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        n = in.nextInt();

        for (int i = 0; i <= 9; i++) {
            if (vetor[i] == n) {
                System.out.println("Esse valor existe no vetor! Sua posição é " + i);
                return; //encerra o programa
            }
        }

        System.out.println("Valor não encontrado");
    }
}