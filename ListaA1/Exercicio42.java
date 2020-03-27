import java.util.Scanner;
//import javax.swing.JOptionPane;
        
    public class Exercicio42 {
    	
    	//ex42
    	
    	public static void main (String [] args) {
    		Scanner scan = new Scanner(System.in);
    		char [] vet = new char[10];
    		for (int i = 0; i < vet.length; i++) {
        		System.out.print("Digite a " + (i+1) + "º posição do vetor: ");
        		vet[i] = scan.next().charAt(0);
    		}
    		System.out.print("Digite a letra a ser procurado: ");
    		char key = scan.next().charAt(0);
    		if (buscaBinaria(vet, key) != -1) {
    			System.out.println("A letra " + key + " está localizada na " + (buscaBinaria(vet, key) + 1)+ " posição");
    		}else {
    			System.out.println("Letra não encontrada");
    		}
    	}
    	
    	public static int buscaBinaria (char [] vet, char key) {
    		int mid;
    		int start = 0;
    		int end = vet.length - 1;
    		while (start <= end) {
    			mid = (start + end) / 2;
    			if (vet[mid] == key) {
    				return mid;
    			}else if (vet[mid] < key) {
    				start = mid + 1;
    			}else {
    				end = mid - 1;
    			}
    		}
    		return -1;
    	}
    }