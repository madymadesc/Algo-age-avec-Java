package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;


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

public class Algo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Affiche "Ecrire un nombre: "
        System.out.println("Ecrire un nombre: ");

        //Lit l'entier écrit par l'utilisateur et l'affecte
        // à  la variable nombre du programme
        LocalDate annee = LocalDate.of(1995,8,26);
        LocalDate maint = LocalDate.now();
       int age = maint.getYear() - annee.getYear();
        if ((annee.getMonthValue() > maint.getMonthValue())
                || (annee.getMonthValue() == maint.getMonthValue()) &&
                (annee.getDayOfMonth() > maint.getDayOfMonth()))
        {
         age--;
        }
        System.out.println("Age Mady: "+age);
    }
}
