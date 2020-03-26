import javax.swing.*;

public class ALGESD04 {

   public static int buscaLinearRec(int vet[ ], int elem, int ini) {
      if(ini < vet.length) {    
         if(vet[ini]==elem)
            return ini;
         else
            return buscaLinearRec(vet,elem,ini+1);
      }       
      return -1;
   }   
    
   public static int buscaBinariaRec(int vet[ ], int elem, int ini, int fim){
      if(ini<=fim) {
         int meio=(ini+fim)/2;
         if(vet[meio]==elem)
            return meio;
         else
            if(vet[meio]>elem)            
               return buscaBinariaRec(vet, elem, ini, meio-1); 
            else
               return buscaBinariaRec(vet, elem, meio + 1, fim); 
      }
      return -1;
   }  

   public static int buscaLinearRecInv(int vet[ ], int elem, int ini) {
      if(ini < 1) {
    	  return -1;
      }else {
    	  if(vet[ini] == elem) {
    		  return ini;
    	  }else {
    		  return buscaLinearRecInv(vet, elem, ini-1);
    	  }
      }
   }   
    
   public static int buscaBinariaRecDec(int vet[ ], int elem, int ini, int fim){
	   if(ini > fim) {
			return -1;
		}else {
			int meio = (ini + fim) / 2;
			if (vet[meio] == elem)
				return meio;
			else if (vet[meio] < elem)
				return buscaBinariaRecDec (vet, elem, ini, meio - 1);
			else
				return buscaBinariaRecDec (vet, elem, meio + 1, fim);
		}
   }  

   public static void main(String args[])
   {
      int v[]={-5, 0, 1, 2, 3, 4, 5, 8, 9, 12};
      int v2[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
      int lugar = buscaLinearRec(v, 5, 0); 
      if(lugar == -1)
         System.out.println("Nao existe no vetor");
      else
         System.out.println("Esta no indice " + lugar);
      lugar = buscaBinariaRec(v, 5, 0, 9);
      if(lugar == -1)
         System.out.println("Nao existe no vetor");
      else
         System.out.println("Esta no indice " + lugar);
      lugar = buscaLinearRec(v, 7, 0); 
      if(lugar == -1)
         System.out.println("Nao existe no vetor");
      else
         System.out.println("Esta no indice " + lugar);
      lugar = buscaBinariaRec(v, 7, 0, 9);
      if(lugar == -1)
         System.out.println("Nao existe no vetor");
      else
         System.out.println("Esta no indice " + lugar);
      // Testar aqui os métodos que construir...
      lugar = buscaLinearRecInv(v, 8, v.length-1);
      if(lugar == -1)
          System.out.println("------Nao existe no vetor------");
       else
          System.out.println("------Esta no indice " + lugar + "------");
      lugar = buscaBinariaRecDec(v2, 8, 0, v2.length);
      if(lugar == -1)
          System.out.println("------Nao existe no vetor------");
       else
          System.out.println("------Esta no indice " + lugar + "------");
   }   
}
