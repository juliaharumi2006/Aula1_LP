import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double vel_km, vel_ms;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma velocidade em Km/h: ");
        vel_km = in.nextDouble();

        vel_ms = vel_km / 3.6;

        System.out.println("A velocidade de " + vel_km + " km/h é equivalente a " + vel_ms + " m/s.");
    }
}