package pl.dom.ZadaniaPodstawy.Petle;

import java.util.Scanner;

public class Zadanie6 {

    //Napisać program, który wczytuje od użytkownika liczbę całkowitą dodatnią n, a następnie wyświetla na
    // ekranie wszystkie potęgi liczby 2 nie większe, niż podana liczba. Przykładowo, dla liczby 71 program powinien wyświetlić:
    //    1 2 4 8 16 32 64




    public static void main(String[] args){

        int n =0;
        int potega=0;
        int counter =0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj n");
        n = scanner.nextInt();
        System.out.println();

        while (potega<n){
            potega = (int) Math.pow(2,counter);
              if (potega<n)
            System.out.print( potega + " ,");
            counter++;
        }


    }

}
