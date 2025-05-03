import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número para ser o enésimo termo de uma sequência Fibonacci");
        n = in.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=0; j<=i;j++){
                System.out.println(j);
            }
        }
    }
}