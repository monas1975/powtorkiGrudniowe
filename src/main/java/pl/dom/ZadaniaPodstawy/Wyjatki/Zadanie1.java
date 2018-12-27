package pl.dom.ZadaniaPodstawy.Wyjatki;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.util.Scanner;

public class Zadanie1 {

    //Napisz program, który prosi użytkownika o dwie liczby(całkowite) a i b, i wyświetla wynik dzielenia a/b.
    // Jeżeli b jest ujemne program powinien wyświetlić odpowiedni komunikat.
    //Wariant 1: Zastosuj instrukcję if
    //Wariant 2: Zastosuj instrukcję try-catch

    public static void main(String[] args){

        int a=0;
        int b=0;
        double result;
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj a: ");
        a = scanner.nextInt();
        System.out.println("podaj b: ");

        try {
            b = scanner.nextInt();
            if(b<0){
                throw new Exception("Wartosc ujemna");
            }

        }catch (Exception e){
            System.out.println("Error" + e.getMessage());
        }


       // if (b<0) {
         //   System.out.println("uwaga liczba b jest ujemna");
       // }

        result = a/ (double) b;
        System.out.println(a + " / " + b + " = " + result);
    }

}
