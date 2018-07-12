package ExercJG.FundamentosProgamacao_Livro.cap5;

import javax.swing.JOptionPane;

public class Pag132Exerc12 {

    public static void main(String[] args) {

        int numOp, pecasOp, numMaior = 0, contM = 0, contF = 0, totPecas = 0, cont, mediaM = 0, salarioMaior = 0, mediaF = 0, salarioOp = 0, totFolha = 0;
        String sexoOp = "";

        for (cont = 1; cont <= 15; cont++) {
            numOp = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do " + cont + "º operário."));
            JOptionPane.showMessageDialog(null, numOp);
            sexoOp = JOptionPane.showInputDialog("Entre com o sexo do operário: 'm' or 'f'");
            pecasOp = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de peças fabricadas pelo " + cont + "º operário."));

            if (pecasOp <= 30) {
                salarioOp = 450;
            } else if (pecasOp > 30 && pecasOp <= 21) {
                salarioOp = 450 + (pecasOp - 30 * 3 / 100 * 450);
            } else if (pecasOp > 21) {
                salarioOp = 450 + (pecasOp - 21 * 5 / 100 * 450);
            }
            JOptionPane.showMessageDialog(null, "O operário de número " + numOp + " recebe salário = " + salarioOp);
            totFolha = totFolha + salarioOp;
            totPecas = totPecas + pecasOp;
            if (sexoOp.equals("m")) {
                mediaM = mediaM + pecasOp;
                contM = contM + 1;
            } else {
                mediaF = mediaF + pecasOp;
                contF = contF + 1;
            }
            if (cont == 1) {
                salarioMaior = salarioOp;
                numMaior = numOp;
            } else {
                if (salarioOp > salarioMaior) {
                    salarioMaior = salarioOp;
                    numMaior = numOp;
                }
            }
        }
        JOptionPane.showMessageDialog(null,
                "Total de folha de pagamento: " + totFolha
                + "\nTotal de peças fabricadas no mês: " + totPecas);
        if (mediaM == mediaM / contM) {
            JOptionPane.showMessageDialog(null, "Média de peças fabricadas por homens: " + mediaM);
        } else if (contF == 0) {
            JOptionPane.showMessageDialog(null, "Nenhuma mulher");
        } else {
            mediaF = mediaF / contF;
            JOptionPane.showMessageDialog(null, "Média de peças fabricadas por mulheres: " + mediaF);
        }
        JOptionPane.showMessageDialog(null, "O número do operário com maior salário é: " + numMaior);
    }
}
