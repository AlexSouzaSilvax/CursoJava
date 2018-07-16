package resolvendoProblemas;

import java.util.Scanner;

public class Teste_06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Sistema de bomba de gasolina 2.0
        double etanol, gasolina, valor;

        gasolina = 4.40;
        etanol = 3.02;

        System.out.println("escolha sua opção \n\ngasolina 4.40 opção = 1   etanou 3.02 opção = 2 \n\n");
        System.out.print("opção = ");
        int escolha = input.nextInt();

        System.out.print("\n\n");

        switch (escolha) {

            case 1:
                System.out.println("você escolheu gasolina");
                break;

            case 2:
                System.out.println("você escolheu etanou");
                break;

            default:
                System.out.println("essa opção não é valida = " + escolha);
        }

        System.out.println("\n\n");

        System.out.println("Valor a ser pago");
        valor = input.nextDouble();

        System.out.println("\n\n");

        if (escolha == 1) {

            double resultadogasolina = valor / gasolina;
            double ml = resultadogasolina % 1;
            for (int i = 0; i < (resultadogasolina + 1); ++i) {
                System.out.println(i);
            }

            System.out.println("total " + ((int) resultadogasolina) + " litros de gasolina e = " + ml + " Ml");

        } else if (escolha == 2) {

            double resultadoetanol = valor / etanol;
            double ml = resultadoetanol % 1;
            for (int i = 0; i < (resultadoetanol + 1); ++i) {
                System.out.println(i);
            }

            System.out.println("total " + ((int) resultadoetanol) + " litros de etanol e = " + ml + " Ml");

        }

    }
}
