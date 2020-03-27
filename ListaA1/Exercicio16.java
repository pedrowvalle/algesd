import java.util.Scanner;
    
    public class Exercicio16 {
    
        public static void main(String args[]) {
        	System.out.println(verifica(digitar()));
        }
        
        public static int digitar() {
        	Scanner scan = new Scanner (System.in);
        	System.out.print("Digite o numero para verificar se é par ou ímpar: ");
        	int num = scan.nextInt();
        	return num;
        }
        
        public static String verifica(int num) {
        	String res = "";
        	if (num%2 == 0)
        		res = "O número é par!";
        	else
        		res = "O número é ímpar!";
        	return res;
        }
        
        
}