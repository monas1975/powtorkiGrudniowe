package pl.dom.ZadaniaPodstawy.Podstawy;

import java.util.Random;
import java.util.Scanner;

public class Zadanie13 {

    public static void main(String[] args){
        System.out.println("Hello World");

        //Napisz aplikację która pobiera od użytkownika (liczbę) N a nastepnie:
        //losuje N liczb całkowitych (dowolny zakres) i wypisuje je na ekran
        //losuje N liczb zmiennoprzecinkowych i wypisuje je na ekran
        //losuje N razy wartość boolean i wypisuje je na ekran
        //pobiera kolejne dwa parametry poczatekZakresu i koniecZakresu i losuje N liczb całkowitych z tego zakresu, a następnie wypisuje je na ekran
        //pobiera kolejne dwa parametry poczatekZakresu i koniecZakresu i losuje N liczb zmiennoprzecinkowych z tego zakresu, a następnie wypisuje je na ekran

        int N = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe N: ");
        N = scanner.nextInt();

        for(int i = 0 ; i<N; i++){
            System.out.print(random.nextInt() + ", ");
        }
        System.out.println(" ");
        for(int i = 0 ; i<N; i++){
            System.out.print(random.nextDouble() + ", ");
        }

        System.out.println(" ");
        for(int i = 0 ; i<N; i++){
            System.out.print(random.nextBoolean() + ", ");
        }

        int gornyZakres = 0;
        int dolnyZakres = 0;
        System.out.println(" ");
        System.out.println("Podaj gorny zakres: ");
        gornyZakres = scanner.nextInt();
        System.out.println("Podaj dolny zakres: ");
        dolnyZakres = scanner.nextInt();


//(Math.random() * ((max - min) + 1)) + min
        System.out.println(" ");
        for(int i = 0 ; i<N; i++){
            System.out.print(((random.nextInt(gornyZakres- dolnyZakres))+ dolnyZakres) + ",");
        }

    }
}
