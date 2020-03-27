import javax.swing.*;
    
    public class Exercicio13 {
    
        public static void main(String args[]) {
    
            double [] comprimento = new double[10];
            double [] diametro = new double[10];
            double maiorComprimento = 0, menorDiametro = 0, comprimentoMedio = 0, diametroMedio;
            String res = "";
            int posMaiorComp = 0, posMenorDiam = 0;
            diametroMedio = 0;
            
            for (int i = 0; i < 10; i++) 
            {
            	comprimento[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do prego " + i + ": "));
            	diametro[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o diametro do prego " + i + ": "));
            	JOptionPane.showMessageDialog(null,  "Dados inseridos com sucesso!");
            }
            
            for (int i = 0; i < 10; i++)
            {
            	if (i+1 < 10) 
            	{
	            	if (comprimento[i] > comprimento[i+1]) {
	            		maiorComprimento = comprimento[i];
	            		posMaiorComp = i+1;
	            	
	            	}else {
	            		maiorComprimento = comprimento[i+1];
	            		posMaiorComp = i+2;
	            	}
	            	if (diametro[i] < diametro [i+1]) {
	            		menorDiametro = diametro[i];
	            		posMenorDiam = i+1;
	            	}else {
	            		menorDiametro = diametro [i+1];
	            		posMenorDiam = i+2;
	            	}
            	}
            	diametroMedio += diametro[i];
            	comprimentoMedio += comprimento[i];            	
            }
            
            diametroMedio /= 10;
            comprimentoMedio /= 10;
            res += "Diametro médio: " + diametroMedio + "\n"
            		+ "Amostra com maior comprimento: " + posMaiorComp
            		+ " Comprimento: " + maiorComprimento + "\n"
            		+ "Amostra com menor diâmetro: " + posMenorDiam
            		+ " Diametro: " + menorDiametro;
            JOptionPane.showMessageDialog(null,  res);
        }
    }