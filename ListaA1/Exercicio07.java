port java.util.Scanner;

public class Exercicio07 {
	public static void main (String args []){
	
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Digite o numero de colunas da matriz: ");
	    int nx = Integer.parseInt(scanner.next());
	    System.out.print("Digite o numeo de linhas da matriz: ");
	    int ny = Integer.parseInt(scanner.next());
	    int [][] matrix = new int [nx][ny];
	    int [][] matrixT = new int [ny][nx];
	
	    for (int x = 0; x < nx; x++){
	        for (int y = 0; y < ny; y++){
	            System.out.print("Digite o numero da posição " + x + " " + y + ": ");
	            matrix [x][y] = Integer.parseInt(scanner.next());
	        }
	    }
	
	    for (int x = 0; x < nx; x++){
	        for (int y = 0; y < ny; y++){
	            matrixT [x][y] = matrix [y][x];
	        }
	    }
	
	    for (int x = 0; x < nx; x++){
	        for (int y = 0; y < ny; y++){
	            System.out.println(matrixT[x][y]);
	        }
	    }
	}
}