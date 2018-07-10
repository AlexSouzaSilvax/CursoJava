package ExercJG.FundamentosProgamacao_Livro.cap5;

import javax.swing.JOptionPane;

public class Pag121Exer02 {

    public static void main(String[] args) {

        int n, e, i, j, fat;

        n = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de 'n':"));
        e = 1;

        for (i = 1; i < n; i++) {
            fat = 1;
            for (j = 1; j < i; i++) {
                fat = fat * j;
            }
            e = e + 1 / fat;
            JOptionPane.showMessageDialog(null, e);
        }

    }
}
