import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite três números separados por espaços");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        System.out.println(a +"x² + " + b + "x + " + c + " = 0");

        delta = Math.pow(b,2) -4 * a * c;

        System.out.println("Delta = " + b + "² -4 * " + a + " * " + c + " = " + delta);

        if(delta<=0){
            System.out.println("Não existem raizes reais para essa equação");
        }
        else{
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("As raízes reais dessa equação são: " + x1 + " e " + x2);
        }

    }
}