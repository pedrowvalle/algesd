import java.util.Scanner;
        
    public class Exercicio29 {
    	
    	public static void main (String [] args) {
    		Scanner scan = new Scanner (System.in);  	
    		System.out.print("Digite o numero ");
    		int n1 = scan.nextInt();  	
    		System.out.print("Digite o subtrator ");
    		int n2 = scan.nextInt();  
    		System.out.println(n1 + " menos " + n2 + " = " + subtracao(n1, n2, 0));
    	}
    
    	public static int subtracao (int numero, int subtrator, int a){
    		if (subtrator + a == numero)
    			return a;
    		return subtrator - subtracao(numero, subtrator, a+1);
    	   }
    }