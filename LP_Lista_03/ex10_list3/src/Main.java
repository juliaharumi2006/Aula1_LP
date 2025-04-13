import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite três números separados por espaços");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if(a<b && b<c){
            System.out.println("Ordem crescente: "+ a +" , "+ b +" , "+ c);
        }if(a<c && c<b){
            System.out.println("Ordem crescente: "+ a +" , "+ c +" , "+ b);
        }if(b<a && a<c){
            System.out.println("Ordem crescente: "+ b +" , "+ a +" , "+ c);
        }if(b<c && c<a){
            System.out.println("Ordem crescente: "+ b +" , "+ c +" , "+ a);
        }if(c<a && a<b){
            System.out.println("Ordem crescente: "+ c +" , "+ a +" , "+ b);
        }if(c<b && b<a){
            System.out.println("Ordem crescente: "+ c +" , "+ b +" , "+ a);
        }

    }
}