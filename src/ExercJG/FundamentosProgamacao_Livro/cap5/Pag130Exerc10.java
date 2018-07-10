package ExercJG.FundamentosProgamacao_Livro.cap5;

import javax.swing.JOptionPane;

public class Pag130Exerc10 {

    public static void main(String[] args) {

        int contTime = 0, contJog = 0, idade = 0, qtde = 0, mediaIdade = 0, porc = 0, tot80 = 0;
        double peso = 0.0, alt = 0.0, mediaAlt = 0.0;

        for (contTime = 1; contTime < 11; contTime++) {
            idade = Integer.parseInt(JOptionPane.showInputDialog("Entre com a sua idade:"));
            peso = Double.parseDouble(JOptionPane.showInputDialog("Entre com o seu peso:"));
            alt = Double.parseDouble(JOptionPane.showInputDialog("Entre com a sua altura:"));

            if (idade < 18) {
                qtde = qtde + 1;
                mediaIdade = mediaIdade + idade;
                mediaAlt = mediaAlt + alt;
                if (peso > 80) {
                    tot80 = tot80 + 1;
                }
            }
        }
        mediaIdade = mediaIdade / 11;
        JOptionPane.showMessageDialog(null, "Média de idade é: " + mediaIdade);
        JOptionPane.showMessageDialog(null, "Valor de qtde: " + qtde);
        mediaAlt = mediaAlt / 55;
        JOptionPane.showMessageDialog(null, "Média de altura é: " + mediaAlt);
        porc = tot80 * 100 / 55;
        JOptionPane.showMessageDialog(null, "Valor de porc: " + porc);
    }
}
