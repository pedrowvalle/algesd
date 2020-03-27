import java.util.Scanner;
        
    public class Exercicio24 {
    	
    	public static void main (String [] args) {
    		Scanner scan = new Scanner (System.in);
    		System.out.print("Digite o tamanho do vetor");
    		int n = scan.nextInt();
    		int [] vet = new int [n];
    		
    		for (int i = 0; i < n; i++) {
    			int a = i+1;
    			System.out.print("Digite a " + a + "º posição do vetor: ");
    			vet [i] = scan.nextInt();
    		}
    		
    		System.out.println("A soma de todos os numeros do vetor é: " + soma(0, vet));
    	}
    
    	public static int soma (int n, int [] vet){
    		if (n+1 == vet.length)
    			return vet[n];
    		return vet [n] + soma (n+1, vet);
    	   }
    }