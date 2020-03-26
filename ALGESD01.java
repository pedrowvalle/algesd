public class ALGESD01 {
   public static void main (String args[]){
      
      int n = 3;
      
      System.out.println ("Fatorial de " + n + ": " + fatorial(n));
      System.out.println ("Posi��o " + n + " na sequencia de fibonacci: " + fibonacci(n));
      System.out.println ("Hanoi de " + n + ": " + hanoi(n));
      hanoiProf(n, 'A', 'B', 'C');      
   }
   
   public static int fatorial (int n){
      if (n == 1 || n == 2)
         return 1;
      else
         return n * fatorial(n - 1);
   }
   
   public static int fibonacci (int n){
      if (n < 3) 
         return 1;
      else
         return fibonacci (n - 1) + fibonacci (n - 2);
   }
   
   public static int hanoi (int n){
      if (n > 0)
         return (2 * hanoi (n-1)) + 1;
      return 0;
   }
   
   public static void hanoiProf (int n, char A, char B, char C){
      if (n > 0){
         hanoiProf(n-1, A, C, B);
         System.out.println("Passar disco " + n + " da haste " + A + " para a haste " + C);
         hanoiProf(n-1, B, A, C);
      }
   }
}