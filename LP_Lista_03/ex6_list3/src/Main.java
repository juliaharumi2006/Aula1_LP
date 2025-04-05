import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número entre 5 e 9");
        n = in.nextInt();

        if(n>=5 && n<=9){
            System.out.println("Sua escolha " + n + " foi aceita");
        }else{
            System.out.println("Sua escolha " + n + " foi negada");
        }
    }
}