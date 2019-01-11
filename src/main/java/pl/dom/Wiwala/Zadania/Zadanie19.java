package pl.dom.Wiwala.Zadania;

import java.util.stream.IntStream;

public class Zadanie19 {

    public static void main(String[] args){

        //19. Napisz metodę która przyjmuje strumień liczb i liczy z niej sumę elementów.

        IntStream list = IntStream.of(11,12,13,14,15,16);
       // list.forEach((x)->System.out.print(x+" , "));

        System.out.println(list.sum());

    }


}
