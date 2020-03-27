import java.util.Scanner;
        
    public class Exercicio21 {
    	
    	public static void main (String [] args) {
    
    	Scanner scan = new Scanner (System.in);
    	System.out.print("Digite o número para calculo do fatorial: ");
    	int n = scan.nextInt();
        
        System.out.println ("Fatorial de " + n + ": " + fatorial(n));
        
    	}
    
        public static int fatorial (int n){
            if (n == 1 || n == 2)
               return 1;
            else
               return n * fatorial(n - 1);
         }
    }