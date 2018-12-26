package pl.dom.ZadaniaPodstawy.Petle;

import java.util.Scanner;

public class Zadanie8 {

    //*Napisać program, który pobiera od użytkownika ciąg liczb całkowitych. Pobieranie danych kończone jest podaniem wartości 0 (nie wliczana do danych). W następnej kolejności program powinien wyświetlić sumę największej oraz najmniejszej z podanych liczb oraz ich średnią arytmetyczną.
    //Spróbuj zadanie zrealizować z tablicą oraz bez tablicy
    //Pamiętaj! Czytaj liczby tak długo aż wczytana liczba nie jest 0!.

    public static void main(String[] args){
        int n = 0;
        int min= 0;
        int max = 0;
        double sr = 0;

        Scanner scanner = new Scanner(System.in);


        do{

            System.out.println("Podaj liczbe rozna od 0 ( konczy petle:" );
            n = scanner.nextInt();
            if((n> max) && (n !=0)){
                max = n;
            }

            if((n<min) && (n !=0)){
                min = n;
            }

        }while(n !=0);

        System.out.println("Max =" + max);
        System.out.println("Min =" + min);
        System.out.println("Min + Max = " + (min+max) );
        sr = (double)((min+max)/2.0);
        System.out.println("sr Min i  Max = " + sr );



    }
}
