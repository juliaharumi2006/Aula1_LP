import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor para descobrir sua tabuada: ");
        n = in.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}