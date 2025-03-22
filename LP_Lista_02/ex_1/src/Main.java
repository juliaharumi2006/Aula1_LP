import java.util.Scanner; //importa a classe scanner

public class Main {
    public static void main(String[] args) {
        int number, result;

        Scanner in = new Scanner(System.in); //configura a leitura do teclado (cria só uma vez no programa)

        System.out.println("Digite um número inteiro: ");
        number = in.nextInt(); //pega o dado inserido pelo scanner e converte em int

        result = 2 * number;
        System.out.println("O dobro de " + number + " é " + result);
    }
}