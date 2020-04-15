import java.util.Scanner;

public class Exercicio73 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] vet = new char[10];
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite a " + i + " posição do vetor: ");
            vet[i] = scan.next().charAt(0);
        }
        selectSort(vet);
        System.out.print("Digite a letra a ser procurada: ");
        char key = scan.next().charAt(0);

        System.out.println("A letra está na " + busca(vet, key, 0, vet.length - 1) + 1 + " posição");
    }

    public static int busca(char[] vet, char key, int start, int end) {
        int mid = (start + end) / 2;
        if (vet[mid] == key) {
            return mid;
        } else if (vet[mid] < key) {
            return busca(vet, key, mid + 1, end);
        } else {
            return busca(vet, key, start, mid - 1);
        }
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