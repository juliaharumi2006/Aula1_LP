import java.util.Scanner;

//Implemente uma função para calcular o fatorial de um número inteiro $N$ digitado pelo usuário.
public class Main {
    public static void main(String[] args) {
        int n, fatorial=1;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número e descubra seu fatorial: ");
        n = in.nextInt();

        for(int i=1; i<=n;i++){
            fatorial*=i;
        }
        System.out.println("O fatorial de "+ n + " é " + fatorial);
    }
}