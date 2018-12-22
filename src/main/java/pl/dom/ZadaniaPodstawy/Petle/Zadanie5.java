package pl.dom.ZadaniaPodstawy.Petle;

import java.util.Scanner;

public class Zadanie5 {

    //Napisać program pobierający od użytkownika dwie liczby całkowite A oraz B, A < B, a następnie wyznaczający sumę ciągu liczb
    // od A do B, czyli sumę ciągu (A,A + 1,...,B). Obliczenia należy wykonać dwukrotnie stosując kolejno pętle: while, for.
    //
    //Przykład: Dla A = 4 i B = 11 program powinien wyświetlić: 60 60

    public static void main(String[] args){

         int a = 0;
         int b = 0;
         int sum =0;
         int counter;

        Scanner scanner = new Scanner(System.in);

        do{

            System.out.print("Podaj poczatek zakresu, a= ");
            a = scanner.nextInt();
            System.out.println(" ");
            System.out.print("Podaj koniec zakresu, b= ");
            b = scanner.nextInt();
            System.out.println(" ");

        }while (a>b);

          System.out.println("Suma ciagu a+1,z zakresu " + a + " ," + b);

          for(int i=a; i<=b;i++){
              sum = sum + i;
          }
          System.out.println("sum= " + sum);

        System.out.println("liczone z while ");

        counter = a;
        sum = 0;

        while (counter<=b){
            sum = sum + counter;
            counter++;
        }
        System.out.println("sum= " + sum);

    }



}
