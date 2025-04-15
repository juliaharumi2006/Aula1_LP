public class Main {
    public static void main(String[] args) {
        int ponteiro;

        //int []numbers = {0,6,5,2,1};

       // int [][] numbers2 = new int[2][2]; // declaração sem inicialização
        int [][] matriz = {{5,8,9},{9,6,4},{2,3,4}};

        //matriz
        //System.out.println(matriz[1][2]);



        //for(int i=0;i<numbers.length;i++) //numbers.length -> tamanho do vetor
           // System.out.println(numbers[i]);

       // for(int number:numbers) //foreach -> cria uma variável "number" que serve como ponteiro, pois percorre todos os indices do vetor
            //System.out.println(numbers[number]);

        for(int i=0; i< matriz.length; i++) {
            for(int j=0; j< matriz[1].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        for(int [] row:matriz){
            for(int valor:row)
                System.out.println(valor);
        }



    }
}