package pl.dom.ZadaniaPodstawy.Podstawy;

public class Zadanie8 {

    public static void main(String[] args){

        //Napisz aplikację której zadaniem jest liczenie srednich ocen z kilku przedmiotów.
        //        - ocena_matematyka
        //        - ocena_chemia
        //        - ocena_j_polski
        //        - ocena_j_angielski
        //        - ocena_wos
        //        - ocena_informatyka
        //
        //Aplikacja ma wyliczac średnią wszystkich ocen, srednią ocen z przedmiotów ścisłych (matematyka, chemia, informatyka), oraz średnią z ocen przedmiotów humanistycznych (pozostałe).
        //Wszystkie trzy średnie mają być wypisane na ekran. Zwróć uwagę na zaokrąglenia.
        //Jeśli którakolwiek z ocen jest niedostateczna, lub średnia z ocen z którejś części jest niedostateczna, to wyświetl napis:
        //
        //Ocena z [część] jest niedostateczna.

        double ocena_matematyka = 5;
        double ocena_chemia = 4.5;
        double ocena_polski = 3;
        double ocena_angielski = 3;
        double ocena_wos = 3;
        double ocena_informatyka =5;

        double sredna_z_calosci=Math.round((ocena_angielski+ocena_chemia+ocena_informatyka+ocena_matematyka+ocena_polski+ocena_wos)/6);
        double srednia_scisle = Math.round((ocena_chemia+ocena_informatyka+ocena_matematyka)/3);
        double srednia_hum = Math.round((ocena_angielski+ocena_polski+ocena_wos)/3);
        System.out.println("srednai scisle = " + srednia_scisle);
        System.out.println("srednai hum = " + srednia_hum);
        System.out.println("srednai calosc = " + sredna_z_calosci);


    }
}
