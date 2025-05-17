//Receber uma matriz 5x5 e encontrar a maior soma entre suas colunas e a maior soma entre suas linhas.

public class Main {
    public static void main(String[] args) {
        int [][] matriz = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int s_linha=0;
        int maior_linha=0;

        for(int i=0; i<matriz.length; i++){
            s_linha =0;
            for(int j=0; j<matriz[0].length; j++) {
                s_linha += matriz[i][j];
            }
            if (s_linha > maior_linha)
                maior_linha = s_linha;
        }
        for(int i=0;i< matriz.length;i++){

        }
        System.out.println("A maior soma de linhas é "+ maior_linha);


    }
}