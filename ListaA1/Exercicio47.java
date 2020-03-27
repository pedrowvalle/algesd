import java.util.Scanner;
        
    public class Exercicio47 {
    	
        //ex47
        static int n = 0;
    	public static void main (String [] args) {
    		Scanner scan = new Scanner(System.in);
    		System.out.println("Digite o numero de participantes da prova: ");
    		n = scan.nextInt();
    		int[][] vet = new int [n][3];
    		
    		preencheMatriz(vet, scan);
    		
    		System.out.print("Digite o numero de inscrição a procurar: ");
    		int inscricao = scan.nextInt();
    		System.out.println(buscaAtleta(vet, inscricao, n-1));
    	}
    	
    	public static void preencheMatriz(int[][]vet, Scanner scan) {
    		String opt = "";
    		for(int i = 0; i < n; i++ ) {
    			for(int j = 0;j < 2; j++) {
    				if(j == 0) {
    					System.out.print("Digite o numero de inscrição do atleta: ");
    					vet[i][j] = scan.nextInt();
    				}else if(j == 1){
    					System.out.print("O atleta cruzou a linha de chegada? (S/N) ");
    					opt = scan.next();
    					if(opt.equalsIgnoreCase("s")) {
    						System.out.print("Digite o tempo de prova do atleta (em segundos): ");
    						vet[i][j+1] = scan.nextInt();
    						vet[i][j] = i+1;
    					}else if(opt.equalsIgnoreCase("n")) {
    						vet[i][j] = 0;
    						vet[i][j+1] = 0;
    					}
    				}
    			}
    		}
    	}
    	
    	public static String buscaAtleta (int[][] vet, int inscricao, int end) {
    		String res = "Não há atletas cadastrados com este numero de inscrição.";
            int mid;
            int start = 0;
            while(start <= end){
                mid = (start + end)/2;
                if(vet[mid][0] == inscricao){
                    if (vet[mid][1] == 0) {
                        res = "Este atleta não chegou a completar a prova";
                    }else {
                    res = "Posição: " + vet[mid][1] + "\nTempo: " + vet[mid][2];
                    return res;
                    }
                }else if(vet[mid][0] < inscricao){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
            return res;
    	}
    }