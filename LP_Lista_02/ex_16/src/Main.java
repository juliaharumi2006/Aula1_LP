import java.util.Scanner;

//Receber o raio e a altura de um cone e calcular seu volume.
//  V = (π * r² * h) / 3
public class Main {
    public static void main(String[] args) {
        int raio, altura;
        double volume;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um raio de um cone: ");
        raio = in.nextInt();
        System.out.println("Digite a altura de um cone: ");
        altura = in.nextInt();

        volume = (Math.PI*Math.pow(raio,2)*altura)/3;

        System.out.println("O volume do cone de raio " + raio + " e altura " + altura + " é: " + volume);
    }
}