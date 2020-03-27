import java.util.Scanner;
//import javax.swing.JOptionPane;
        
    public class Exercicio40 {
    	
    	//ex40
    	
    	public static void main (String [] args) {
    		Scanner scan = new Scanner(System.in);
    		char [] vet = new char[10];
    		for (int i = 0; i < vet.length; i++) {
        		System.out.print("Digite a " + (i+1) + "º posição do vetor: ");
        		vet[i] = scan.next().charAt(0);
    		}
    		System.out.print("Digite a letra a ser procurado: ");
    		char key = scan.next().charAt(0);
    		if (buscaRecursiva(vet, key, (vet.length-1)) != -1)
    			System.out.println("A letra " + key + " está localizada na " + buscaRecursiva(vet, key, (vet.length-1)) + " posição");
    		System.out.println("Letra não encontrada");
    	}
    	
    	public static int buscaRecursiva (char [] vet, char key, int start) {
    		if (start <= 0) {
        		return -1;
    		}else {
    			if (vet[start] == key)
        			return start;
				return buscaRecursiva(vet, key, start-1);
    			}
    		}
    }