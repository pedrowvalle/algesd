public class FilaPrior {

    private FilaChar f1, f2, f3;

    FilaPrior(int tamanho) {
        f1 = new FilaChar(tamanho);
        f2 = new FilaChar(tamanho);
        f3 = new FilaChar(tamanho);
    }

    boolean isfull() {
        if(f1.isfull()){
            return true;
        }else{
            if(f2.isfull()){
                return true;
            }else{
                if(f3.isfull()){
                    return true;
                }else{
                    return false;
                }
            }
        }
    }

    boolean isempty() {
        if(f1.isempty() && f2.isempty() && f3.isempty()){
            return true;
        }else{
            return false;
        }
    }

    void inclui(char elem, int prior) {
        if (prior == 1){
            f1.store(elem);
        }else if(prior == 2){
            f2.store(elem);
        }else if (prior == 3){
            f3.store(elem);
        }else{
            System.out.println("Não existe nenhuma fila com esta prioridade");
        }
    }

    char retira() {
        char elem = ' ';
        if(!f1.isempty()){
            elem = f1.retrieve();
        }else if(!f2.isempty()){
            elem = f2.retrieve();
        }else{
            elem = f3.retrieve();
        }
        return elem;
    }

    public static void main(String[] args) {

        System.out.println("criando uma fila de Prioridades com 5 elementos em cada prioridade...");
        FilaPrior fp1 = new FilaPrior(5);
        System.out.println("verificando status da fila...");
        System.out.println(fp1.isempty()? "Fila está vazia" : "Fila não está vazia");
        System.out.println(fp1.isfull()? "Fila está cheia" : "Fila não está cheia");
        System.out.println("incluindo o caractere A na prioridade 2...");
        fp1.inclui('A', 2);
        System.out.println("verificando status da fila...");
        System.out.println(fp1.isempty()? "Fila está vazia" : "Fila não está vazia");
        System.out.println(fp1.isfull()? "Fila está cheia" : "Fila não está cheia");
        System.out.println("incluindo o caractere B na prioridade 1...");
        fp1.inclui('B', 1);
        System.out.println("incluindo o caractere C na prioridade 3...");
        fp1.inclui('C', 3);
        System.out.println("incluindo o caractere D na prioridade 3...");
        fp1.inclui('D', 3);
        System.out.println("incluindo o caractere E na prioridade 1...");
        fp1.inclui('E', 1);
        System.out.println("incluindo o caractere F na prioridade 2...");
        fp1.inclui('F', 2);
        System.out.println("incluindo o caractere G na prioridade 1...");
        fp1.inclui('G', 1);
        System.out.println("realizando  retrieves na sequencia...");
        System.out.println(fp1.retira());
        System.out.println(fp1.retira());
        System.out.println(fp1.retira());
        System.out.println(fp1.retira());
        System.out.println(fp1.retira());
        System.out.println(fp1.retira());
        System.out.println(fp1.retira());
        System.out.println("verificando status da fila...");
        System.out.println(fp1.isempty()? "Fila está vazia" : "Fila não está vazia");
        System.out.println(fp1.isfull()? "Fila está cheia" : "Fila não está cheia");
    }
}