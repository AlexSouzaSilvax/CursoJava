package ExercJG.FundamentosProgamacao_Livro.cap5;

import javax.swing.JOptionPane;

public class Pag122Exer04 {

    public static void main(String[] args) {

        int cont, cod, numVei, numAcid, maior = 0, cidMaior = 0, menor = 0, cidMenor = 0, mediaVei = 0, somaVei, mediaAcid, somaAcid, contAcid;

        somaVei = 0;
        somaAcid = 0;
        contAcid = 0;

        for (cont = 1; cont < 5; cont++) {

            cod = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de 'cod' :"));
            numVei = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de 'numVei' :"));
            numAcid = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de 'numAcid' :"));

            if (cont == 1) {
                maior = numAcid;
                cidMaior = cod;
                menor = numAcid;
                cidMenor = cod;
            } else if (numAcid > maior) {
                maior = numAcid;
                cidMaior = cod;
            } else if (numAcid < menor) {
                menor = numAcid;
                cidMenor = cod;
            }

            somaVei = somaVei + numVei;
            if (numVei < 2000) {
                somaAcid = somaAcid + numAcid;
                contAcid = contAcid + 1;
            }
        }

        JOptionPane.showMessageDialog(null, "Valor de 'maior' : " + maior + "\nValor de 'cidMaior' : " + cidMaior);
        JOptionPane.showMessageDialog(null, "Valor de 'menor' : " + menor + "\nValor de 'cidMenor' : " + cidMenor);
        mediaVei = mediaVei / 5;
        JOptionPane.showMessageDialog(null, "Valor de 'mediaVei' : " + mediaVei);
        if (contAcid == 0) {
            JOptionPane.showMessageDialog(null, "Não foi digitada nenhuma cidade com menos de 2000 veículos");
        } else {
            mediaAcid = somaAcid / contAcid;
            JOptionPane.showMessageDialog(null, "Valor de 'mediaAcid' : " + mediaAcid);
        }
    }
}