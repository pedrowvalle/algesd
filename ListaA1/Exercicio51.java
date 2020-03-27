import java.util.Scanner;

public class Exercicio51 {
    	
    	//ex51
    	
    	public static void main (String [] args) {
            Scanner scan = new Scanner (System.in);
            char[]vet = new char[10];
            for(int i = 0;  i < vet.length; i++){
                System.out.print("Digite o " + i + " elemento do vetor: ");
                vet[i] = scan.next().charAt(0);
            }
            System.out.print("Digite a letra a ser procurada: ");
            char key = scan.next().charAt(0);

            if (busca(vet, key, 0, vet.length) != -1){
                System.out.println("A letra " + key + " está localizada no índice " + busca (vet, key, 0, vet.length) + " do vetor.");
            }else{
                System.out.println("Letra não encontrada");
            }
        }
        
        public static int busca (char[] vet, char key, int start, int end){
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