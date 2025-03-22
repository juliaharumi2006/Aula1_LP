import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km, miles;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma distância em quilometros: ");
        km = in.nextDouble();

        miles = km / 1.6;

        System.out.println("A distância de " + km + " km é equivalente à " + miles + " milhas.");
    }
}