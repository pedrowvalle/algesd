public class ALGESD05  {
   public static void selectSort(int vet[])
   {
      int menor; 
      for ( int i = (vet.length - 2); i >= 0; i-- )
      {
         menor = i; 
         for ( int j = i + 1; j < vet.length; j++ ){
            if ( vet[ menor ] < vet[ j ] ){
               int aux = vet[j]; 
               vet[j] = vet[menor]; 
               vet[menor] = aux;
               menor = j; 
            }
      
         System.out.println(" ");
         for(int k=vet.length - 1; k >= 0;k--)
            System.out.print(" "+vet[k]); 
         }
      } 
   } 

   public static void insertSort(int vet[])
   {
      int insert; 
      for ( int i = vet.length - 2; i >= 0; i-- )
      {
         insert = vet[ i ]; 
         int moveItem = i; 
         while ( moveItem < vet.length - 1 && vet[ moveItem + 1 ] > insert )
         {
            vet[ moveItem ] = vet[ moveItem + 1 ];
            moveItem++;
         }
         vet[ moveItem ] = insert; 
      
         System.out.println(" ");
         for(int k=0; k<vet.length;k++)
            System.out.print(" "+vet[k]); 
      }
   }
   
   public static void bubbleSort(int vet[])
   {
      int aux; 
      for ( int i = 0; i < vet.length; i++ ){
         for ( int j = vet.length - 1; j > i; j-- ){
            if (vet[j] > vet[j-1]) {
               aux = vet[j]; 
               vet[j] = vet[j-1]; 
               vet[j-1] = aux; 
            }
         }
      
         System.out.println(" ");
         for(int k=0; k<vet.length;k++)
            System.out.print(" "+vet[k]); 
      }
   } 

   public static void selectSortInv(int vet[]) { 
      // inclua seu código
   }
   
   public static void insertSortInv(int vet[]) {
      // inclua seu código
   }   

   public static void bubbleSortInv(int vet[]) {
      // inclua seu código
   }   

   public static void selectSortDec(int vet[]) { 
      // inclua seu código
   }
   
   public static void insertSortDec(int vet[]) {
      // inclua seu código
   }   

   public static void bubbleSortDec(int vet[]) {
      // inclua seu código
   }   


   public static void main(String args[ ])
   {
   
      int vet1[]={34,56,4,10,77,51,93,30,5,52};
   
      System.out.println("Elementos nao ordenados:");
      for(int i=0; i<vet1.length;i++)
         System.out.print(" "+vet1[i]);
      System.out.println(" ");	 
      System.out.print("Ordenando por Selection Sort...");
      selectSort(vet1);
      System.out.println(" ");
      System.out.println("Elementos ordenados:");
      for(int i=0; i<vet1.length;i++)
         System.out.print(" "+vet1[i]); 
      System.out.println(" ");
   
      int vet2[]={34,56,4,10,77,51,93,30,5,52};
   
      System.out.println("Elementos nao ordenados:");
      for(int i=0; i<vet2.length;i++)
         System.out.print(" "+vet2[i]);
      System.out.println(" ");	 
      System.out.print("Ordenando por Insertion Sort...");
      insertSort(vet2);
      System.out.println(" ");
      System.out.println("Elementos ordenados:");
      for(int i=0; i<vet2.length;i++)
         System.out.print(" "+vet2[i]); 
      System.out.println(" ");
   
      int vet3[]={34,56,4,10,77,51,93,30,5,52};
   
      System.out.println("Elementos não ordenados:");
      for(int i=0; i<vet3.length;i++)
         System.out.print(" "+vet3[i]);
      System.out.println(" ");	 
      System.out.print("Ordenando por Bubble Sort...");
      bubbleSort(vet3);
      System.out.println(" ");
      System.out.println("Elementos ordenados:");
      for(int i=0; i<vet3.length;i++)
         System.out.print(" "+vet3[i]); 
      System.out.println(" ");
   
      // Inclua seus testes com as rotinas criadas aqui
   
   }
}