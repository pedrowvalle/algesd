import java.util.Scanner;

public class Exercicio05 {
		public static void main (String args []){
		
		    int [] vect = new int[16];
		    Scanner scan = new Scanner(System.in);
		    int count = 0;
		
		    for (int i = 0; i < vect.length; i++){
		        vect [i] = Integer.parseInt(scan.next());
		    }
		
		    for (int i = 0; i < vect.length-3; i++){
		        if (vect[i] == vect[i+3]){
		            if (vect[i+1] == vect[i+2])
		                count++;
		        }
		    }
		
		    System.out.println("Total de Capicuas: " + count);
		}
}