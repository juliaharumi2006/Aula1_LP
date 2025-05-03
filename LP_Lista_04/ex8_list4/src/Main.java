import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número e descubra se ele é primo: ");
        n = in.nextInt();

        if(n<=1){
            System.out.println("Este número não é primo!");
            return;
        }

        for(int i=2; i<= Math.sqrt(n); i++){
            if(n % i == 0){
                System.out.println("Este número não é primo!");
                return;
            }
        }
        System.out.println("Este número é primo!");
    }
}