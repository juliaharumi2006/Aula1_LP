import java.util.Scanner;

//Escreva uma função que receba um número inteiro positivo N e retorne a soma de todosos números inteiros de 1 até N.
// Obs.: N deve ser maior que 0.
public class Main {
    public static void main(String[] args) {
        int n, sum=0;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo maior que zero");
        n = in.nextInt();

        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println("A soma dos valores é " + sum);
    }
}