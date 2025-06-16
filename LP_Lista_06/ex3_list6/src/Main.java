//Crie uma função para calcular a potência de um número inteiro $x$ elevado a uma potência inteira $y$. Os valores de $x$ e $y$ serão
//fornecidos pelo usuário. $y$ deve ser maior ou igual a zero. <font color="red">Proibido utilizar ```Math.pow(x,y)```</font>.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y, potencia=1;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        x = in.nextInt();

        System.out.println("Digite um número inteiro maior ou igual a zero: ");
        y = in.nextInt();
        if(y<0){
            System.out.println("Valor inválido!");
            System.exit(0); //encerra o programa em qualquer ponto
        }

        for(int i=1;i<=y;i++){
            potencia*=x;
        }

        System.out.println("A potência de "+ x + " elevado a " + y + " é de " + potencia);


    }
}