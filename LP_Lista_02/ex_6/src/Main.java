import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double vel_km, vel_ms;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma velocidade em m/s: ");
        vel_ms = in.nextDouble();

        vel_km = vel_ms * 3.6;

        System.out.println("A velocidade de " + vel_ms + " m/s é equivalente a " + vel_km + " km/h.");
    }
}