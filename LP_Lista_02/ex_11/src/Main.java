import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double C, F;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma temperatura em graus Celsius: ");
        C = in.nextDouble();

        F = C * 1.8 + 32;
        System.out.println( C + "°C = " + F + "°F");
    }
}