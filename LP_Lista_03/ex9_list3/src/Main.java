import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite três valores separados por espaços: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if(a<(b+c) && a>Math.abs(b-c) && b<(a+c) && b>Math.abs(a-c)&& c<(b+a) && c>Math.abs(a-b)){//Math.abs retorna o valor absoluto, desconsiderando seu sinal
            System.out.println("a, b e c formam um triângulo!");

            if(a==b && a==c)
                System.out.println("Triângulo equilátero.");
            else if (a==b || b==c || a==c)
                System.out.println("Triângulo Isóceles");
            else
                System.out.println("Triângulo Escaleno");
        }
        else{
            System.out.println("a, b e c não podem formar um triângulo");
        }
    }
}