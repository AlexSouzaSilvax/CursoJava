package ExercJG.FundamentosProgamacao_Livro.cap5;

import javax.swing.JOptionPane;

public class Pag134Exerc13 {

    public static void main(String[] args) {

        int numCri, meses, porcF, porcM, totF = 0, totM = 0, tot24 = 0, porc24;
        String sexo = "";

//        JOptionPane.showMessageDialog(null, "Digite o número de crianças nascidas no período ", "Pág134Exerc13", 3, null);
//        JOptionPane.showMessageDialog(null, "Digite o número de crianças nascidas no período ", "Pág134Exerc13", 2, null);
//        JOptionPane.showMessageDialog(null, "Digite o número de crianças nascidas no período ", "Pág134Exerc13", 1, null);
//        JOptionPane.showMessageDialog(null, "Digite o número de crianças nascidas no período ", "Pág134Exerc13", 0, null);
        numCri = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de crianças nascidas no período:"));
        for (int i = 1; i < numCri; i++) {
            sexo = JOptionPane.showInputDialog("Digite o sexo da " + i + "º criança.");
            meses = Integer.parseInt(JOptionPane.showInputDialog("Entre com o tempo de vida (em meses) da " + i + "º criança."));
            if (sexo.equals("m")) {
                totM = totM + 1;
            }
            if (sexo.equals("f")) {
                totF = totF + 1;
            }
            if (meses <= 24) {
                meses = meses + 1;
            }
        }
        if (numCri == 0) {
            JOptionPane.showMessageDialog(null, "Nenhuma criança digitada.", "Pág134Exerc13", 0, null);
        } else {
            porcM = totM * 100 / numCri;
            porcF = totF * 100 / numCri;
            porc24 = tot24 * 100 / numCri;
            JOptionPane.showMessageDialog(null, "Percentual de crianças do sexo feminino mortas: " + porcF
                    + "\nPercentual de crianças do sexo masculino mortas: " + porcM
                    + "\nPercentual de crianças com 24 meses ou menos mortas no período: " + porc24);
        }
    }
}
