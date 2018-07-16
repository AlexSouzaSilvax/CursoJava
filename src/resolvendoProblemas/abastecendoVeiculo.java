package resolvendoProblemas;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class abastecendoVeiculo {

    public static void main(String[] args) {

        double etanol = 3.02, gasolina = 4.40, valor;

        String escolha = JOptionPane.showInputDialog(null, "Você deseja abastecer com:\nGasolina (1)  |  preço = 4.40\nEtanol  (2)  |  preço =  3.02");
        valor = Double.parseDouble(JOptionPane.showInputDialog("Valor a ser abastecido:"));

        switch (escolha) {

            case "g":
                double resultadogasolina = valor / gasolina;
                double mlG = resultadogasolina % 1;
                DecimalFormat decimal = new DecimalFormat("##.###");
                String mll = decimal.format(mlG);
                JOptionPane.showMessageDialog(null, "Total de " + ((int) resultadogasolina) + " litros de gasolina e  " + mll + " ml");
                break;

            case "e":
                double resultadoetanol = valor / etanol;
                double mlE = resultadoetanol % 1;
                DecimalFormat decimall = new DecimalFormat("##.###");
                String mml = decimall.format(mlE);
                JOptionPane.showMessageDialog(null, "Total de " + ((int) resultadoetanol) + " litros de etanol e  " + mml + " ml");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Esta opção não é valida! " + escolha);
        }
    }
}
