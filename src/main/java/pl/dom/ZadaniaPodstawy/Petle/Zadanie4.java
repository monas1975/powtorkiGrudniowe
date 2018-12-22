package pl.dom.ZadaniaPodstawy.Petle;

import java.util.Scanner;

public class Zadanie4 {
    //Napisać program w którym użytkownik podaje na początku dwie liczby: początekZakresu
    // oraz koniecZakresu. Upewnij się że początekZakresu < koniecZakresu a następnie
    //pobierz od użytkownika kolejną liczbę - dzielnik. Po pobraniu dzielnika wypisz
    // wszystkie liczby od początekZakresu do koniecZakresu które są podzielne przez
    // dzielnik.
    //*pobierz od użytkownika iloscDzielnikow, a następnie wczytaj wszystkie dzielniki.
    // Po wczytaniu wszystkich dzielnikow wypisz wszystkie liczby od poczatekZakresu
    // do koniecZakresu które są podzielne przez wszystkie dzielniki.

    public static void main(String[] args) {

        int beginOfRange = 0;
        int endOfRange = 0;
        int dzielnik =0;
        int iloscDzielnikow = 0;
        int tabOfDzielnik[];
        int counter =0;
        boolean czyLiczbaPodzielna = false;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Podaj poczatek zakresu");
            beginOfRange = scanner.nextInt();
            System.out.println("Podaj koniec zakresu");
            endOfRange = scanner.nextInt();

            if (endOfRange <= beginOfRange) {
                System.out.println("Koniec zakresu nie jest wiekszy niz konice");
                System.out.println("powtorz wprowadzanie danych");

            }else{
                break;
            }

        } while (true);

        do{
            System.out.println("Podaj dzielnik");
            dzielnik = scanner.nextInt();
        }while(dzielnik==0);

        System.out.println("Liczby z zakresu <" + beginOfRange + " , " + endOfRange + ">" + "podzielne przez " + dzielnik + " to: ");
        System.out.println(" ");
        for(int i = beginOfRange; i<=endOfRange;i++){
         if(i%dzielnik == 0){
             System.out.print(i + " ,");
         }
        }
        System.out.println(" ");
        System.out.println("Podaj ilosc dzielnikow do obliczen");
        iloscDzielnikow = scanner.nextInt();
        tabOfDzielnik = new int[iloscDzielnikow];

        for(int i=0; i<tabOfDzielnik.length;i++){
            System.out.println("Podaj" + i + " dzielnik");
            tabOfDzielnik[i] = scanner.nextInt();
        }

        System.out.println("Liczby z zakresu <" + beginOfRange + " , " + endOfRange + "> podzielne przez");
        for(int i=0; i<tabOfDzielnik.length;i++){
            System.out.print(tabOfDzielnik[i] + " ,");
        }
        System.out.print(" to:");
        System.out.println("");
        for(int i= beginOfRange;i<=endOfRange;i++){
            for(int j=0; j<tabOfDzielnik.length;j++){

                if(i%tabOfDzielnik[j] ==0){
                    czyLiczbaPodzielna = true;
                }else{
                    czyLiczbaPodzielna = false;
                    break;
                }

            }

            if(czyLiczbaPodzielna){
                System.out.print(i + " ,");
            }
        }

    }
}
