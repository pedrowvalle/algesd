import sun.security.util.Length;

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

	boolean isfull(){
        if (front == rear)
            return true;
        else
            return false;
    }

	boolean isempty() {
		if (front == (rear - (tamanho-1)))
			return true;
		else
			return false;
	}

	void incIni(char elem) {
		if (front < rear) {
			front++;
			for (int i = front; i > 0; i--){
				vet[i] = vet[i-1];
			}
			vet[0] = elem;
		} else if (front == rear){
			for (int i = front; i > 0; i--){
				vet[i] = vet[i-1];
			}
			vet[0] = elem;
		} else {
			System.out.println("Overflow!");
		}

	}

	void incFim(char elem) {
		if(rear > front){
			rear--;
			for(int i = rear; i < vet.length-1; i++){
				vet[i] = vet[i+1];
			}
			vet[vet.length-1] = elem;
		}else if (rear == front){
			for(int i = rear; i < vet.length-1; i++){
				vet[i] = vet[i+1];
			}
			vet[vet.length-1] = elem;
		}else {
			System.out.println("Overflow!");
		}
	}

	char retIni() {
		char aux = vet[0];
		front--;
		for (int i = 0; i < front; i++){
			vet[i] = vet[i+1];
		}
		vet[front] = ' ';
		return aux;
	}

	char retFim() {
		char aux = vet[vet.length-1];
		for (int i = vet.length-1; i > rear; i--){
			vet[i] = vet[i-1];
		}
		vet[rear] = ' ';
		rear++;
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