package pl.dom.ZadaniaPodstawy.Enum;

import java.util.Scanner;

public class Zadanie1 {

    //Stwórz enum Płeć która posiada wartości: KOBIETA, MĘŻCZYZNA
    //
    //Stwórz klasę Obywatel która posiada pola:
    //Płeć
    //Imie
    //Nazwisko
    //Pesel
    //
    //Stwórz Maina w formie 'formularza' w którym zadajemy użytkownikowi pytania o jego dane (imie, nazwisko, pesel, płeć). Użytkownik podaje informacje
    // o sobie i po podaniu wszystkich wartości tworzymy nowy obiekt typu "Obywatel".
    //
    //Zaimplementuj w klasie Obywatel metodę toString i w mainie (po wypełnieniu formularza) wypisz dane obywatela. (sout)

    public static void main(String[] args) {

        String sex;
        Sex plec=Sex.MEZCZYZNA;
        String imie;
        String nazwisko;
        String pesel;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pleca - M/K");
        sex = scanner.nextLine();

        if (sex =="M"){
           plec = Sex.MEZCZYZNA;
        }

        if (sex =="M"){
            plec = Sex.KOBIETA;
        }



        System.out.println("Podaj imie:");
                imie = scanner.nextLine();
        System.out.println("Podaj nazwisko:");
                nazwisko = scanner.nextLine();
        System.out.println("Podaj pesel:");
                pesel = scanner.nextLine();

        Citizen citizen1 = new Citizen();
        citizen1.setSex(plec);
        citizen1.setFirstName(imie);
        citizen1.setLastName(nazwisko);
        citizen1.setPesel(pesel);

        System.out.print(citizen1.toString());



    }


}
