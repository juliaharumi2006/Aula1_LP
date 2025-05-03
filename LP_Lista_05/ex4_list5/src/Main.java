import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int []numbers = new int[10];
        int max=0, pmax=0;

        Scanner in = new Scanner(System.in);

        for(int i=0; i<=9; i++){
            System.out.println("Digite o numero de posição " + i + ": ");
            numbers[i] = in.nextInt();

            if(numbers[i]>max){
                max = numbers[i];
                pmax = i;
            }
        }
        System.out.println("\nO maior número é " + max + ". Sua posição é " + pmax);
    }
}