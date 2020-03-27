import javax.swing.*;
    
    public class Exercicio15 {
    
        public static void main(String args[]) {
        	String menu = "A - Inserir número secreto\n\n"
        			+ "B - Jogar\n\n"
        			+ "C - Apresentar resultados\n\n"
        			+ "D - Sair";
        	int numero = -1, contador = 0, tentativa = -1;
        	String opt = "";
        	
        	do
        	{       		
        		if (opt.equalsIgnoreCase("a")) {
        			numero = Integer.parseInt(JOptionPane.showInputDialog("Insira o número secreto!"));
        			if (numero < 0) {
        				JOptionPane.showMessageDialog(null, "Digite um numero maior que 0!");
        				numero = -1;
        			}
        		}else if (opt.equalsIgnoreCase("b")) {
        			while (!(tentativa == numero)) {
	        			if (numero < 0) {
	        				JOptionPane.showMessageDialog(null, "Digite um numero antes de jogar!");
	        			}else {
	        				tentativa = Integer.parseInt(JOptionPane.showInputDialog("Tente adivinhar o número"));
	        				if (tentativa < 0) {
	        					JOptionPane.showMessageDialog(null, "Digite um numero maior que 0!");
	        				}else if (tentativa > numero) {
	        					alto();
	        					contador++;
	        				}else if (tentativa < numero) {
	        					baixo();
	        					contador++;
	        				}
	        			}
        			}
        			acertou(contador);
        		}else if (opt.equalsIgnoreCase("c")) {
        			tentativas(contador);
        		}
        		opt = JOptionPane.showInputDialog(menu);
        	}while (!(opt.equalsIgnoreCase("d")));
        }
        
        public static void alto() {
        	JOptionPane.showMessageDialog(null, "ALTO\nDigite uma nova tentativa: ");
        }
        
        public static void baixo() {
        	JOptionPane.showMessageDialog(null, "BAIXO\nDigite uma nova tentativa: ");
        }
        
        public static void acertou(int c) {
        	JOptionPane.showMessageDialog(null,  "ACERTOU\nNúmero de tentativas: " + c);
        }
        
        public static void tentativas(int c) {
        	JOptionPane.showMessageDialog(null, "Tentativas: " + c);
        }