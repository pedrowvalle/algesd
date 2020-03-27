import java.util.Scanner;
//import javax.swing.JOptionPane;
        
    public class Exercicio52 {
    	
    	//ex52
    	
    	public static void main (String [] args) {
    		Scanner scan = new Scanner(System.in);
    		char [] vet = new char[10];
    		for (int i = 0; i < vet.length; i++) {
        		System.out.print("Digite a " + (i+1) + "º posição do vetor: ");
        		vet[i] = scan.next().charAt(0);
    		}
    		System.out.print("Digite a letra a ser procurado: ");
    		char key = scan.next().charAt(0);
    		if (buscaBinaria(vet, key, 0, (vet.length-1)) != -1) {
    			System.out.println("A letra " + key + " está localizada na " + (buscaBinaria(vet, key, 0, (vet.length-1)) + 1)+ " posição");
    		}else {
    			System.out.println("Letra não encontrada");
    		}
    	}
    	
    	public static int buscaBinaria (char [] vet, char key, int start, int end) {
    		if (vet.length <= 1) {
        		return -1;
    		}else {
    			int mid = (end + start) / 2;
    			if (vet[mid] == key) {
    				return mid;
    			}else {
    				if(vet[mid] > key)
    					return buscaBinaria (vet, key, start, mid-1);
    				return buscaBinaria (vet, key, mid+1, end);
    			}
    		}
    	}
    }