public class DequeDuplamenteEncadeado {
    class Nodo {
        public char data;
        public Nodo linke, linkd; // referência
    }

    Nodo ini, fim;

    DequeDuplamenteEncadeado(){
        ini = new Nodo();
        fim = new Nodo();
        ini.linkd = null;
        ini.linke = null;
        fim.linkd = null;
        fim.linke = null;
	}

    void incIni(char objeto) {
        Nodo nodo = new Nodo();
        nodo.data = objeto;
        if(ini.linkd == null){
            ini.linkd = nodo;
            nodo.linke = ini;
            nodo.linkd = fim;
            fim.linke = nodo;

        }else{
            Nodo aux = ini.linkd;
            nodo.linke = ini;
            ini.linkd = nodo;
            nodo.linkd = aux;
            aux.linke = nodo;
        }
    }

    void incFim(char objeto) {
        Nodo nodo = new Nodo();
        nodo.data = objeto;
        if(fim.linke == null){
            ini.linkd = nodo;
            nodo.linke = ini;
            nodo.linkd = fim;
            fim.linke = nodo;
        }else{
            Nodo aux = fim.linke;
            nodo.linkd = fim;
            nodo.linke = aux;
            aux.linkd = nodo;
            fim.linke = nodo;
        }
    }

    char retIni() {
        if(ini.linkd != null){
            Nodo aux = ini.linkd;
            Nodo aux2 = aux.linkd;
            ini.linkd = aux2;
            aux2.linke = ini;
            return aux.data;
        }else{
            System.out.println("Lista vazia!");
            return ' ';
        }
    }

    char retFim() {
        if(fim.linke != null){
            Nodo aux = fim.linke;
            Nodo aux2 = aux.linke;
            fim.linke = aux2;
            aux2.linkd = fim;
            return aux.data;
        }else{
            System.out.println("Lista vazia!");
            return ' ';
        }
    }

    public String toString() {
        Nodo aux = ini;
        String s = "[ ";
        while (aux != null) {
            s += aux.data + " ";
            aux = aux.linkd;
        }
        s += "]";
        return s;
    }

    public static void main(String args[]) {

        DequeDuplamenteEncadeado d1 = new DequeDuplamenteEncadeado();

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

        System.out.println(d1);

        System.out.println("retirando do inicio: " + d1.retIni());
        System.out.println(d1);

        System.out.println("retirando do final: " + d1.retFim());
        System.out.println(d1);

        System.out.println("retirando do inicio: " + d1.retIni());
        System.out.println(d1);

        System.out.println("retirando do final: " + d1.retFim());
        System.out.println(d1);

    }

}