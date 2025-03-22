import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km, miles;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma distância em milhas: ");
        miles = in.nextDouble();

        km = miles * 1.6;

        System.out.println("A distância de " + miles + " milhas é equivalente à " + km + " km.");
    }
}