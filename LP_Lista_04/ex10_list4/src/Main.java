import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n, antecessor=0, atual=1, temp;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número para ser o enésimo termo de uma sequência Fibonacci");
        n = in.nextInt();

        while (atual<=n){
            System.out.println(atual);
            temp=atual;
            atual+=antecessor;
            antecessor = temp;
        }
    }
}