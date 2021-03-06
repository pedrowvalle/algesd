import javax.swing.JOptionPane;
        
    public class Exercicio58 {
    	
    	//ex58
    	
    	public static void main (String [] args) {
    		int opt = 0;
    		
    		int qdteAlunos = Integer.parseInt(
    				JOptionPane.showInputDialog(
    						"Digite a quantidade de alunos: "));
    		int [] RA = new int[qdteAlunos];
    		double [] notas = new double [qdteAlunos];
    		while(opt != 4) {
	    		opt = Integer.parseInt(
	    				JOptionPane.showInputDialog(
	    						"Escolha uma das opções abaixo: "
	    						+ "\n1 - Cadastrar o RA de todos os alunos "
	    						+ "\n\n2 - Cadastrar nota da prova para todos os alunos cadastrados"
	    						+ "\n\n3 - Buscar a nota de um aluno cadastrado"
	    						+ "\n\n4 - Sair do programa"));
	    		if (opt == 1) {
	    			cadastrarAlunos(RA);
	    		}else if (opt == 2) {
	    			cadastrarNotas(notas, RA);
	    		}else if (opt == 3) {
                    int RAKey = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "Digite o RA do aluno para buscar a nota: "));
	    			JOptionPane.showMessageDialog(null, buscarNota(notas, RA, RAKey, 0, qdteAlunos-1));
	    		}else if (opt != 4) {
	    			JOptionPane.showMessageDialog(null, "Digite um número válido!");
	    		}
    		}
    		System.exit(0);
    	}
    	
    	public static void cadastrarAlunos (int [] vet) {
    		for(int i = 0; i < vet.length; i++) {
    			vet [i] = Integer.parseInt(
    					JOptionPane.showInputDialog(
    							"Digite o RA do aluno: "));
    			JOptionPane.showMessageDialog(null,  "Aluno cadastrado com sucesso!");
    		}
    		
    	}
    	
    	public static void cadastrarNotas(double [] vet, int [] alunos) {
    		for(int i = 0; i < alunos.length; i++) {
    			vet[i] = Double.parseDouble(
    					JOptionPane.showInputDialog(
    							"Digite a nota do aluno com RA: " + alunos [i]));
    			JOptionPane.showMessageDialog(null,  "Nota inserida com sucesso!");
    		}
    	}
    	
    	public static String buscarNota (double [] notas, int [] alunos, int key, int start, int end) {
    		String sRes = "Aluno não encontrado!";
            int mid = (start + end) / 2;
            if(alunos[mid] == key){
                sRes = "Aluno: " + key + "\nNota: " + notas[mid];
                return sRes;
            }else if(alunos[mid] < key){
                return buscarNota(notas, alunos, key, mid + 1, end);
            }else{
                return buscarNota(notas, alunos, key, start, mid - 1);
            }
    	}
    }