package ExercJG.FundamentosProgamacao_Livro.cap5;

import javax.swing.JOptionPane;

public class Pag125Exerc06 {

    public static void main(String[] args) {

        int cont, codigo, nht, valor, salMin, salIncial, aux, salFinal;
        String turno, categoria;

        salMin = 450;

        for (cont = 1; cont < 10; cont++) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Entre com o codigo:"));
            nht = Integer.parseInt(JOptionPane.showInputDialog("Entre com o nht:"));
            turno = JOptionPane.showInputDialog("Entre com o turno:");
            categoria = JOptionPane.showInputDialog("Entre com a categoria:");

            while (!turno.equals("M") && !turno.equals("V") && !turno.equals("N")) {
                turno = JOptionPane.showInputDialog("Informe seu turno:");
            }
            while (!categoria.equals("G") && !categoria.equals("O")) {
                categoria = JOptionPane.showInputDialog("Informe sua categoria:");
            }
            if (categoria.equals("G")) {
                if (turno.equals("N")) {
                    valor = salMin * 18 / 100;
                } else {
                    valor = salMin * 15 / 100;
                }
            } else {
                if (turno.equals("N")) {
                    valor = salMin * 13 / 100;
                } else {
                    valor = salMin * 10 / 100;
                }
            }
            salIncial = nht * valor;
            if (salIncial <= 300) {
                aux = salIncial * 20 / 100;
            } else if (salIncial < 600) {
                aux = salIncial * 15 / 100;
            } else {
                aux = salIncial * 5 / 100;
            }
            salFinal = salIncial + aux;
            JOptionPane.showMessageDialog(null, "Codigo: " + codigo
                    + "\nnht: " + nht
                    + "\nValor: " + valor
                    + "\nSalario Incial: " + salIncial
                    + "\nAux: " + aux
                    + "\nSalario Final: " + salFinal);
        }
    }
}
