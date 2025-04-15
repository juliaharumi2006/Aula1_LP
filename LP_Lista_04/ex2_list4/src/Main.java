import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int bigger = 0, smaller = 0, n;


        Scanner in = new Scanner(System.in);

        for(int i=0; i<=4;i++){
            System.out.println("digite um número: ");
            n = in.nextInt();

            if (i == 0) {
                bigger = n;
                smaller = n;
            }

            if(n>bigger){
                bigger = n;
            }
            if(n<smaller){
                smaller = n;
            }
        }
        System.out.println("O número maior é: " + bigger);
        System.out.println("O número menor é: "+ smaller);
    }
}