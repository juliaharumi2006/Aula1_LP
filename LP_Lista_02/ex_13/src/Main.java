import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radius, area;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o raio: ");
        radius = in.nextDouble();

        area = Math.PI * Math.pow(radius,2); //Math é uma biblioteca etática para cálculos matemáticos (não precisa programa-la nem importa-la)
        System.out.println("Area = " + area);
    }
}