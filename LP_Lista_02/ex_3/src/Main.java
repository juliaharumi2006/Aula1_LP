import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number, result;

        Scanner in = new Scanner(System.in); //configura a leitura do teclado (cria só uma vez no programa)

        System.out.println("Digite um número inteiro: ");
        number = in.nextDouble(); //pega o dado inserido pelo scanner e converte em double

        result = number / 5;
        System.out.println("A quinta parte de " + number + " é " + result);
    }
}