import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, result;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        n = in.nextInt();

        result = n%2;

        if(result==0){
            System.out.println(n + " % 2 = " + result);
            System.out.println("Seu número é par");
        }else{
            System.out.println(n + " % 2 = " + result);
            System.out.println("Seu número é ímpar");
        }


    }
}