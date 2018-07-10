package ExercJG.FundamentosProgamacao_Livro.cap5;

import javax.swing.JOptionPane;

public class Pag127Exerc08 {

    public static void main(String[] args) {

        int i, numTermos, num1, num2, num3;

        numTermos = Integer.parseInt(JOptionPane.showInputDialog("Entre com número de termos:"));

        num1 = 2;
        num2 = 7;
        num3 = 3;

        JOptionPane.showMessageDialog(null, "num1: " + num1 + "\nnum2: " + num2 + "\nnum3: " + num3);

        i = 4;

        while (i != numTermos) {
            num1 = num1 * 2;
            JOptionPane.showMessageDialog(null, "num1: " + num1);
            i = i + 1;
            if (i != numTermos) {
                num2 = num2 * 3;
                JOptionPane.showMessageDialog(null, "num2: " + num2);
                i = i + 1;
                if (i != numTermos) {
                    num3 = num3 * 4;
                    JOptionPane.showMessageDialog(null, "num3: " + num3);
                    i = i + 1;
                }
            }
        }
    }
}
