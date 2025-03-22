import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mm, pol;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma medida em milímetros: ");
        mm = in.nextDouble();

        pol = mm / 25.4;

        System.out.println("A medida de " + mm + " mm é equivalente à " + pol + " pol.");
    }
}