import java.util.Scanner;
import java.util.Arrays;
public class Exercicio61 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double[]vet = new double[20];
        for (int i = 0; i < vet.length; i++){
            System.out.print("Digite a " + i + " posição do vetor: ");
            vet[i] = scan.nextDouble();
        }
        bubbleSortDecres(vet);
        System.out.println(Arrays.toString(vet));
    }

    public static void bubbleSortDecres (double [] vet){
        double n;
        for(int i = vet.length-1; i >= 0; i--){
            for(int j = 0; j < i; j++){
                if(vet[j] < vet[j+1]){
                    n = vet[j+1];
                    vet[j+1] = vet[j];
                    vet[j] = n;
                }
            }
        }
    }
}