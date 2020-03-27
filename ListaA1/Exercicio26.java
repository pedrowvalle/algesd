import java.util.Scanner;
        
    public class Exercicio26 {
    	
    	public static void main (String [] args) {
    		Scanner scan = new Scanner (System.in);  	
    		System.out.print("Digite o primeiro numero");
    		int n1 = scan.nextInt();  	
    		System.out.print("Digite o segundo numero");
    		int n2 = scan.nextInt();  
    		System.out.println("MDC : " + mdc(n1,n2));
    	}
    
    	public static int mdc (int n1, int n2){
    		if (n1%n2 == 0)
    			return n2;
    		return mdc(n2, n1%n2);
    	   }
    }