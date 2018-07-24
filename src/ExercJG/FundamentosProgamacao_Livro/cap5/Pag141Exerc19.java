package ExercJG.FundamentosProgamacao_Livro.cap5;

import javax.swing.JOptionPane;

public class Pag141Exerc19 {

    public static void main(String[] args) {

        int m, n, soma = 0;

        m = Integer.parseInt(JOptionPane.showInputDialog("Valor de m:"));
        n = Integer.parseInt(JOptionPane.showInputDialog("Valor de n:"));

        while (m < n) {
            for (int i = m; i < n; i++) {
                soma = soma + 1;
            }
            JOptionPane.showMessageDialog(null, "Soma é: " + soma);
            m = Integer.parseInt(JOptionPane.showInputDialog("Valor de m:"));
            n = Integer.parseInt(JOptionPane.showInputDialog("Valor de n:"));
        }
        JOptionPane.showMessageDialog(null, "Programa finalizado!", "GUANABARA É O REI", 0);
    }
}
