package ExercJG.FundamentosProgamacao_Livro.cap5;

import javax.swing.JOptionPane;

public class Pag120Exer01 {

    public static void main(String[] args) {

        int anoAtual;
        double salario, novoSalario, percentual;

        anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe seu ano atual:"));

        salario = 1000.0;
        percentual = 1.5 / 100;
        novoSalario = salario + percentual * salario;

        for (int i = 2007; i < anoAtual; i++) {
            percentual = 2 * percentual;
            novoSalario = novoSalario + percentual * novoSalario;
        }

        JOptionPane.showMessageDialog(null, "Seu novo salario e: " + novoSalario);
    }
}
