import java.util.Arrays;

public class ALGESD06
{
    public static int contagem = 0; 
  
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

	public static void mergeSortDec(int vet[],int ini,int fim) 
   {
      int meio, aux; // variável auxiliar para trocas   
	
		System.out.println("Comeca  mergesort para o vetor="+Arrays.toString(vet)+" com ini="+ini+" e fim="+fim);

		if( ini < fim) {  
 			meio= (ini+fim)/2; // acha o meio
			
			System.out.println("Chama   mergesort para o vetor="+Arrays.toString(vet)+" com ini="+ini+" e fim="+meio);
			mergeSortDec(vet, ini, meio); // ordena a primeira parte
			System.out.println("Chama   mergesort para o vetor="+Arrays.toString(vet)+" com ini="+(meio+1)+" e fim="+fim);
 		  	mergeSortDec(vet, meio+1, fim); // ordena a segunda parte			
			System.out.println("Comeca  merge     para o vetor="+Arrays.toString(vet)+" com 1a de "+ini+" ate "+meio+" e 2a de "+(meio+1)+" até "+fim);
		  	mergeDec(vet, ini, meio, meio+1, fim); // intercala
			System.out.println("Termina merge     para o vetor="+Arrays.toString(vet)+" com 1a de "+ini+" ate "+meio+" e 2a de "+(meio+1)+" até "+fim);
		}      

		System.out.println("Termina mergesort para o vetor="+Arrays.toString(vet)+" com ini="+ini+" e fim="+fim);

   }
   
	public static void mergeDec(int vet[ ],int ini1, int fim1, int ini2, int fim2)
   {
      int i1 = ini1; 
		int i2 = ini2;
		int iaux = ini1;
  		int vetaux[] = new int[vet.length];
	   
		while (i1 <= fim1 && i2 <= fim2){
			if(vet[i1] >= vet [i2])
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

	public static int mergeSortCtc(int vet[],int ini,int fim) 
   {   int meio, aux, contador = 0; // variável auxiliar para trocas   
	
		System.out.println("Comeca  mergesort para o vetor="+Arrays.toString(vet)+" com ini="+ini+" e fim="+fim);
      contagem++;
		if( ini < fim) {  
 			meio= (ini+fim)/2; // acha o meio
			
			System.out.println("Chama   mergesort para o vetor="+Arrays.toString(vet)+" com ini="+ini+" e fim="+meio);
			mergeSortCtc(vet, ini, meio); // ordena a primeira parte
			System.out.println("Chama   mergesort para o vetor="+Arrays.toString(vet)+" com ini="+(meio+1)+" e fim="+fim);
 		  	mergeSortCtc(vet, meio+1, fim); // ordena a segunda parte			
			System.out.println("Comeca  merge     para o vetor="+Arrays.toString(vet)+" com 1a de "+ini+" ate "+meio+" e 2a de "+(meio+1)+" até "+fim);
		  	mergeCtc(vet, ini, meio, meio+1, fim); // intercala
			System.out.println("Termina merge     para o vetor="+Arrays.toString(vet)+" com 1a de "+ini+" ate "+meio+" e 2a de "+(meio+1)+" até "+fim);
		}      

		System.out.println("Termina mergesort para o vetor="+Arrays.toString(vet)+" com ini="+ini+" e fim="+fim); 
      return contagem;
   }
   
	public static void mergeCtc(int vet[ ],int ini1, int fim1, int ini2, int fim2)
 	{  
      int i1 = ini1; 
		int i2 = ini2;
		int iaux = ini1;
  		int vetaux[] = new int[vet.length];
	   
		while (i1 <= fim1 && i2 <= fim2){
         contagem++;
			if(vet[i1] <= vet [i2]){
            contagem++;
            vetaux[iaux++]=vet[i1++];
         }
			else{
            contagem++;
            vetaux[iaux++]=vet[i2++];
         }
		}	
      
		if (i1 <= fim1)
		{	
         contagem++;
         while (i1 <=fim1){
            contagem++;
            vetaux[iaux++]=vet[i1++];
         }
		}		
		else
		{
         contagem++;
			while (i2 <=fim2){
            contagem++;
            vetaux[iaux++]=vet[i2++];
         }
		}	
	
		for (int i=ini1;i<=fim2;i++)
			vet[i] = vetaux[i];
   }

	public static int mergeSortCta(int vet[],int ini,int fim) 
   {  
      int meio, aux, contador = 0; // variável auxiliar para trocas   
	
		System.out.println("Comeca  mergesort para o vetor="+Arrays.toString(vet)+" com ini="+ini+" e fim="+fim);
		if( ini < fim) {  
         meio= (ini+fim)/2; // acha o meio
         contagem++;
			
			System.out.println("Chama   mergesort para o vetor="+Arrays.toString(vet)+" com ini="+ini+" e fim="+meio);
			mergeSortCta(vet, ini, meio); // ordena a primeira parte
			System.out.println("Chama   mergesort para o vetor="+Arrays.toString(vet)+" com ini="+(meio+1)+" e fim="+fim);
 		  	mergeSortCta(vet, meio+1, fim); // ordena a segunda parte			
			System.out.println("Comeca  merge     para o vetor="+Arrays.toString(vet)+" com 1a de "+ini+" ate "+meio+" e 2a de "+(meio+1)+" até "+fim);
		  	mergeCta(vet, ini, meio, meio+1, fim); // intercala
			System.out.println("Termina merge     para o vetor="+Arrays.toString(vet)+" com 1a de "+ini+" ate "+meio+" e 2a de "+(meio+1)+" até "+fim);
		}      

		System.out.println("Termina mergesort para o vetor="+Arrays.toString(vet)+" com ini="+ini+" e fim="+fim); 
      return contagem;
   }
   
	public static void mergeCta(int vet[ ],int ini1, int fim1, int ini2, int fim2)
 	{
      int i1 = ini1;
      contagem++; 
      int i2 = ini2;
      contagem++;
      int iaux = ini1;
      contagem++;
      int vetaux[] = new int[vet.length];
      contagem++;
	   
		while (i1 <= fim1 && i2 <= fim2){
			if(vet[i1] <= vet [i2]){
            vetaux[iaux++]=vet[i1++];
            contagem++;
         }
			else{
            vetaux[iaux++]=vet[i2++];
            contagem++;
         }
		}	
      
		if (i1 <= fim1)
		{	
         contagem++;
         while (i1 <=fim1){
            vetaux[iaux++]=vet[i1++];
            contagem++;
         }
		}		
		else
		{
			while (i2 <=fim2){
            vetaux[iaux++]=vet[i2++];
            contagem++;
         }
      }
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

      //MergeSort Descrescente
      System.out.println("\nElementos nao ordenados:");
		System.out.println(Arrays.toString(vet2));
      System.out.println("Ordenando por merge...");
		System.out.println("Chama na main o mergesort decrescente para vetor="+Arrays.toString(vet2)+" com ini="+0+" e fim="+(vet2.length-1));
		mergeSortDec(vet2, 0, vet2.length-1);
      System.out.println("Elementos ordenados:");
      System.out.println(Arrays.toString(vet2));
      
      //Contagem de comparações
      System.out.println("Comparações feitas para ordenar o vetor "+Arrays.toString(vet2)+" = "+mergeSortCtc(vet2, 0, vet2.length-1));
      contagem = 0;

      //Contagem de Atribuições
      System.out.println("Atribuições feitas para ordenar o vetor "+Arrays.toString(vet2)+" = "+mergeSortCta(vet2, 0, vet2.length-1));

   }
}