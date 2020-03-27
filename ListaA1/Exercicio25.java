import java.util.Scanner;
        
    public class Exercicio25 {
    	
    	public static void main (String [] args) {
    		Scanner scan = new Scanner (System.in);
    		System.out.print("Digite o tamanho do vetor");
    		int n = scan.nextInt();
    		float [] vet = new float [n];
    		
    		for (int i = 0; i < n; i++) {
    			int a = i+1;
    			System.out.print("Digite a " + a + "º posição do vetor: ");
    			vet [i] = scan.nextFloat();
    		}
    		
    		System.out.print("Digite o numero a ser procurado");
    		float x = scan.nextFloat();    		
    		System.out.println("O numero digitado está na posição: " + busca(0, vet, x));
    	}
    
    	public static int busca (int n, float [] vet, float x){
    		if (vet [n] == x)
    			return n;
    		return busca(n+1, vet, x);
    	   }
    }