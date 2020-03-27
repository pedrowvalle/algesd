import java.util.Scanner;
        
    public class Exercicio31 {
    	
    	public static void main (String [] args) {
    		Scanner scan = new Scanner (System.in);  	
    		System.out.print("Digite o numero ");
    		double n1 = scan.nextDouble();
    		System.out.println("Resultado: " + serie(n1-1));
    	}
    
    	public static double serie (double numero){
    		double res = 0;
    		if (numero == 0) {
    			System.out.println("Posição numero: " + numero + " : " + 1);
    			return 1;
    		}else {
    		res = 1/Math.pow(2, numero) + serie(numero - 1);
    		System.out.println("Posição numero: " + numero + " : " + res);
    		return res;
    		}
    	}
    }