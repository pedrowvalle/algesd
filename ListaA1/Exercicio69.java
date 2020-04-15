import java.util.Scanner;
import java.util.Arrays;

public class Exercicio69 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] vet = new char[5];
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite a " + i + " posição do vetor: ");
            vet[i] = scan.next().charAt(0);
        }
        insertSort(vet);
        System.out.println(Arrays.toString(vet));
    }

    public static void insertSort(char vet[]) {
        char insert;
        for (int i = 1; i < vet.length; i++) {
            insert = vet[i];
            int moveItem = i;
            while (moveItem > 0 && vet[moveItem - 1] > insert) {
                vet[moveItem] = vet[moveItem - 1];
                moveItem--;
            }
            vet[moveItem] = insert;
        }
    }
}