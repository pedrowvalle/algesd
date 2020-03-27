import java.util.Scanner;
        
    public class Exercicio30 {
    	
    	public static void main (String [] args) {
    		Scanner scan = new Scanner (System.in);  	
    		System.out.print("Digite o numero ");
    		double n1 = scan.nextDouble();
    		System.out.println("Resultado: " + serie(n1-1));
    	}
    
    	public static double serie (double numero){
    		if (numero == 0)
    			return 1;
    		return 1/Math.pow(2, numero) + serie(numero - 1);
    	   }
    }