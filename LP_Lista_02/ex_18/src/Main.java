import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, x;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o coeficiente angular: ");
        a = in.nextDouble();

        System.out.println("Digite o coeficiente linear: ");
        b = in.nextDouble();

        x = -b / a;
        System.out.println(a + "x + " + b + " = 0");
        System.out.println("x = " + x);
    }
}