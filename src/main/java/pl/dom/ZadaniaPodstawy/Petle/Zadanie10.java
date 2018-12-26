package pl.dom.ZadaniaPodstawy.Petle;

import java.util.Scanner;

public class Zadanie10 {

    //Napisać program rysujący w konsoli „choinkę” złożoną ze znaków gwiazdki (*).
    // Użytkownik programu powinien podać liczbę całkowitą n, n > 0, określającą wysokość choinki (liczbę wierszy).
    // Przykład: dla n = 5 wynik powinien wyglądać następująco:
    //              *
    //             ***
    //            *****
    //           *******
    //          *********

    public static void main(String[] args){

        int emptySpace = 10;
        int amountOfLine = 0;
        System.out.println("Podaj ilosc wierszy, n=");
        Scanner scanner = new Scanner(System.in);
        amountOfLine = scanner.nextInt();
        for(int i=0; i<=amountOfLine;i++){
            for(int j=0;j<=emptySpace-i;j++){
                System.out.print(" ");
           }
           for(int n=1;n<=2*i+1;n++){
               System.out.print("*");
           }

            System.out.println("");
        }





    }

}
