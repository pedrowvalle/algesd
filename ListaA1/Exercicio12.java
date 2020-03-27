import javax.swing.*;

public class Exercicio12 {

    public static void main(String args[]) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero para saber se é primo: "));
        boolean isPrimo = true;

        for (int i = 2; i < num; i++){
            if (num%i == 0){
                isPrimo = false;
                break;
            }
        }

        if (isPrimo)
            JOptionPane.showMessageDialog(null, String.format("O número " + num + " é primo."));
        else
            JOptionPane.showMessageDialog(null, String.format("O número " + num + " não é primo."));
    }
}