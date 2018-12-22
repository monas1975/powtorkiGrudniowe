package pl.dom.ZadaniaPodstawy.Petle;

import java.util.Scanner;

public class Zadanie3 {

    public static void main(String[] args){

        //Napisz program, który wypisuje
        // “Hello World” dopóki użytkownik podaje liczby większe od 0.

        Scanner scanner = new Scanner(System.in);
        int userValue =0;

        do {
            userValue=scanner.nextInt();
            if (userValue >=0){
                System.out.println("Hello World");
            } else  break;

        }while(true);

        System.out.println("KONIEC");

    }
}
