import java.util.Scanner;
        
    public class Exercicio28 {
    	
    	public static void main (String [] args) {
    		Scanner scan = new Scanner (System.in);  	
    		System.out.print("Digite o numero ");
    		int n1 = scan.nextInt();  	
    		System.out.print("Digite p multiplicador ");
    		int n2 = scan.nextInt();  
    		System.out.println(n1 + " multiplicado por " + n2 + " = " + multiplicacao(n1, n2));
    	}
    
    	public static int multiplicacao (int numero, int multiplicador){
    		if (multiplicador <= 2)
    			return numero + numero;
    		return numero + multiplicacao(numero, multiplicador-1);
    	   }
    }