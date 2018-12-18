package pl.dom.ZadaniaPodstawy.Podstawy;

public class Zadanie4 {

    public static void main(String[] args){

        //Zadeklaruj 3 zmienne - zmienna 'a', zmienna 'b', zmienna 'c'. Przypisz jej 3 wartości - ważne żeby były różne. Następnie wykonaj na
        int a = 5;
        int b = 6;
        int c = 7;
        // nich następujące działania:
        //            a) przepisz wartości - do zmiennej 'a' przypisz wartość 'b', do zmiennej 'b' przypisz wartość 'c', do zmiennej 'c' przypisz wartość 'a'.
        a=b;
        b=c;
        c=a;
        //            b) wypisz wartości na ekran.
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("c= "+c);
    }
}
