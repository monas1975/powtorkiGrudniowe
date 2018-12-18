package pl.dom.ZadaniaPodstawy.Podstawy;

import java.util.Scanner;

public class Zadanie9 {

    //Napisać program służący do konwersji wartości temperatury podanej w stopniach Celsjusza
    // na stopnie w skali Fahrenheita (stopnie Fahrenheita = 1.8 * stopnie Celsjusza + 32.0)

    public static void main(String[] args){

        double tempC;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj temerature w st. Celsjusza");
        tempC = scanner.nextDouble();

        System.out.println(tempC + "st. C to " + tempConverter(tempC) + " st. F");
    }

    public static double tempConverter(double tempC){
        return (tempC*1.8)+32.0;
    }
}
