import java.util.Scanner;
public class Exercicio63{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char [] vet = {'o', 'm', 'i', 'n', 'u', 'b', 'y', 'v', 't'};
        System.out.print("Digite a letra a ser procurada: ");
        char key = scan.next().charAt(0);
        bubbleSort(vet);
        System.out.println("A letra " + key + " está no índice " + buscaBinariaRecursiva(vet, key, 0, vet.length));
    }

    public static void bubbleSort (char[]vet){
        char n;
        for(int i = vet.length-1; i >= 0; i--){
            for(int j = 0; j < i; j++){
                if(vet[j] > vet[j+1]){
                    n = vet[j+1];
                    vet[j+1] = vet[j];
                    vet[j] = n;
                }
            }
        }
    }

    public static int buscaBinariaRecursiva (char[]vet, char key, int start, int end){
        int mid = (start + end) / 2;
        if (vet[mid] == key){
            return mid;
        }else if(vet[mid] < key){
            return buscaBinariaRecursiva(vet, key, mid + 1, end);
        }else{
            return buscaBinariaRecursiva(vet, key, start, mid - 1);
        }
    }
}