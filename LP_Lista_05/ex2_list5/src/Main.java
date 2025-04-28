public class Main {
    public static void main(String[] args) {
        int []vetor = {1,2,3,4,5,6,7,8,9,10};

        for(int i=0; i<vetor.length; i++){
            if(i%2==0){
                System.out.println(vetor[i]+2);
            }else{
                System.out.println(vetor[i]*2);
            }
        }
    }
}