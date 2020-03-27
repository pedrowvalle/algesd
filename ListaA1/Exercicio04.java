public class Exercicio04 {
		public static void main (String args []){
		
		    char [] vect = new char[26];
		    int i = 0;
		    char s;
		
		    for (char a = 'a'; a <= 'z'; a++){
		        vect [i] = Character.toUpperCase(a);
		        i++;
		    }
		
		    for (i = 0; i < vect.length; i+=2){
		
		        s = vect [i];
		        vect [i] = vect [i+1];
		        vect [i+1] = s;
		
		    }
		}
}