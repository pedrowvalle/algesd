import java.util.Scanner;
        
    public class Exercicio33 {
    	
    	public static void main (String [] args) {
    		Scanner scan = new Scanner (System.in); 
    		System.out.print("Digite a frase: ");
    		String s = scan.next();
    		char [] vet = new char[s.length()];
    		vet = s.toCharArray();
    		System.out.print("Digite a letra a ser procurada: ");
    		char key = scan.next().charAt(0);
    		
    		System.out.println("Posição: " + (busca(vet,key)+1));
    	}
    
    	public static int busca (char[] vet, char key){
    		int res = -1;
    		for (int i = 0; i < vet.length; i++) {
    			if(vet[i] == key) {
    				res = i;
    				return res;
    			}
    		}
    		return res;
    	}
    }