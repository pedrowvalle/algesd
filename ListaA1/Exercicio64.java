import java.util.Scanner;
import java.util.Arrays;
public class Exercicio64{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char [] vet = new char[5];
        for(int i = 0; i < vet.length; i++){
            System.out.print("Digite a " + i + " posição do vetor: ");
            vet[i] = scan.next().charAt(0);
        }
        selectSort(vet);
        System.out.println(Arrays.toString(vet));
    }

    public static void selectSort (char[]vet){
        int index;
        char minor;
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