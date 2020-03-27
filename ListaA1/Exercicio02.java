public class Exercicio02 {
    public static void main (String args []){
        int [] vect = new int[100];
        for (int i = 0; i < vect.length; i++){
            if (i %2 == 0){
                vect [i] = 0;
            }else {
                vect[i] = i;
            }
        }    
	}
}