import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        for(int i= -80; i<=80; i += 10){
            System.out.println("F = 9/5 * " + i + " + 32");
        }
    }
}