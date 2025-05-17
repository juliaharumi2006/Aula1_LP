//Receber uma matriz 5x5 e encontrar a maior soma entre suas colunas e a maior soma entre suas linhas.
// Pedir ajuda para o Cainã
public class Main {
    public static void main(String[] args) {
        int [][] matriz = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int maiorLinha = Integer.MIN_VALUE;
        int maiorColuna = Integer.MIN_VALUE;
        int somaLinhas = 0, somaColunas = 0;

        for(int i=0; i<matriz.length; i++) {
            somaLinhas = 0;
            for (int j = 0; j < matriz.length; j++){
                somaLinhas += matriz[i][j];
                somaColunas += matriz[j][i];
            }
        }
        if(somaLinhas>maiorLinha)
            maiorLinha = somaLinhas;
            System.out.println("O linha de maior valor é:" + maiorLinha);

        if(somaColunas>maiorColuna)
            maiorColuna = somaColunas;
            System.out.println("O linha de maior valor é:" + maiorColuna);
    }
}

