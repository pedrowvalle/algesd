import java.util.Scanner;
        
    public class Exercicio27 {
    	
    	public static void main (String [] args) {
    		Scanner scan = new Scanner (System.in);  	
    		System.out.print("Digite a base");
    		int n1 = scan.nextInt();  	
    		System.out.print("Digite potencia");
    		int n2 = scan.nextInt();  
    		System.out.println(n1 + " elevado a " + n2 + " =  + elev(n1, n2));
    	}
    
    	public static int elev (int base, int potencia){
    		if (potencia <= 2)
    			return base * base;
    		return base * elev (base, potencia-1);
    	   }
    }