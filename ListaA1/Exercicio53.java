import java.util.Scanner;
//import javax.swing.JOptionPane;
        
    public class Exercicio53 {
    	
    	//ex53
    	
    	public static void main (String [] args) {
    		int ciclosLinear, ciclosBinaria;
    		Scanner scan = new Scanner(System.in);
    		char [] vet = new char[10];
    		for (int i = 0; i < vet.length; i++) {
        		System.out.print("Digite a " + (i+1) + "º posição do vetor: ");
        		vet[i] = scan.next().charAt(0);
    		}
    		System.out.print("Digite a letra a ser procurado: ");
    		char key = scan.next().charAt(0);
    		ciclosLinear = buscaLinear(vet, key);
    		ciclosBinaria = buscaBinaria(vet,key, 0, vet.length);
    		
    		if (ciclosLinear > ciclosBinaria) {
    			System.out.println("A busca linear levou mais ciclos para se completar.\nCiclos na busca linear: " + ciclosLinear + "\nCiclos na busca binária: " + ciclosBinaria);
    		}else if (ciclosLinear < ciclosBinaria) {
    			System.out.println("A busca linear levou menos ciclos para se completar.\nCiclos na busca linear: " + ciclosLinear + "\nCiclos na busca binária: " + ciclosBinaria);
    		}else {
    			System.out.println("A busca linear levou a mesma quantidade de ciclos que a busca binária.\nCiclos na busca linear: " + ciclosLinear + "\nCiclos na busca binária: " + ciclosBinaria);
    		}
    	}
    	
    	public static int buscaBinaria (char [] vet, char key, int start, int end) {
            int mid = (start + end) / 2;
            int ciclos = 1;
    		if(vet[mid] == key){
                return ciclos;
            }else if(vet[mid] < key){
                ciclos++;
                return (buscaBinaria(vet, key, mid + 1, end));
            }else{
                ciclos++;
                return buscaBinaria(vet, key, start, mid - 1);
            }
    	}
    	
    	public static int buscaLinear (char [] vet, char key) {
    		int ciclos = 1;
    		for (int i = 0; i < vet.length; i++) {
    			if (vet[i] == key)
    				return ciclos;
    			else
    				ciclos++;
    		}
    		return ciclos;
    	}
    }