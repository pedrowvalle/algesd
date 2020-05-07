public class Exercicio11 {
    public static class Nodo {
        public Object data;
        public Nodo link;
    }

    public static Nodo incluiIni(Nodo l, Object elem) {
        Nodo aux = new Nodo();
        aux.data = elem;
        aux.link = l;
        l = aux;
        return l;
    }

    public static void mostra(Nodo lista) {
        Nodo aux1 = new Nodo();
        aux1 = lista;
        while (aux1 != null) {
            System.out.println(aux1.data);
            aux1 = aux1.link;
        }
    }

    public static Nodo incluiFim(Nodo l, Object elem) {
        Nodo aux = new Nodo();
        aux.data = elem;
        aux.link = null;
        Nodo aux1 = new Nodo();
        aux1 = l;
        while (l != null){
            if (l.link == null && l != aux){
                l.link = aux;
            }else{
                l = l.link;
            }
        }
        l = aux1;
        return l;
    }

    public static Nodo retiraIni(Nodo l) {
        l = l.link;
        return l;
    }

    public static Nodo retiraFim(Nodo l) {
        Nodo aux = new Nodo();
        aux = l;
        while (l.link != null){
            if (l.link.link == null){
                l.link = null;
            }else{
                l = l.link;
            }
        }
        l = aux;
        return l;
    }

    public static Boolean busca(Nodo l, Object elem) {
        Nodo aux = new Nodo();
        aux = l;
        while(aux != null){
            if (aux.data == elem){
                return true;
            }
            aux = aux.link;
        }
        return false;
    }

    public static void main(String args[]) {

        Nodo lista1 = new Nodo();
        lista1.data = 'A';
        Nodo aux1 = new Nodo();
        aux1.data = 'B';
        lista1.link = aux1;
        Nodo aux2 = new Nodo();
        aux2.data = 'C';
        aux1.link = aux2;
        aux1 = new Nodo();
        aux1.data = 'D';
        aux2.link = aux1;
        aux2 = new Nodo();
        aux2.data = 'E';
        aux1.link = aux2;
        aux1 = new Nodo();
        aux1.data = 'F';
        aux2.link = aux1;
        aux2 = new Nodo();
        aux2.data = 'G';
        aux1.link = aux2;

        // Mostrando a lista1...

        System.out.println("Mostrando Lista:\n");
        mostra(lista1);

        // Inclui no Início com o método incluiIni o elemento 'Z'
        System.out.println("Incluindo o Z no início: ");
        lista1 = incluiIni(lista1, 'Z');

        System.out.println("Mostrando Lista:\n");
        mostra(lista1);

        // Teste aqui os outros métodos mostra, incluiFim, retiraIni, retiraFim e busca
        //Retirar do início 
        System.out.println("Retirando elemento do início: ");
        lista1 = retiraIni(lista1);
        mostra(lista1);

        //Retirar do Fim
        System.out.println("Retirando elemento do Fim: ");
        lista1 = retiraFim(lista1);
        mostra(lista1);

        //Incluir no Fim
        System.out.println("Inclindo o elemento 'X' no Fim: ");
        lista1 = incluiFim(lista1, 'X');
        mostra(lista1);

        //Buscando elementos
        System.out.println("O elemento 'H' está na lista?");
        System.out.println(busca(lista1, 'H')?"Sim" : "Não");
    }
}