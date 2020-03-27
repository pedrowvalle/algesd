import java.util.Scanner;
        
    public class Exercicio56 {

        //ex56
    	
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
            int i = busca(vet, key, 0, vet.length);
            if (i != -1){
                System.out.println("Posição: " + (i+1));
            }else{
                System.out.println("Letra não encontrada");
            }
    	}
    
    	public static int busca (char[] vet, char key, int start, int end){
            int mid = (start + end) / 2;
            if(vet[mid] == key){
                return mid;
            }else if(vet[mid] < key){
                return busca(vet, key, mid + 1, end);
            }else{
                return busca(vet, key, start, mid - 1);
            }
    	}
    }