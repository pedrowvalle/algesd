import java.util.Scanner;
import java.util.Arrays;
public class Exercicio62 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int[]vet = new int[5];
        for (int i = 0; i < vet.length; i++){
            System.out.print("Digite a " + i + " posição do vetor: ");
            vet[i] = scan.nextInt();
        }
        int ciclos = bubbleSortCres(vet);
        System.out.println(Arrays.toString(vet));
        System.out.println("QUantidade de operações realizadas para ordenar o vetor: " + ciclos);
    }

    public static int bubbleSortCres (int [] vet){
        int n;
        int ciclos = 0;
        for (int i = 1; i < vet.length; i++){
            for(int j = vet.length - 1; j >= i; j--){
                if(vet[j-1] > vet[j]){
                    n = vet[j-1];
                    vet[j-1] = vet[j];
                    vet[j] = n;
                }
                ciclos++;
            }
        }
        return ciclos;
    }
}