//Escreva uma função em Java para verificar se uma String é um palíndromo. A String deve ser digitada pelo usuário.
// Um palíndromo é uma palavra, frase ou sequência que se lê da mesma forma de trás para frente.
//Exemplos: “ovo”, “tenet”, “abasedotetodesaba”.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String text, text_inverted="";

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase sem espaços e sinais de pontuação, e descubra se ela é um palíndromo: ");
        text = in.nextLine();

        for(int i=text.length()-1;i>=0;i--) {
            System.out.print(text.charAt(i) + " ");
        }
    }
}