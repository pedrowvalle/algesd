import java.util.Scanner;
import java.util.Arrays;
public class Exercicio65{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a quantidade de posições do vetor");
        int n = scan.nextInt();
        int [] vet = new int[n];
        for(int i = 0; i < vet.length; i++){
            System.out.print("Digite a " + i + " posição do vetor: ");
            vet[i] = scan.nextInt();
        }
        selectSort(vet);
        System.out.println(Arrays.toString(vet));
    }

    public static void selectSort (int[]vet){
        int index;
        int minor;
        for(int i = 0; i < vet.length-1; i++){
            index = i;
            minor = vet[i];
            for (int j = i+1; j < vet.length; j++){
                if (vet[j] < minor){
                    minor = vet[j];
                    index = j;
                }
            }
            vet[index] = vet[i];
            vet[i] = minor;
        }
    }
}