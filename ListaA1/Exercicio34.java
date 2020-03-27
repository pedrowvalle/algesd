import java.util.Scanner;
        
    public class Exercicio34 {
    	
    	public static void main (String [] args) {
    		Scanner scan = new Scanner (System.in); 
    		char vet[] = new char [15];
    		char key = '.';
    		String s = "";
    		do {
	    		System.out.print("Digite a frase: ");
	    		s = scan.next();
	    		if (s.length() > 15) {
	    			System.out.println("A string deve ter menos de 15 caracteres.");
	    		}else{
		    		vet = new char[s.length()];
		    		vet = s.toCharArray();
		    		System.out.print("Digite a letra a ser procurada: ");
		    		key = scan.next().charAt(0);
	    		}
    		}while (s.length() > 15);
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