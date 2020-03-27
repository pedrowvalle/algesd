import java.util.Scanner;
//import javax.swing.JOptionPane;
        
    public class Exercicio38 {
    	
    	//ex38
    	
    	public static void main (String [] args) {
    	
    		int index = -1;
    		
    		Scanner scan = new Scanner(System.in);
    		double [] vet = new double [10];
    		for(int i = 0; i < vet.length; i++) {
    			System.out.print("Digite o " + (i+1) + " numero: ");
    			vet[i] = scan.nextDouble();
    		}
    		
    		System.out.print("Digite o numero a ser procurado: ");
    		double key = scan.nextDouble();
    		for(int i = 0; i < vet.length; i++) {
    			if(vet[i] == key)
    				index = i;
    		}
    		
    		if (index == -1)
    			System.out.println("O núemro " + key + " não foi encontrado");
    		else
    			System.out.println("O número " + key + " está no índice " + index);
    		
    	}
    	
    	
    }