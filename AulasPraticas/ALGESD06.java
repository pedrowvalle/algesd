import java.util.Arrays;

public class ALGESD06
{
    public static int contador = 0; 
  
	public static void mergeSort(int vet[],int ini,int fim)
   {
      int meio, aux; // variável auxiliar para trocas   
	
		System.out.println("Comeca  mergesort para o vetor="+Arrays.toString(vet)+" com ini="+ini+" e fim="+fim);

		if( ini < fim) {  
 			meio= (ini+fim)/2; // acha o meio
			
			System.out.println("Chama   mergesort para o vetor="+Arrays.toString(vet)+" com ini="+ini+" e fim="+meio);
			mergeSort(vet, ini, meio); // ordena a primeira parte
			System.out.println("Chama   mergesort para o vetor="+Arrays.toString(vet)+" com ini="+(meio+1)+" e fim="+fim);
 		  	mergeSort(vet, meio+1, fim); // ordena a segunda parte			
			System.out.println("Comeca  merge     para o vetor="+Arrays.toString(vet)+" com 1a de "+ini+" ate "+meio+" e 2a de "+(meio+1)+" até "+fim);
		  	merge(vet, ini, meio, meio+1, fim); // intercala
			System.out.println("Termina merge     para o vetor="+Arrays.toString(vet)+" com 1a de "+ini+" ate "+meio+" e 2a de "+(meio+1)+" até "+fim);
		}      

		System.out.println("Termina mergesort para o vetor="+Arrays.toString(vet)+" com ini="+ini+" e fim="+fim);

   }
	
	public static void merge(int vet[ ],int ini1, int fim1, int ini2, int fim2)
 	{
        int i1 = ini1; 
		int i2 = ini2;
		int iaux = ini1;
  		int vetaux[] = new int[vet.length];
	   
		while (i1 <= fim1 && i2 <= fim2){
			if(vet[i1] <= vet [i2])
				vetaux[iaux++]=vet[i1++];
			else
				vetaux[iaux++]=vet[i2++];
		}	
	 
		if (i1 <= fim1)
		{	while (i1 <=fim1)
				vetaux[iaux++]=vet[i1++];
		}		
		else
		{
			while (i2 <=fim2)
				vetaux[iaux++]=vet[i2++];
		}	
	
		for (int i=ini1;i<=fim2;i++)
			vet[i] = vetaux[i];
	}	 	 

	public static void mergeSortDec(int v[]) 
   {
        if(v.length > 1){
            int t1 = v.length / 2;
            int t2 = v.length - t1;
            int v1[] = new int[t1];
            int v2[] = new int[t2];

            for(int i = 0; i < t1; i++){
                v1[i] = v[i];
            }

            for(int i = t1; i < (t1+t2); i++){
                v2[i-t1] = v[i];
            }

            mergeSortDec(v1);
            mergeSortDec(v2);
            mergeDec(v, v1, v2);
        }
   }
   
	public static void mergeDec(int w[], int w1[], int w2[])
 	{
        int i = 0, j = 0, k = 0;

        while(w1.length != j && w2.length != k){
            if(w1[j] >= w2[k]){
                w[i] = w1[j];
                i++;
                j++;
            }else{
                w[i] = w2[k];
                i++;
                k++;
            }
        }

        while(w1.length != j){
            w[i] = w1[j];
            i++;
            j++;
        }

        while(w2.length != k){
            w[i] = w2[k];
            i++;
            k++;
        }
    }

	public static int mergeSortCtc(int vet[],int ini,int fim) 
   {  // coloque aqui seu código  
      return 0;
   }
   
	public static void mergeCtc(int vet[ ],int ini1, int fim1, int ini2, int fim2)
 	{  // coloque aqui seu código  
    }

	public static int mergeSortCta(int vet[],int ini,int fim) 
   {  // coloque aqui seu código  
      return 0;
   }
   
	public static void mergeCta(int vet[ ],int ini1, int fim1, int ini2, int fim2)
 	{  // coloque aqui seu código  
    }
	public static void main(String args[ ]){
     
      int vet1[]={34,56,4,10,77,51,93,30,5,52};
      
      System.out.println("\nElementos nao ordenados:");
		System.out.println(Arrays.toString(vet1));
      System.out.println("Ordenando por merge...");
		System.out.println("Chama na main o mergesort para vetor="+Arrays.toString(vet1)+" com ini="+0+" e fim="+(vet1.length-1));
		mergeSort(vet1,0,vet1.length-1);
      System.out.println("Elementos ordenados:");
		System.out.println(Arrays.toString(vet1));

      int vet2[]={34,56,4,10,77,51,93,30,5,52};
      
      // coloque aqui seus testes dos novos métodos 

      System.out.println("\nElementos nao ordenados:");
		System.out.println(Arrays.toString(vet2));
      System.out.println("Ordenando por merge...");
		System.out.println("Chama na main o mergesort para vetor="+Arrays.toString(vet2)+" com ini="+0+" e fim="+(vet2.length-1));
		mergeSortDec(vet2);
      System.out.println("Elementos ordenados:");
		System.out.println(Arrays.toString(vet2));

   }
}