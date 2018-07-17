package JavaIntermediarioLoaine.Aula88;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Aula88GregorianCalendar {

    public static void main(String[] args) {

        Calendar hoje1 = Calendar.getInstance();

        GregorianCalendar hoje = new GregorianCalendar();

        imprimirData(hoje);

        for (int i = hoje.get(Calendar.YEAR); i < 3000; i++) {

            boolean a = hoje.isLeapYear(i);

            if (a == true) {
                System.out.println("Ano bixesto");
            } else if (a == false) {
                System.out.println("Ano nao bixesto");
            }
        }
    }

    private static void imprimirData(Calendar hoje) {

        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int hora = hoje.get(Calendar.HOUR_OF_DAY);
        int minutos = hoje.get(Calendar.MINUTE);
        int segundos = hoje.get(Calendar.SECOND);

        System.out.printf("Hoje é: %02d/%02d/%d %02d:%02d:%02d",
                dia, (mes + 1), ano, hora, minutos, segundos);

        System.out.println();
    }
}
