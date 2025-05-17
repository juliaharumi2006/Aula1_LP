import java.util.Scanner;

// Receber velocidade inicial, aceleração e tempo de percurso de um corpo e calcular sua velocidade.
// V = V0 + a * t
public class Main {
    public static void main(String[] args) {
        int V0, a;
        double V, t;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a velocidade inicial de um automóvel: ");
        V0 = in.nextInt();
        System.out.println("Digite a aceleração de um automóvel: ");
        a = in.nextInt();
        System.out.println("Digite o tempo de aceleração de um automóvel em horas: ");
        t = in.nextInt();

        V = V0 + a * t;

        System.out.println("A velocidade deste automóvel é de: " + V + "km/h");
    }
}