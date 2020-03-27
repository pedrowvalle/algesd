import java.util.Scanner;
        
    public class Exercicio23 {
    	
    	public static void main (String [] args) {
    
    	Scanner scan = new Scanner (System.in);
    	System.out.print("Digite o número para calculo do numero de Fibonacci: ");
    	int n = scan.nextInt();
        
        System.out.println ("Fibonacci de " + n + ": " + fibonacci(n));
        
    	}
    
    	public static int fibonacci (int n){
    	      if (n < 3) 
    	         return 1;
    	      else
    	         return fibonacci (n - 1) + fibonacci (n - 2);
    	   }
    }