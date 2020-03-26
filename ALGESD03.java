import javax.swing.JOptionPane;

public class ALGESD031 {

	public static int buscaBinaria (int vet[], int procurado)
    {
       int inicio = 0;
       int fim = vet.length - 1;
           
       while(inicio <= fim)
       {
          int meio = (inicio + fim) / 2;
              
          if(vet[meio] == procurado)
             return meio;                          
          else
             if (vet[meio] < procurado)
                inicio = meio + 1;
             else
                fim = meio - 1;
       }
       return -1;
    }
	
	public static int buscaBinariaInvertida (int [] vet, int procurado) {
		int inicio = 0;
		int fim = vet.length - 1;
		
		while (inicio <= fim)
		{
			int meio = (inicio + fim) / 2;
			
			if (vet[meio] == procurado)
				return meio;
			else
				if (vet[meio] < procurado) 
					fim = meio - 1;
				else
					inicio = meio + 1;
		}
		return -1;
	}
	
	public static int buscaBinariaRecursiva (int [] vet, int procurado, int inicio, int fim) {
		if(inicio > fim) {
			return -1;
		}else {
			int meio = (inicio + fim) / 2;
			if (vet[meio] == procurado)
				return meio;
			else if (vet[meio] < procurado)
				return buscaBinariaRecursiva (vet, procurado, meio+1, fim);
			else
				return buscaBinariaRecursiva (vet, procurado, inicio, fim-1);
		}
	}
	
	public static int buscaBinariaRecursivaInvertida (int [] vet, int procurado, int inicio, int fim) {
		if(inicio > fim) {
			return -1;
		}else {
			int meio = (inicio + fim) / 2;
			if (vet[meio] == procurado)
				return meio;
			else if (vet[meio] < procurado)
				return buscaBinariaRecursivaInvertida (vet, procurado, inicio, meio - 1);
			else
				return buscaBinariaRecursivaInvertida (vet, procurado, meio + 1, fim);
		}
	}

    public static void main(String args[])
    {
    	int [] x1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
       int x2[]={9, 8, 7 ,6, 5, 4, 3, 2, 1, 0};
    
       int proc2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o número procurado?"));
       int resp2 = buscaBinariaRecursivaInvertida(x2, proc2, 0, x2.length);
   
       if(resp2 == -1)
          JOptionPane.showMessageDialog(null, "Não existe no vetor");
       else
          JOptionPane.showMessageDialog(null, "Está no índice " + resp2);
    }

}
