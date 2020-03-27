public class Exercicio03 {
	public static void main (String args []){
	
	    char [] vect = new char[26];
	    int i = 0;
	
	    for (char a = 'a'; a <= 'z'; a++){
	        vect [i] = Character.toUpperCase(a);
	        i++;
	    }
	
	}
}