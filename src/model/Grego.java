package model;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Grego {
/*

    Created by Mady Mades CAMARA
                000       000  000       000   00000000
                0000     0000  0000     0000  0000000000
                00000   00000  00000   00000  000    000
                0000000000000  0000000000000  000
                000 00000 000  000 00000 000  000
                000  000  000  000  000  000  000    000
                000       000  000       000  0000000000
                000       000  000       000   00000000

* */

    public static void main(String[] args)
    {
        Calendar cal = new GregorianCalendar(1995, 8, 26);
        Calendar maintenant = new GregorianCalendar();
        int age = maintenant.get(Calendar.YEAR) - cal.get(Calendar.YEAR);
        if ((cal.get(Calendar.MONTH) > maintenant.get(Calendar.MONTH))
                || (cal.get(Calendar.MONTH) == maintenant.get(Calendar.MONTH)
                && cal.get(Calendar.DAY_OF_MONTH) > maintenant.get(Calendar.DAY_OF_MONTH)))
        {
            age--;
        }
        System.out.println("Age: "+age);
    }

}
