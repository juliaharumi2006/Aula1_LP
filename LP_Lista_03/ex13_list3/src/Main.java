import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option, basis, height, ray;
        double hipotenusa;

        Scanner in = new Scanner(System.in);

        System.out.println("\nMENU: ");
        System.out.println("1. Círculo");
        System.out.println("2. Triângulo retângulo");
        System.out.println("3. Retângulo");
        System.out.println("------------------------------------");
        System.out.print("Escolha uma opção: ");
        option = in.nextInt();
        System.out.println("------------------------------------");
        System.out.print("Informe a base: ");
        basis = in.nextInt();
        System.out.print("Informe a altura: ");
        height = in.nextInt();

        switch (option){
            case 1:
                ray = height/2;
                System.out.print("Área = " + String.format("%.2f", (Math.PI*Math.pow(ray, 2))));
                System.out.print("\nPerímetro = " + String.format("%.2f", (2*Math.PI*ray)));
            break;
            case 2:
                hipotenusa = Math.sqrt((Math.pow(basis,2) + Math.pow(height, 2)));
                System.out.println(hipotenusa);
                System.out.print("Área = " + (basis*height)/2);
                System.out.print("\nPerímetro = " + String.format("%.2f", (hipotenusa+basis+height)));
                break;
            case 3:
                System.out.print("Área = " + (basis*height));
                System.out.print("\nPerímetro = " + ((basis*2)+(height*2)));
                break;
            default:
                System.out.println("Esta opção não existe.");
        }

    }
}