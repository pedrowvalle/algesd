import javax.swing.*;

public class Exercicio10 {

    public static void main(String args[]) {

        int fileiras = 30;
        int cadeiras = 100;
        int teatro [][] = new int [fileiras][cadeiras];
        String sTitle, sRes, sOption;
        int nFileira, nCadeira, confirm;

        for (int i = 0; i < fileiras; i++){
            for (int j = 0; j < cadeiras; j++){
                teatro[i][j] = 0;
            }
        }

        do {
            sTitle = "Sistema de gerenciamento do teatro";
            sRes = "Digite o numero da fileira que deseja consultar\n\nDigite SAIR para encerrar a aplicação.";
            sOption = JOptionPane.showInputDialog(null, sRes, sTitle, JOptionPane.QUESTION_MESSAGE);
            if (!(sOption.equalsIgnoreCase("sair"))) {
                nFileira = Integer.parseInt(sOption);
                sRes = "Digite o numero da cadeira que deseja consultar";
                nCadeira = Integer.parseInt(
                        JOptionPane.showInputDialog(null, sRes, sTitle, JOptionPane.QUESTION_MESSAGE));
                if (teatro[nFileira][nCadeira] == 0){
                    sRes = "O assento está livre! Deseja reservar?";
                    confirm = JOptionPane.showConfirmDialog(null, sRes, sTitle, JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION){
                        teatro[nFileira][nCadeira] = 1;
                    }
                }else if (teatro[nFileira][nCadeira] == 1){
                    sRes = "O assento está reservado! Deseja confirmar a venda?";
                    confirm = JOptionPane.showConfirmDialog(null, sRes, sTitle, JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION){
                        teatro[nFileira][nCadeira] = 2;
                    }
                }else{
                    sRes = "O assento já está ocupado!";
                    JOptionPane.showMessageDialog(null, sRes);
                }
            }
        }while (!(sOption.equalsIgnoreCase("sair")));

        System.exit(0);

    }
}