package ExercJG.FundamentosProgamacao_Livro.cap5;

import javax.swing.JOptionPane;

public class Pag139Exerc16 {

    public static void main(String[] args) {

        int base, altura, area;

        do {
            base = Integer.parseInt(JOptionPane.showInputDialog("Valor da base:"));
        } while (base == 0);

        do {
            altura = Integer.parseInt(JOptionPane.showInputDialog("Valor da altura:"));
        } while (altura == 0);

        area = base * altura / 2;
        JOptionPane.showMessageDialog(null, "Area: " + area);

    }
}
