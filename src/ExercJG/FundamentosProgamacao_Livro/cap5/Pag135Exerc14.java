package ExercJG.FundamentosProgamacao_Livro.cap5;

import javax.swing.JOptionPane;

public class Pag135Exerc14 {

    public static void main(String[] args) {

        int valorInicial, juros = 0, valorParc, total, valorJuros, numParc = 1;

        valorInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor inicial da dívida:"));
        total = valorInicial;
        valorParc = valorInicial;
        JOptionPane.showMessageDialog(null,
                "Total: " + total
                + "\nJuros: " + juros
                + "\nNúmeros de parcelas: " + numParc
                + "\nValor das parcelas: " + valorParc);
        juros = juros + 10;
        numParc = numParc + 2;
        for (int i = 1; i < 4; i++) {
            valorJuros = valorInicial * juros / 100;
            total = valorInicial + valorJuros;
            valorParc = total / numParc;
            JOptionPane.showMessageDialog(null,
                    "Total: " + total
                    + "\nValor do juros: " + juros
                    + "\nNúmeros parcelas: " + numParc
                    + "\nValor de parcelas: " + valorParc);
            juros = juros + 5;
            numParc = numParc + 3;
        }
    }
}
