import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        int year;

        Scanner in = new Scanner(System.in);
        System.out.println("Informe seu nome");
        name = in.next();//leitura no formato string

        System.out.println("Informe seu ano de nascimento: ");
        year = in.nextInt();

        menu(name);//deve ser chamado na mesma ordem na qual é declarado na função

        gerarSaudacao(name, year);
        }

    //public -> essa função é publica para todos os diretórios que estiverem no mesmo diretório raiz
    //void -> função que não tem retorno (é vazia)
    public static void menu(String name){ //assinatura da função
        System.out.println("Bem vindo " + name);
        System.out.println("\nMenu");
        System.out.println("Opção 1");
        System.out.println("Opção 2");
        System.out.println("Opção 3");
        System.out.println("\ntchau "+name);
    }

    public static void gerarSaudacao(String name, int year){
        int age = calculo(year);
        System.out.println("Bem vindo "+ name);
        System.out.println("Você tem "+ age +" anos");
    }

    public static int calculo(int year){
        int age;
        age = 2025-year;
        return age;
    }
}