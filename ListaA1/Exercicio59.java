import java.util.Scanner;
import java.util.Arrays;
public class Exercicio59 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int[]vet = new int[5];
        for (int i = 0; i < vet.length; i++){
            System.out.print("Digite a " + i + " posição do vetor: ");
            vet[i] = scan.nextInt();
        }
        bubbleSortCres(vet);
        System.out.println(Arrays.toString(vet));
    }

    public static void bubbleSortCres (int [] vet){
        int n;
        for (int i = 1; i < vet.length; i++){
            for(int j = vet.length - 1; j >= i; j--){
                if(vet[j-1] > vet[j]){
                    n = vet[j-1];
                    vet[j-1] = vet[j];
                    vet[j] = n;
                }
            }
        }
    }
}