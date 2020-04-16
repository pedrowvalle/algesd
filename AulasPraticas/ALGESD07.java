import java.util.*;
public class ALGESD07 {
    public static void mergeSort(int vet[], int ini, int fim) {
        int meio, aux; // variável auxiliar para trocas

        if (ini < fim) {
            meio = (ini + fim) / 2; // acha o meio
            mergeSort(vet, ini, meio); // ordena a primeira parte
            mergeSort(vet, meio + 1, fim); // ordena a segunda parte
            merge(vet, ini, meio, meio + 1, fim); // intercala
        }

    }

    public static void merge(int vet[], int ini1, int fim1, int ini2, int fim2) {
        int i1 = ini1;
        int i2 = ini2;
        int iaux = ini1;
        int vetaux[] = new int[vet.length];

        while (i1 <= fim1 && i2 <= fim2) {
            if (vet[i1] <= vet[i2])
                vetaux[iaux++] = vet[i1++];
            else
                vetaux[iaux++] = vet[i2++];
        }

        if (i1 <= fim1) {
            while (i1 <= fim1)
                vetaux[iaux++] = vet[i1++];
        } else {
            while (i2 <= fim2)
                vetaux[iaux++] = vet[i2++];
        }

        for (int i = ini1; i <= fim2; i++)
            vet[i] = vetaux[i];
    }

    public static int separa(int vet[], int ini, int fim) {
        int c = vet[ini], i = ini + 1, j = fim, aux;
        while (i <= j) {
            while (i <= fim && vet[i] >= c)
                ++i;
            while (c > vet[j])
                --j;
            if (i < j) {
                aux = vet[i];
                vet[i] = vet[j];
                vet[j] = aux;
                ++i;
                --j;
            }
        }
        vet[ini] = vet[j];
        vet[j] = c;
        return j;
    }

    public static void quickSort(int vet[], int ini, int fim) {
        int j;
        if (ini < fim) {
            j = separa(vet, ini, fim); // separa a partir do primeiro
            quickSort(vet, ini, j - 1); // ordena a primeira parte
            quickSort(vet, j + 1, fim); // ordena a segunda parte
        }
    }

    public static void preencheAleatorio(int[] v, int max) {
        Random r = new Random();
        for (int i = 0; i < v.length; i++)
            v[i] = r.nextInt(max + 1);
    }

    public static void main(String args[]) {

        long inicio, tempo;

        int[] vet4 = new int[500000];
        preencheAleatorio(vet4, 500000);
        inicio = System.currentTimeMillis();
        quickSort(vet4, 0, vet4.length-1);
        tempo = System.currentTimeMillis() - inicio;
        System.out.println("tempo do quickSort = " + tempo);

        //preencheAleatorio(vet4, 500000);
        inicio = System.currentTimeMillis();
        mergeSort(vet4, 0, vet4.length-1);
        tempo = System.currentTimeMillis() - inicio;
        System.out.println("tempo do mergeSort = " + tempo);

        //preencheAleatorio(vet4, 500000);
        inicio = System.currentTimeMillis();
        Arrays.sort(vet4);
        tempo = System.currentTimeMillis() - inicio;
        System.out.println("tempo Arrays.sort = " + tempo);

    }
}