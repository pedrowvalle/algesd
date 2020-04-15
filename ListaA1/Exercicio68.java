import java.util.Scanner;

public class Exercicio68 {
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

    public static void selectSort(char[] vet) {
        int index;
        char minor;
        for (int i = 0; i < vet.length - 1; i++) {
            index = i;
            minor = vet[i];
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[j] < minor) {
                    minor = vet[j];
                    index = j;
                }
            }
            vet[index] = vet[i];
            vet[i] = minor;
        }
    }
}