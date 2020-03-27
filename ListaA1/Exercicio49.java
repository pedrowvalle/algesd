import java.util.Scanner;

public class Exercicio49 {
    	
    	//ex49
    	
    	public static void main (String [] args) {
            Scanner scan = new Scanner (System.in);
            int[]vet = new int[10];
            for(int i = 0;  i < vet.length; i++){
                System.out.print("Digite o " + i + " elemento do vetor");
                vet[i] = scan.nextInt();
            }
            System.out.print("Digite o número a ser procurado");
            int key = scan.nextInt();

            if (busca(vet, key, 0, vet.length) != -1){
                System.out.println("O número " + key + " está localizado no índice " + busca (vet, key, 0, vet.length) + " do vetor.");
            }else{
                System.out.println("Número não encontrado");
            }
        }
        
        public static int busca (int[] vet, int key, int start, int end){
            int mid = (start + end)/2;
            if (vet[mid] == key){
                return mid;
            }else if (vet[mid] < key){
                return busca(vet, key, mid + 1, end);
            }else {
                return busca(vet, key, start, mid-1);
            }
        }
    }