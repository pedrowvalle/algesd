class DequeChar {

	private int tamanho, front, rear;
	private char vet[];

	DequeChar() {
		tamanho = 5;
		vet = new char[tamanho];
		front = 0;
		rear = tamanho - 1;
	}

	DequeChar(int n) {
		tamanho = n;
		vet = new char[tamanho];
		front = 0;
		rear = tamanho - 1;
	}

	boolean isfull() {
		if (rear == tamanho - 1)
			return true;
		else
			return false;
	}

	boolean isempty() {
		if (front == rear)
			return true;
		else
			return false;
	}

	void incIni(char elem) {
		if (front <= rear){
			vet[front++] = elem;
		}else{
			System.out.println("Overflow!");
		}
	}

	void incFim(char elem) {
		if (rear >= front){
			vet[rear--] = elem;
		}else{
			System.out.println("Overflow!");
		}
	}

	char retIni() {
		char aux = vet[front -1];
		for (int i = front - 1; i > 0; i--){
			vet[i] = vet[i-1];
			if (i - 1 == 0){
				vet[i-1] = ' ';
			}
		}
		return aux;
	}

	char retFim() {
		char aux = vet[rear + 1];
		for (int i = rear + 1; i < tamanho - 1; i++){
			vet [i] = vet[i+1];
			if (i + 1 == tamanho - 1){
				vet [i + 1] = ' ';
			}
		}
		return aux;
	}

	public static void main(String args[]) {

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
		d1.incFim('1');
		d1.incFim('2');
		d1.incFim('3');
		d1.incFim('4');
		d1.incFim('5');
		d1.incFim('6');

		System.out.println("retirando do inicio: " + d1.retIni());
		System.out.println("retirando do final: " + d1.retFim());
		System.out.println("retirando do inicio: " + d1.retIni());
		System.out.println("retirando do final: " + d1.retFim());

	}

}