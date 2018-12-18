package pl.dom.ZadaniaPodstawy.Podstawy;

import java.util.Scanner;

public class Zadanie12 {

    //⦁	(Wymaga umiejętności korzystania ze Scanner’a). Zmodyfikuj zadanie z rollercoasterem. Pobierz parametry waga, wzrost, wiek od użytkownika.
    // Zweryfikuj poprawność danych (większe od zera itp.), a następnie sprawdź czy Twoja aplikacja działa poprawnie.


    public static void main(String[] args) {

        //Zadeklaruj dwie zmienne - 'waga' oraz 'wzrost'. Przypisz do nich jakieś wartości.
        // Stwórz instrukcję warunkową ('if') który sprawdza czy osoba (np. taka która  na kolejkę/rollercoaster) jest
        // wyższa niż 150 cm wzrostu i nie przekracza wagą 180 kg.

        //Rozwinięcie poprzedniego zadania:
        //Dopisz do poprzedniej aplikacji dodatkową zmienną - wiek. Jeśli osoba jest młodsza niż 10 lat, lub starsza niż 80, to nie może wejść na kolejkę.
        //Dopisz/zmień do/w poprzedniej aplikacji - osoba może wejść na kolejkę jeśli jej wzrost jest od 150 do 220 cm wzrostu.
        //Dopisz deskryptywne wyjasnienia.
        //Jesli osoba nie moze wejsc na kolejke, to wypisz na konsole odpowiedni komunikat dlaczego. np. “Nie możesz wejść na kolejkę ponieważ jesteś zbyt ciężki/a”
        //Jesli osoba nie moze wejsc z powodu wagi, to powinien sie wypisac komunikat ze nie moze wejsc bo przekracza limit wagowy
        //Jesli osoba nie moze wejsc z powodu wieku, to powinien sie wypisac INNY komunikat o tym ze nie moze wejsc z powodu wieku.

        int wzrost = 0;
        int waga = 0;
        int wiek = 0;

        Scanner scanner = new Scanner(System.in);

         System.out.println("Podaj wzrost:");
        wzrost = scanner.nextInt();
        System.out.println("Podaj waga:");
        waga = scanner.nextInt();
        System.out.println("Podaj wiek:");
        wiek = scanner.nextInt();




      /*
        if (wzrost > 150 && waga < 180){
            System.out.println("nadajesz sie");
        }else if (waga >= 180){
            System.out.println("jestes za cizki");
        }else if(wzrost < 150){
            System.out.println("jestes za niski");
        }
        */

        if (wiek < 10 || wiek > 80){
            System.out.println("nie nadajesz sie, jestes za mlody lub za stary");
        }else if (wzrost<150 || wzrost>220){
            System.out.println("nie nadajesz sie - jestes za wysoki lub za niski");
        }else if(waga>180){
            System.out.println("nie nadajesz sie - jestes za ciezki");
        }else{
            System.out.println(" nadajesz sie ");
        }
    }




}
