package ExercJG.FundamentosProgamacao_Livro.cap5;

import javax.swing.JOptionPane;

public class Pag129Exerc09 {

    public static void main(String[] args) {

        int cont, n1, n2, media = 0, ta = 0, te = 0, tr = 0, mediaClasse, totalClasse = 0;

        for (cont = 1; cont < 6; cont++) {

            n1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de n1:"));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de n2:"));

            media = (n1 + n2) / 2;

            if (media <= 3) {
                tr = tr + 1;
                JOptionPane.showMessageDialog(null, "Você foi REPROVADO!\nK k K k K k K k K k K k K k K k");
            } else if (media > 3 && media < 7) {
                te = te + 1;
                JOptionPane.showMessageDialog(null, "Você precisa fazer RECUPERAÇÃO!\nDeu mole mané..");
            } else if (media >= 7) {
                ta = ta + 1;
                JOptionPane.showMessageDialog(null, "Você foi APROVADO!!!\n iiiii Me SoLtA Porr@#$$@! shushushaushauhsauh");
            }
            totalClasse = totalClasse + media;
        }
        mediaClasse = totalClasse / 6;
        JOptionPane.showMessageDialog(null, "Tr: " + tr
                + "\nTe: " + te
                + "\nTa: " + ta
                + "\nMedia da classe: " + mediaClasse);
    }
}
