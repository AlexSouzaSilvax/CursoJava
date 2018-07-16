package ExercJG.FundamentosProgamacao_Livro.cap5;

import javax.swing.JOptionPane;

public class Pag140Exerc17 {

    public static void main(String[] args) {

        int salCarlos, salJoao, meses = 0;

        salCarlos = Integer.parseInt(JOptionPane.showInputDialog("Informe o salario de Carlos:"));

        salJoao = salCarlos / 3;
        
        while (salJoao < salCarlos) {
            salCarlos = salCarlos + (salCarlos * 2 / 100);
            salJoao = salJoao + (salJoao * 5 / 100);
            meses = meses + 1;
        }
        JOptionPane.showMessageDialog(null, "Meses: " + meses);
    }
}
