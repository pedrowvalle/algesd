//import java.util.Scanner;
import javax.swing.JOptionPane;
        
    public class Exercicio37 {
    	
    	//ex37
    	
    	public static void main (String [] args) {
    	
    		int opt, assento;
    		int[] assentos = new int[4];
    		cancelarTodasReservas(assentos);
    		
    		do {
	    		opt = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: "
	    				+ "\n1 - Verificar qual o proximo assento disponível"
	    				+ "\n\n2 - Cadastrar um passageiro"
	    				+ "\n\n3 - Cancelar uma reserva"
	    				+ "\n\n4 - Sair do programa"));
	    		if (opt == 1) {
	    			assento = buscarProxAssento(assentos);
	    			if (assento == -1) {
	    				JOptionPane.showMessageDialog(null, "Não há mais assentos disponíveis!");
	    			}else {
	    				String opt2 = JOptionPane.showInputDialog(
	    						"O assento " + (assento+1) + " está disponível!"
	    								+ "\nGostaria de cadastrar um passageiro para este assento? (S/N)");
	    				if (opt2.equalsIgnoreCase("s"))
	    					cadastrarPassageiro(assentos);
	    			}
	    				
	    		}else if (opt == 2) {
	    			cadastrarPassageiro(assentos);
	    		}else if (opt == 3) {
	    			cancelarReserva(assentos);
	    		}else if (opt != 4) {
	    			JOptionPane.showMessageDialog(null, "Digite uma opção válida!");
	    		}
    		}while (opt != 4);
    	}
    	
    	public static void cancelarTodasReservas (int [] vet) {
    		for(int i = 0; i < vet.length; i++) {
    			vet[i] = 0;
    		}
    	}
    	
    	public static void cancelarReserva (int [] vet) {
    		int rg = Integer.parseInt(
    				JOptionPane.showInputDialog(
    						"Para cancelar, digite o RG abaixo: "));
    		for(int i = 0; i < vet.length; i++) {
    			if(vet[i] == rg) {
    				vet[i] = 0;
    				JOptionPane.showMessageDialog(null, "Reserva cancelada com sucesso.");
    				break;
    			}
    		}
    		JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum passageiro com este RG");
    	}
    	
    	public static int buscarProxAssento(int[]vet) {
    		int res = -1;
    		for (int i = 0; i < vet.length; i++) {
    			if(vet[i] == 0) 
    				return i;
    		}
    		return res;
    	}
    	
    	public static void cadastrarPassageiro (int[]vet) {
    		int rg = Integer.parseInt(
    				JOptionPane.showInputDialog(
    						"Para cadastrar o passageiro, digite o RG abaixo: "));
    		for (int i = 0; i < vet.length; i++) {
    			if (vet[i] == 0) {
    				vet[i] = rg;
    				break;
    			}
    			JOptionPane.showMessageDialog(null, "Reserva realizada!");
    		}
    	}
    }