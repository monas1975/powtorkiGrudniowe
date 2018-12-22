package pl.dom.ZadaniaPodstawy.Petle;

import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args){
        //Napisz aplikację która przyjmuje parametr (ilość powtórzeń) ze scannera,
        // a następnie zadaną ilość razy wypisuje na ekran “Hello World” - pętlą for i while

        Scanner scanner = new Scanner(System.in);
        int repeat = scanner.nextInt();

        for(int i = 1; i<=repeat; i++){
            System.out.println("Hello world");
        }
        System.out.println("");
        System.out.println("petla while");
        System.out.println("");
        int counter = 1;
        while(counter <=repeat){
            System.out.println("Hello world");
            counter++;
        }

    }
}
