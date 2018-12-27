package pl.dom.ZadaniaPodstawy.Wyjatki;

import java.util.Scanner;

public class Zadanie3 {
    //Napisz program który pyta użytkownika o dwie liczby a następnie sprawdza czy druga liczba nie jest ==0.
    // Jeśli jest, to wyrzuca wyjątek ‘CholeroException’ z komunikatem “Pamiętaj cholero, by nie dzielić przez zero!”.

    public static void main(String[] args){

        double a=0;
        double b=0;
        double result = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("program oblicza a/b");
        System.out.println("Podaj a =");
        a = scanner.nextInt();
        System.out.println("Podaj b =");

        try{
            b = scanner.nextInt();
            if (b==0){
                throw new Exception("Pamietaj cholero, niedziel przez zero");
            }
            System.out.println(a + " / " + b +  " = " + (a/b));

        }catch(Exception e){
            System.out.print("Error " + e.getLocalizedMessage());
        }


    }

}
