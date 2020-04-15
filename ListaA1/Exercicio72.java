import java.util.Scanner;
import java.util.Arrays;
public class Exercicio72{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char [] vet = new char[5];
        for(int i = 0; i < vet.length; i++){
            System.out.print("Digite a " + i + " posição do vetor: ");
            vet[i] = scan.next().charAt(0);
        }
        System.out.println("Operações realizadas = " + insertSort(vet));
        System.out.println(Arrays.toString(vet));
    }

    public static int insertSort(char vet[]) {
        char insert;
        int count = 0;
        for (int i = 1; i < vet.length; i++) {
            insert = vet[i];
            int moveItem = i;
            while (moveItem > 0 && vet[moveItem - 1] > insert) {
                vet[moveItem] = vet[moveItem - 1];
                moveItem--;
                count++;
            }
            vet[moveItem] = insert;
            count++;
        }
        return count;
    }
}