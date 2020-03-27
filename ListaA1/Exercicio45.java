import java.util.Scanner;
        
    public class Exercicio45 {
        
        //ex45
    	public static void main (String [] args) {
    		Scanner scan = new Scanner (System.in); 
    		System.out.print("Digite a frase: ");
    		String s = scan.next();
    		char [] vet = new char[s.length()];
    		vet = s.toCharArray();
    		System.out.print("Digite a letra a ser procurada: ");
    		char key = scan.next().charAt(0);
    		if(busca(vet, key) != -1)
                System.out.println("Posição: " + (busca(vet,key)+1));
            else
                System.out.println("Letra não encontrada");
    	}
    
    	public static int busca (char[] vet, char key){
            int mid;
            int start = 0;
            int end = vet.length - 1;
            while(start <= end){
                mid = (start + end)/2;
                if (vet[mid] == key){
                    return mid;
                }else if (vet[mid] < key){
                    start = mid +1;
                }else{
                    end = mid - 1;
                }
            }
            return -1;
    	}
    }