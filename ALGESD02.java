import javax.swing.*;

   public class ALGESD02
   {
      public static int buscaLinear(int vet[], int procurado)
      {
         for(int i=0; i<vet.length;i++)
         {
            if(vet[i] == procurado)
               return i;
         }
         return -1;
      }
  
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
      
      // Item A
      
      public static int buscaLinearRec(int vet[ ], int elem, int ini) {
         if ((ini < vet.length) && (vet [ini] != elem))
            return buscaLinearRec(vet, elem, ini+1);
         return ini;
      }
      
      // Item B
      
      public static int buscaLinearOrd(int vet[], int elem){
         for (int i = 0; i < vet.length; i++){
            if (vet[i] == elem)
               return i;
         }
         return -1;
      }
      
      //Item C
      
      public static int buscaLinearOrdRec(int vet[], int elem, int ini){
         if ((ini < vet.length) && (vet[ini] == elem)){
            return ini;
         }else if (ini < vet.length){
            return buscaLinearOrdRec(vet, elem, ini+1);
         }else{
            return -1;
         }
      }
      
      // Item D
      
      public static int buscaLinearInv(int vet[], int elem){
         for (int i = vet.length - 1; i >= 0; i--){
            if (vet[i] == elem)
               return i;
         }
         return -1;
      }
      
      // Item E 
      
      public static int buscaLinearRecInv(int vet[ ], int elem, int ini) {
         if ((ini-1 >= 0) && (vet [ini] != elem))
            return buscaLinearRecInv(vet, elem, ini-1);
         return ini;
      }
  
      public static void main(String args[])
      {
         /*int x1[]={5, 8, 9, 3, 2, 0, 1, -5, 4};
     
         int proc1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o número procurado?"));
         int resp1 = buscaLinear(x1, proc1);
     
         if(resp1 == -1)
            JOptionPane.showMessageDialog(null, "Não existe no vetor");
         else
            JOptionPane.showMessageDialog(null, "Está no índice " + resp1);
         
         int x2[]={-5, 0, 1, 2, 3, 4, 5, 8, 9};
      
         int proc2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o número procurado?"));
         int resp2 = buscaBinaria(x2, proc2);
     
         if(resp2 == -1)
            JOptionPane.showMessageDialog(null, "Não existe no vetor");
         else
            JOptionPane.showMessageDialog(null, "Está no índice " + resp2);*/
            
         int x3[] = {6, 9, 7, 8, 5, 4, 15, 25, 20 ,14};
         
         int proc3 = Integer.parseInt(JOptionPane.showInputDialog("Qual o número procurado?"));
         int resp3 = buscaLinearRecInv (x3, proc3, x3.length);
         
         if (resp3 == -1)
            JOptionPane.showMessageDialog(null, "Não existe no vetor");
         else
            JOptionPane.showMessageDialog(null, "Está no índice " + resp3);
         
      }
   }  

