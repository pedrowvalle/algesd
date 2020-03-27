import javax.swing.*;
    
    public class Exercicio14 {
    
        public static void main(String args[]) {
        	double [] vet = new double[10];
        	int i = 0;
        	String opt = "";
        	
        	for (i = 0; i < vet.length; i++) {
        		vet[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        	}
        	JOptionPane.showMessageDialog(null,  "Vetor preenchido com sucesso!");
        	i = 0;
        	while (!(opt.equals('.'))){
        		opt = JOptionPane.showInputDialog("Posição: " + i + " Número: " + vet[i] + 
        				"\n\nDigite '+' para ir para o proximo número, \n"
        				+ "'-' para ir para o número anterior e '.' para sair");
        		if(opt.equals("+")) {
        			i = proximo(i, vet);
        		}else if (opt.equals("-")) {
        			i = anterior(i, vet);
        		}else if (opt.equals(".")) {
        			System.exit(0);
        		}else {
        			JOptionPane.showMessageDialog(null,  "Digite uma opção válida!");
        		}
        	}
        }
    
	    public static int proximo (int j, double [] v) {
	    	if (j <= v.length) {
		    	return j+1;
	    	}
			return j;
	    }
	    
	    public static int anterior (int j, double [] v) {
	    	if (j >= 0 && j < v.length) {
		    	return j-1;
	    	}
			return j;
	    }
}