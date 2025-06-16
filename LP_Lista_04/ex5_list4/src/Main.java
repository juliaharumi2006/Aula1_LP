import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, fatorial=1;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo: ");
        n = in.nextInt();

        for(int i=1; i<=n ; i++){
            fatorial*=i;
        }
        System.out.println("O fatorial de "+ n + " é "+ fatorial);

    }
}