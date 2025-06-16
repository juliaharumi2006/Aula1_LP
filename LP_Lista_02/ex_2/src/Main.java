import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, result;

        Scanner in = new Scanner(System.in); //configura a leitura do teclado (cria só uma vez no programa)

        System.out.println("Digite um número inteiro: ");
        number = in.nextInt(); //pega o dado inserido pelo scanner e converte em int

        result = number * number;
        System.out.println("O quadrado de " + number + " é " + result);
    }
}