import java.util.Scanner;
//import javax.swing.JOptionPane;
        
    public class Exercicio41 {
    	
    	//ex41
    	//Ainda não retorna o ultimo indice
    	public static void main (String [] args) {
    		Scanner scan = new Scanner(System.in);
    		double [] vet = new double[10];
    		for (int i = 0; i < vet.length; i++) {
        		System.out.print("Digite a " + (i+1) + "º posição do vetor: ");
        		vet[i] = scan.nextDouble();
    		}
    		System.out.print("Digite a letra a ser procurado: ");
    		double key = scan.nextDouble();
    		if (buscaRecursiva(vet, key, 0) != -1)
    			System.out.println("O numero " + key + " está localizado na " + (buscaRecursiva(vet, key, 0)+1) + " posição");
				}else{
	    		System.out.println("Numero não encontrada");
				}
    	}
    	
    	public static int buscaRecursiva (double [] vet, double key, int start) {
    		if (start > vet.length) {
        		return -1;
    		}else {
    			if (vet[start] == key)
    				return start;
				return buscaRecursiva(vet, key, start+1);
    			}
    		}
    }