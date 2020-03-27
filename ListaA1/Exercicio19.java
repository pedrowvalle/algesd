import javax.swing.*;
        
        public class Exercicio19 {
        
            public static void main(String args[]) {
        
                double [] comprimento = new double[10];
                double [] diametro = new double[10];
                String res = "";
                
                for (int i = 0; i < 10; i++) 
                {
                	comprimento[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do prego " + i + ": "));
                	diametro[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o diametro do prego " + i + ": "));
                	JOptionPane.showMessageDialog(null,  "Dados inseridos com sucesso!");
                }
                res += "Diametro médio: " + media(diametro) + "\n"
                		+ "Amostra com maior comprimento: " + posMaiorComp(comprimento)
                		+ " Comprimento: " + maiorComp(comprimento) + "\n"
                		+ "Amostra com menor diâmetro: " + posMenorDiam(diametro)
                		+ " Diametro: " + menorDiam(diametro);
                JOptionPane.showMessageDialog(null,  res);
            }
            
            public static int posMaiorComp (double [] vet) {
            	int posMaiorComp = -1;
            	for (int i = 0; i < vet.length; i++)
                {
                	if (i+1 < 10) 
                	{
    	            	if (vet[i] > vet[i+1]) {
    	            		posMaiorComp = i+1;
    	            	}else {
    	            		posMaiorComp = i+2;
    	            	}
                	}          	
                }
            	return posMaiorComp;
            }
            
            public static double maiorComp (double [] vet) {
            	double maiorComp = 0;
            	for (int i = 0; i < 10; i++)
                {
                	if (i+1 < 10) 
                	{
    	            	if (vet[i] > vet[i+1]) {
    	            		maiorComp = vet[i];
    	            	
    	            	}else {
    	            		maiorComp = vet[i+1];
    	            	}
                	}
                }
            	return maiorComp;
            }
            
            public static int posMenorDiam (double [] vet) {
            	int posMaiorComp = -1;
            	for (int i = 0; i < vet.length; i++)
                {
                	if (i+1 < 10) 
                	{
    	            	if (vet[i] > vet[i+1]) {
    	            		posMaiorComp = i+1;
    	            	}else {
    	            		posMaiorComp = i+2;
    	            	}
                	}          	
                }
            	return posMaiorComp;
            }
            
            public static double menorDiam (double [] vet) {
            	double maiorComp = 0;
            	for (int i = 0; i < 10; i++)
                {
                	if (i+1 < 10) 
                	{
    	            	if (vet[i] > vet[i+1]) {
    	            		maiorComp = vet[i];
    	            	
    	            	}else {
    	            		maiorComp = vet[i+1];
    	            	}
                	}
                }
            	return maiorComp;
            }
            
            public static double media (double [] vet) {
            	double media = 0;
            	for (int i = 0; i < vet.length; i++)
            		media += vet[i];
            	media /= vet.length;
            	return media;
            }
        }