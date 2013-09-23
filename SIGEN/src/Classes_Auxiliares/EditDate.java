/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_Auxiliares;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 *
 * @author matt
 */
public class EditDate {

    public static String formatData(java.util.Date d) {
        String aux, aux2 = "";
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        int ano = cal.get(Calendar.YEAR);
        int mes = cal.get(Calendar.MONTH) + 1;
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        if (mes < 10) {
            aux = "0" + String.valueOf(mes);
        } else {
            aux = String.valueOf(mes);
        }
        if (dia < 10) {
            aux2 = "0" + String.valueOf(dia);
        } else {
            aux2 = String.valueOf(dia);
        }
        String sData = aux2 + "/" + aux + "/" + String.valueOf(ano);
        return sData;
    }

    public String pegaData() {
        SimpleDateFormat formatador = new SimpleDateFormat("dd' de 'MMMMM' de 'yyyy' - 'HH':'mm'h'");
        Locale locale = new Locale("pt", "BR");
        GregorianCalendar calendar = new GregorianCalendar();
        return (formatador.format(calendar.getTime()));
    }
}
