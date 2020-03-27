import java.util.Scanner;
    
    public class Exercicio17 {
    
        public static void main(String args[]) {
    
           double a, b, c, x1, x2, delta;
           String sRes;
    
            a = digita("a ");
            b = digita("b ");
            c = digita("c ");
    
            delta = Delta(a, b, c);
            x1 = raiz1(a, b, delta);
            x2 = raiz2(a, b, delta);
    
            sRes = "Delta: ";
            sRes += String.format("%.2f", delta);
            sRes += raizes(delta, x1, x2);
    
            System.out.println(sRes);
    
    
        }
        
        public static double digita(String r) {
        	Scanner scan = new Scanner(System.in);
        	System.out.print("Digite o valor de " + r);
        	double n = scan.nextDouble();
        	return n;
        }
    
        public static double Delta (double a, double b, double c){
            return Math.pow(b, 2) - 4 * a * c;
        }
    
        public static double raiz1 (double a, double b, double delta){
            return(-b + Math.sqrt(delta))/2 * a;
        }
    
        public static double raiz2 (double a, double b, double delta){
            return(-b - Math.sqrt(delta))/ 2 * a;
        }
        
        public static String raizes (double delta, double x1, double x2) {
        	String r = "";
        	if (delta > 0){
                if (x1 == x2){
                    r += "\nAs raízes são reais iguais\n";
                    r += "x1 e x2 = " + x1;
                }else{
                    r += "\nAs raízes são reais diferentes\nx1 = " + x1 + "\nx2 = " + x2;
                }
            }else if (delta == 0){
                r += "\nSó existe uma raíz real\nx = " + x1;
            }else{
                r += "\nAs raízes são imaginárias";
            }
        	
        	return r;
        }
    
    }