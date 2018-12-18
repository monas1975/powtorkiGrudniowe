package pl.dom.ZadaniaPodstawy.Tablice;


import java.util.Random;


public class Zadanie2 {

    //Napisać program, który utworzy tablicę 20 liczb całkowitych z przedziału 1 . . . 10 a następnie wypisze na ekranie ile razy każda z liczb z tego przedziału powtarza się w tablicy.
    //
    //Przykład:
    //            Wylosowane liczby: 6 5 4 5 10 5 8 3 10 6 6 6 4 3 2 8 1 3 4 7
    //            Wystąpienia:
    //                1 - 1
    //                2 - 1
    //                3 - 3
    //                4 - 3
    //                5 - 3
    //                6 - 4
    //                7 - 1
    //                8 - 2
    //                9 - 0
    //                10 - 2

    public static void main(String[] args){
        int[] tablica = new int[20];
        printTable(tablica);
        generateNumbers(tablica,0,10);
        System.out.println("");
        printTable(tablica);
        countValues(tablica);
    }

    public static void printTable(int[] tab){
        for (int i=0;i<tab.length;i++){
            System.out.print(tab[i] +" , ");
        }
    }

    public static void generateNumbers(int[] tab, int low, int high){
        Random random = new Random();
        for(int i=0;i<tab.length;i++){
            tab[i] = random.nextInt((high-low)+1)+low;
        }
    }

    public static void countValues(int[] tab){
        int min = Zadanie1.minFinder(tab);
        System.out.println("min = "  + min);
        int max = Zadanie1.maxFinder(tab);
        System.out.println("max = "  + max);
        int counter = 0;

        for(int i=min; i<=max;i++){

            for(int j=0;j<tab.length;j++){
                if (i==tab[j]){
                    counter++;
                }
            }
            System.out.println("liczba " +i  + "  wystepuje  "  + counter  + "  razy");
            counter =0;
        }




    }
}
