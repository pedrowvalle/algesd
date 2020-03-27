import javax.swing.*;

public class Exercicio11 {

    public static void main(String args[]) {

       double a, b, c, x1, x2, delta;
       String sRes;

        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de c"));

        delta = Delta(a, b, c);
        x1 = raiz1(a, b, delta);
        x2 = raiz2(a, b, delta);

        sRes = "Delta: ";
        sRes += String.format("%.2f", delta);

        if (delta > 0){
            if (x1 == x2){
                sRes += "\nAs raízes são reais iguais\n";
                sRes += "x1 e x2 = " + x1;
            }else{
                sRes += "\nAs raízes são reais diferentes\nx1 = " + x1 + "\nx2 = " + x2;
            }
        }else if (delta == 0){
            sRes += "\nSó existe uma raíz real\nx = " + x1;
        }else{
            sRes += "\nAs raízes são imaginárias";
        }

        JOptionPane.showMessageDialog(null, sRes);


    }

    public static double Delta (double a, double b, double c){
        return Math.pow(b, 2) - 4 * a * c;
    }

    public static double raiz1 (double a, double b, double delta){
        return(-b + Math.sqrt(delta))/2 * a;
    }

    public static double raiz2 (double a, double b, double delta){
        return(-b - Math.sqrt(delta))/ 2 * a;
    }

}