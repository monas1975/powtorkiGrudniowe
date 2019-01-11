package pl.dom.Wiwala.Zadania;

import java.util.stream.IntStream;

public class Zadanie18 {

    //18. Napisz metodę która wyświetli wszystkie liczby od 0 do 10 włącznie
    public static void main(String[] args){

        piszLiczby();

    }

    private static void piszLiczby(){
        IntStream.iterate(0,n->n+1).limit(10).forEach((x)->System.out.print(x));
        System.out.println("");
        IntStream.iterate(0,n->n+2).limit(20).forEach((x)->System.out.print(x+" ,"));
        System.out.println("");
        IntStream.iterate(30,x->x-5).limit(10).forEach((x)->System.out.print(x+" , "));
    }
}
