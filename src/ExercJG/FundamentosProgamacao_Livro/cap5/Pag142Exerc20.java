package ExercJG.FundamentosProgamacao_Livro.cap5;

import javax.swing.JOptionPane;

public class Pag142Exerc20 {

    public static void main(String[] args) {

        int cod, numH, salB, sal1 = 0, mediaM = 0, mediaF = 0, contM = 0, contF = 0;
        String sexo = "";

        cod = Integer.parseInt(JOptionPane.showInputDialog("Código:"));

        while (cod != 99999) {
            sexo = JOptionPane.showInputDialog("Informe o sexo:");
            numH = Integer.parseInt(JOptionPane.showInputDialog("Número de horas:"));

            salB = numH * 30;

            if (sexo.equals("m")) {
                sal1 = salB - (salB * 10 / 100);
                mediaM = mediaM + sal1;
                contM = contM + 1;
            }
            if (sexo.equals("f")) {
                sal1 = salB - (salB * 5 / 100);
                mediaF = mediaF + sal1;
                contF = contF + 1;
            }
            JOptionPane.showMessageDialog(null, "Cod: " + cod + "\nSalário b: " + salB + "\nSalário 1: " + sal1);
            cod = Integer.parseInt(JOptionPane.showInputDialog("Código:"));
        }
        if (contM == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum professor do sexo masculino!");
        } else {
            mediaF = mediaF / contF;
            JOptionPane.showMessageDialog(null, "Média feminina: " + mediaF);
        }
    }
}
