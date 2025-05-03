import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n1, n2, val1, val2;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite dois números inteiros separados por epaço, e veja quais números naturais existem entre eles: ");
        n1 = in.nextInt();
        n2 = in.nextInt();

        if(n1>n2){
            val1 = n2;
            val2 = n1;

            if(val2 - val1 == 1){
                System.out.println("Não existe números entre este intervalo!");
            }else{
                for (int i=val1+1; i<=val2-1; i++) {
                    System.out.println(i);
                }
            }
        }else{
            if(n2-n1==1){
                System.out.println("Não existe números entre este intervalo!");
            }else{
                for (int i=n1+1; i<=n2-1; i++) {
                    System.out.println(i);
                }
            }
        }
    }
}