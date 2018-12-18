package pl.dom.ZadaniaPodstawy.Tablice;

import java.util.Arrays;
import java.util.Random;

public class Zadanie1 {

    //Napisz aplikację w której zadeklaruj tablicę 10 elementów a następnie:
    //wypełnij je losowymi wartościami z przedziału -10 - 10
    //wypisz na ekranie zawartość tablicy
    //wyznacz najmniejszy oraz największy element tablicy (wypisz je)
    //wypisz średnią arytmetyczną tablicy (*spróbuj zrobić to samo z tablicą liczb zmiennoprzecinkowych)
    //wypisz ilość elementów większych/mniejszych od średniej
    //wypisz tablicę w odwrotnej kolejności
    //**wyznacz medianę  - > posortuj tablicę używając Arrays.sort() a następnie określ medianę
    //
    //Przykład:
    //Wylosowane liczby:
    //                -3 9 2 -10 -3 -4 -1 -5 -10 8
    //            Min: -10, max: 9
    //            Średnia: -1,00
    //            Mniejszych od śr.: 6
    //            Większych od śr.: 3
    //            Liczby w odwrotnej kolejności:
    //                8 -10 -5 -1 -4 -3 -10 2 9 -3+

    public static void main(String[] args) {

        int[] tablica = new int[10];
        Random random = new Random();
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = random.nextInt(20) - 10;
        }


        printTable(tablica);
        System.out.println();
        System.out.println("max=" + maxFinder(tablica));
        System.out.println("min=" + minFinder(tablica));
        System.out.println("sr=" + averageCal(tablica));
        System.out.println("ilosc elementow wiekszych od sredniej =" + biggerAmountCounter(tablica));
        System.out.println("ilosc elementow mniejszych od sredniej =" + smallerAmountCounter(tablica));
        printRevertOrder(tablica);
        Arrays.sort(tablica);
        System.out.println();
        printTable(tablica);
        System.out.println("mediana =" + mediana(tablica));


    }

    public static int maxFinder(int[] tab) {
        int max = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }

        return max;
    }

    public static int minFinder(int[] tab) {
        int min = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }
        }

        return min;
    }

    public static double averageCal(int[] tab) {
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < tab.length; i++) {
            sum = sum + tab[i];
        }
        avg = sum / tab.length;
        return avg;
    }

    public static int biggerAmountCounter(int[] tab) {
        int counter = 0;
        double avg = averageCal(tab);
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > avg) {
                counter++;
            }
        }
        return counter;
    }

    public static int smallerAmountCounter(int[] tab) {
        int counter = 0;
        double avg = averageCal(tab);
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < avg) {
                counter++;
            }
        }
        return counter;
    }

    public static void printRevertOrder(int[] tab) {
        for (int i = tab.length - 1; i >= 0; i--) {
            System.out.print(tab[i] + " , ");
        }
    }

    public static void printTable(int[] tab) {
        for (int i : tab
        ) {
            System.out.print(i + ",");
        }
    }

    public static double mediana(int[] tab) {
        Arrays.sort(tab);
        int n = tab.length + 1;
        double mediana;
        if (tab.length % 2 == 0) {
            mediana = ((n / 2.0) + ((n / 2.0) + 1)) / 2.0;
        } else {
            mediana = (n + 1) / 2;
        }
        return mediana;
    }
}
