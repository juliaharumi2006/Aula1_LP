import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double score1, score2, mean, A, B, C, D;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        score1 = in.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        score2 = in.nextDouble();

        mean = (score1+score2)/2;

        if(mean>=8.5){
            System.out.println("Sua média " + mean + " e possui valor A");
        }else if(mean>=7){
            System.out.println("Sua média " + mean + " e possui valor B");
        }
        else if(mean>=5){
            System.out.println("Sua média " + mean + " e possui valor C");
        }
        else{
            System.out.println("Sua média " + mean + " e possui valor D");
        }


    }
}