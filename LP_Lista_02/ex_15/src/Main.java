import java.util.Scanner;

// Receber o raio e a altura de um cilindro e calcular seu volume.
// V = πr²h
public class Main {
    public static void main(String[] args) {
        int raio, altura;
        double volume;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um raio de um cilindro: ");
        raio = in.nextInt();
        System.out.println("Digite a altura de um cilindro: ");
        altura = in.nextInt();

        volume = Math.PI*Math.pow(raio,2)*altura;

        System.out.println("O volume do cilindro de raio " + raio + " e altura " + altura + " é: " + volume);

    }
}