import java.util.Scanner;
public class Pilha {
    private int tamanho, topo;
	private char vet[];
		
	Pilha(){
		tamanho = 5;
		vet = new char[5];
		topo = -1;		
	}
	
	Pilha(int n) {
	   tamanho = n;
		vet = new char[tamanho];
		topo = -1;
	}
		
	boolean isfull(){
		if (topo==tamanho-1)
			return true;
		else
			return false;
	}
		
	boolean isempty(){
		if (topo == -1)
			return true;
		else
			return false;
	}
		
	void push(char elem){
		if(isfull()){ 
			System.out.println("Overflow!");
			System.exit(1);
		}
		else
			vet[++topo]=elem;
	}
		
	char pop(){
		if(isempty()){
			//throw new StackOverflowException();
			System.out.println("Underflow!");
			System.exit(1);
			//return '*';
		}	
		//else
			return vet[topo--];
	}
		 
	char top(){
		if(isempty()){
			System.out.println("Underflow!");
			System.exit(1);
			//return '*';
		}
		//else
			return vet[topo];
	}
	
	void destroy(){
		topo=-1; 
    }
    //====== Exercício a =======
    boolean palindromo (String s){
		String res = "";
		for(int i = 0; i < s.length(); i++){
			push(s.charAt(i));
		}
		while(!isempty())
			res+=pop();

		if (s.equals(res))
			return true;
		return false;
    }
	//====== Exercício b =======
    String inverteFrase (String s){
		String res = "";
		for (int i = 0; i < s.length(); i++){
			if(s.charAt(i) != ' '){
				push(s.charAt(i));
			}else{
				while(!isempty()){
					res+=pop();
				}
				res+=" ";
			}

			if(i+1 == s.length()){
				while(!isempty())
				res+=pop();
			}
		}
		return res;
    }

	public static void main(String[] args) {
		
		/*System.out.println("criando uma pilha de caracteres com 10 elementos...");
		Pilha p1 = new Pilha(10);
		System.out.println("verificando status inicial da pilha...");
		System.out.println("está vazia? "+p1.isempty());
		System.out.println("está cheia? "+p1.isfull());
		System.out.println("incluindo o caractere A...");
		p1.push('A');
		System.out.println("verificando status da pilha...");
		System.out.println("está vazia? "+p1.isempty());
		System.out.println("está cheia? "+p1.isfull());
		System.out.println("incluindo o caractere B...");
		p1.push('B');
		System.out.println("incluindo o caractere C...");
		p1.push('C');
		System.out.println("realizando 3 pops na seqüência...");
		System.out.println(p1.pop());
		System.out.println(p1.pop());
		System.out.println(p1.pop());
		System.out.println("verificando status da pilha...");
		System.out.println("está vazia? "+p1.isempty());
		System.out.println("está cheia? "+p1.isfull());
		
		System.out.println("criando string com o conteúdo ESTRUTURA...");
		String palavra="ESTRUTURA";
		System.out.println("criando uma pilha de caracteres com tamanho do string...");
		Pilha p2 = new Pilha(palavra.length());
		System.out.println("incluindo os caracteres do string na pilha...");
		char aux;
      for(int i=0;i<palavra.length();i++){
		   aux=palavra.charAt(i);
			p2.push(aux);
		}	
		System.out.println("verificando status da pilha...");
		System.out.println("esta vazia? "+p2.isempty());
		System.out.println("esta cheia? "+p2.isfull());
		System.out.println("retirando e mostrando caracteres da pilha ate esvaziar a pilha...");
		while(p2.isempty()==false)
			System.out.print(p2.pop());
		System.out.println("");
		System.out.println("verificando status da pilha...");
		System.out.println("esta vazia? "+p2.isempty());
        System.out.println("esta cheia? "+p2.isfull());*/

		//====== Exercício a =======
		String w2 = "arara";
		Pilha p4 = new Pilha(w2.length());
		if(p4.palindromo(w2)){
			System.out.println("A palavra " + w2 + " é um palíndromo");
		}else{
			System.out.println("A palavra " + w2 + " não é um palíndromo");
		}

		//====== Exercício b =======
        String w1 = "Eu fui passear";
        Pilha p3 = new Pilha(w1.length());
		System.out.println(p3.inverteFrase(w1));
	}
}