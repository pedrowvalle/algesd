import java.util.Scanner;

	//ex44
        
    public class Exercicio54 {
    	
    	public static void main (String [] args) {
    		Scanner scan = new Scanner (System.in);
    		int [] vet = new int[15];
    		for (int i = 0; i < vet.length; i++) {  	
        		System.out.print("Digite o numero na posição " + (i+1) + ": ");
    			vet [i] = scan.nextInt();
    		}
    		System.out.print("Digite o numero a ser procurado: ");
    		int key = scan.nextInt();
    		if(buscaBinaria(vet, key, 0, vet.length) != -1)
	    		System.out.println("O numero está na posição " + (buscaBinaria(vet, key, 0, vet.length)+1));
				else
					System.out.println("Numero não encontrado");
    	}
    
    	public static int buscaBinaria (int [] vet, int key, int start, int end) {
            int mid = (start + end) / 2;
            if (vet[mid] == key){
                return mid;
            }else if(vet[mid] < key){
                return buscaBinaria(vet, key, mid + 1, end);
            }else{
                return buscaBinaria(vet, key, start, mid-1);
            }
    	}
    }