package ExercJG.FundamentosProgamacao_Livro.cap5;

import javax.swing.JOptionPane;

public class Pag140Exerc18 {

    public static void main(String[] args) {

        int linhas = 1, num, quad, cubo, raiz;

        num = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número:"));

        while (num > 0) {

            quad = num * num;
            cubo = num * num * num;
            raiz = (int) Math.sqrt(num);
            if (linhas < 20) {
                linhas = linhas + 1;
                JOptionPane.showMessageDialog(null, "Quadrado: " + quad + "\nCubo: " + cubo + "\nRaíz: " + raiz);
            } else {
                linhas = 1;
                JOptionPane.showMessageDialog(null, "Valor  Quadrado  Cubo  Raíz");
                linhas = linhas + 1;
                JOptionPane.showMessageDialog(null, "Quadrado: " + quad + "\nCubo: " + cubo + "\nRaíz: " + raiz);
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número:"));
        }
        JOptionPane.showMessageDialog(null, "Programa terminado.", "Guanabara", 0);
    }
}
