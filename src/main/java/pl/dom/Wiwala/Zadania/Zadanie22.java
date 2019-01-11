package pl.dom.Wiwala.Zadania;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Zadanie22 {

    public static void main(String[] args){
        // 22. Utwórz metodę, która przyjmuje listę liczb, a następnie zwraca różnicę
        //pomiędzy największa a najmniejszą. (zajrzyj do funkcji zbierających wynik ze strumienia)


        List<Integer> list = Arrays.asList(6,2,7,9,1);
        System.out.println(subOfMaxAndMin(list));


    }

    public static long subOfMaxAndMin(List<Integer> list){
        OptionalInt max = list.stream().mapToInt((x)->x).max();
        OptionalInt min = list.stream().mapToInt((x)->x).min();
        Integer sub = max.orElse(0) - min.orElse(0);
        return sub;
    }

}
