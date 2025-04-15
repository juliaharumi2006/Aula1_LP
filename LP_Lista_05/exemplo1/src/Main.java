public class Main {
    public static void main(String[] args) {
        int []numbers1 = new int[5]; //Declaração sem inicialização
        numbers1[0] = 0;
        numbers1[1] = 6;
        numbers1[2] = 5;
        numbers1[3] = 2;

        int []numbers2 = {0,6,5,2,1}; //Declaração com inicialização

        numbers1[4] = numbers2[4];


        System.out.println(numbers1[1]); //Se voce inicializar um vetor sem ter atribuido valores a ele, ele irá printar zero em todos os indices
        System.out.println(numbers2[1]);


    }
}