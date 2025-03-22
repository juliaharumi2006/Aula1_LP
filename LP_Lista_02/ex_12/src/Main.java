import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    double n1, n2, media;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        n1 = in.nextDouble();

        System.out.println("Digite a segunda nota: ");
        n2 = in.nextDouble();

        media = (n1 + 2 * n2) / 3;

        System.out.println("A sua média é " + media);
    }
}