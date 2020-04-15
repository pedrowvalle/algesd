import java.util.Scanner;
import java.util.Arrays;

public class Exercicio66 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      double[] vet = new double[20];
      for (int i = 0; i < vet.length; i++) {
         System.out.print("Digite a " + i + " posição do vetor: ");
         vet[i] = scan.next().charAt(0);
      }
      selectSortDec(vet);
      System.out.println(Arrays.toString(vet));
   }

   public static void selectSortDec(double vet[]) {
      int menor;
      for (int i = (vet.length - 2); i >= 0; i--) {
         menor = i;
         for (int j = i + 1; j < vet.length; j++) {
            if (vet[menor] < vet[j]) {
               int aux = vet[j];
               vet[j] = vet[menor];
               vet[menor] = aux;
               menor = j;
            }
         }
      }
   }
}