//Declare e inicialize um vetor, em seguida inverta a sequência dos valores armazenados neste mesmo vetor.
//Restrição: utilizar apenas um vetor e uma variável auxiliar

public class Main {
    public static void main(String[] args) {
        int []vetor = {1,2,3,4,5};
        int aux;

        System.out.println("Vetor original:");
        for(int valor:vetor)
            System.out.print(valor+", ");

        for(int i=0;i< vetor.length/2; i++){
            aux = vetor[(vetor.length-1)-i];
            vetor[(vetor.length-1)-i] = vetor[i];
            vetor[i]=aux;
        }

        System.out.println("\nVetor invertido:");
        for(int valor:vetor)
            System.out.print(valor + ", ");
    }
}