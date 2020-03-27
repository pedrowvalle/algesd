import java.util.Scanner;
//import javax.swing.JOptionPane;
        
    public class Exercicio39 {
    	
    	//ex39
    	
    	public static void main (String [] args) {
    		Scanner scan = new Scanner(System.in);
    		int [] vet = new int[10];
    		for (int i = 0; i < vet.length; i++) {
        		System.out.print("Digite a " + (i+1) + "º posição do vetor: ");
        		vet[i] = scan.nextInt();
    		}
    		System.out.print("Digite o numero a ser procurado: ");
    		int key = scan.nextInt();
    		if (buscaRecursiva(vet, key, 1))
	    		System.out.println("O numero " + key + " está localizado na " + buscaRecursiva(vet, key, 1) + " posição");
    		System.out.println("Número não encontrado");
    	}
    	
    	public static int buscaRecursiva (int [] vet, int key, int start) {
    		if (start >= vet.length) {
        		return -1;
    		}else {
    			if (vet[start] == key)
        			return start;
        		return buscaRecursiva(vet, key, start+2);
    		}
    	}