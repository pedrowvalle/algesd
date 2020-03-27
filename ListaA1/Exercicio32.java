import java.util.Scanner;
        
    public class Exercicio32 {
    	
    	public static void main (String [] args) {
    		Scanner scan = new Scanner (System.in);  	
    		System.out.print("Digite o numero ");
    		int [] vet = new int[15];
    		for (int i = 0; i < vet.length; i++) {  	
        		System.out.print("Digite o numero na posição " + (i+1) + ": ");
    			vet [i] = scan.nextInt();
    		}
    		System.out.print("Digite o numero a ser procurado: ");
    		int key = scan.nextInt();
    		
    		System.out.println("O numero está na posição " + (busca(vet, key)+1));
    	}
    
    	public static int busca (int[] vet, int key){
    		int res = -1;
    		for (int i = 0; i < vet.length; i++) {
    			if(vet[i] == key)
    				res = i;
    		}
    		return res;
    	}
    }