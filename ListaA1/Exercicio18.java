import java.util.Scanner;
    
    public class Exercicio18 {
    
        public static void main(String args[]) {
    
        	Scanner scan = new Scanner(System.in);
        	System.out.print("Digite um número para verificar se é primo ");
        	int n = scan.nextInt();
        	System.out.println(resultado(isPrimo(n),n));
            
        }
        
        public static boolean isPrimo (int num) {
        	boolean isPrimo = true;
            
            for (int i = 2; i < num; i++){
                if (num%i == 0){
                    isPrimo = false;
                    break;
                }
            }
            return isPrimo;
        }
        
        public static String resultado (boolean r, int num) {
        	String sRes;
        	if (r)
                sRes = String.format("O número " + num + " é primo.");
            else
                sRes = String.format("O número " + num + " não é primo.");
        	return sRes;
        }
    }