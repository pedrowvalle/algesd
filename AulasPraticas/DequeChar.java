class DequeChar {

	private int tamanho, front,rear;
	private char vet[];
		
	DequeChar(){
      tamanho = 5;
		vet = new char[tamanho];
      front = 0;
      rear = 0;
	}
	
	DequeChar(int n) {
	   tamanho = n;
		vet = new char[tamanho];
		front = 0;
      rear = 0;
	}
		
	boolean isfull(){
		if (rear == tamanho-1)
			return true;
		else
			return false;
	}
		
	boolean isempty(){
		if (front == rear)
			return true;
		else
			return false;
	}
	
	void incIni(char elem){
      // Código que testa se pode e inclui no início
	}

	void incFim(char elem){
      // Código que testa se pode e inclui no início
	}

	char retIni(){
      // Código que testa se pode e retira do início
      return ' ';
	}		 

	char retFim(){
      // Código que testa se pode e retira do fim
      return ' ';
	}		 

	public static void main(String args[]){
		
		DequeChar d1 = new DequeChar(12);

		System.out.println("Incluindo no Inicio A, B, C, D, E, F...");
		d1.incIni('A');
		d1.incIni('B');
		d1.incIni('C');
		d1.incIni('D');
		d1.incIni('E');
		d1.incIni('F');

		System.out.println(d1);

		System.out.println("Incluindo no Final 1, 2, 3, 4, 5, 6...");
		d1.incIni('A');
		d1.incIni('B');
		d1.incIni('C');
		d1.incIni('D');
		d1.incIni('E');
		d1.incIni('F');
		
		System.out.println("retirando do inicio: "+d1.retIni());
		System.out.println("retirando do final: "+d1.retFim());
		System.out.println("retirando do inicio: "+d1.retIni());
		System.out.println("retirando do final: "+d1.retFim());

	}

}			