package ExercJG.FundamentosProgamacao_Livro.cap5;

import javax.swing.JOptionPane;

public class Pag122Exer03 {

    public static void main(String[] args) {

        int n, num, i, j, fat;
        n = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de 'n':"));

        for (i = 1; i < n; i++) {

            num = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de 'num':"));

            fat = 1;

            for (j = 1; j < num; j++) {
                fat = fat * j;
            }

            JOptionPane.showMessageDialog(null, "Valor de fat: " + fat);
        }
    }
}
