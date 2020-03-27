import java.util.Scanner;
        
    public class Exercicio55 {
        
        //ex55
    	public static void main (String [] args) {
    		Scanner scan = new Scanner (System.in); 
    		System.out.print("Digite a frase: ");
    		String s = scan.next();
    		char [] vet = new char[s.length()];
    		vet = s.toCharArray();
    		System.out.print("Digite a letra a ser procurada: ");
    		char key = scan.next().charAt(0);
    		if(busca(vet, key, 0, vet.length) != -1)
                System.out.println("Posição: " + (busca(vet,key, 0, vet.length)+1));
            else
                System.out.println("Letra não encontrada");
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