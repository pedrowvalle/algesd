import java.util.Scanner;

public class Exercicio09 {

public static void main(String args[]) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o numero de colunas da matriz: ");
    int nx = Integer.parseInt(scanner.next());
    System.out.print("Digite o numeo de linhas da matriz: ");
    int ny = Integer.parseInt(scanner.next());
    String res = "A matriz é identidade";

    if (nx == ny) {
        int[][] matrix = new int[nx][ny];


        for (int x = 0; x < nx; x++) {
            for (int y = 0; y < ny; y++) {
                System.out.print("Digite o numero da posição " + x + " " + y + ": ");
                matrix[x][y] = Integer.parseInt(scanner.next());
            }
        }

        for (int x = 0; x < nx; x++) {
            for (int y = 0; y < ny; y++) {
                if (x == y && matrix[x][y] != 1 || x != y && matrix[x][y] != 0){
                    res = "A matriz não é identidade";
                    break;
                }
            }
        }

    }else{
        res = "A matriz não é identidade pois não é quadrada.";
    }

    System.out.println(res);
}
}