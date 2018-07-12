package ExercJG.FundamentosProgamacao_Livro.cap5;

import javax.swing.JOptionPane;

public class Pag131Exerc11 {

    public static void main(String[] args) {

        int number, qtde = 0;

        number = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número:"));
        for (int i = 1; i < number; i++) {
            if (number / i == 0) {
                qtde = qtde + 1;
            } else if (qtde > 2) {
                JOptionPane.showMessageDialog(null, "Número não primo.");
            } else {
                JOptionPane.showMessageDialog(null, "Número primo.");
            }
        }
    }
}

//        int a;
//        do {
//            a = Integer.parseInt(JOptionPane.showInputDialog("Entre com um valor:"));
//            if (a == 1) {
//                JOptionPane.showMessageDialog(null, "A é == á '1' : " + a);
//            } else {
//                JOptionPane.showMessageDialog(null, "A é != á '1' : " + a);
//            }
//        } while (a != 1);
