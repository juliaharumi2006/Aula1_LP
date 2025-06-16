import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int []numbers = new int[10];
        int max=0, pmax=0, min=0, pmin=0;

        Scanner in = new Scanner(System.in);

        for(int i=0; i<=9; i++) {
            System.out.println("Digite o numero de posição " + i + ": ");
            numbers[i] = in.nextInt();

            if (i == 0) {
                min = numbers[i];
                pmin = i;
            }else {
                if (numbers[i] > max) {
                    max = numbers[i];
                    pmax = i;
                }
                if (numbers[i] < min) {
                    min = numbers[i];
                    pmin = i;
                }
            }
        }
        System.out.println("\nO maior número é " + max + ". Sua posição é " + pmax);
        System.out.println("\nO menor número é " + min + ". Sua posição é " + pmin);
    }
}