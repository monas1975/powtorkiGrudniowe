package pl.dom.Wiwala.Zadania;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Zadanie21 {

    public static void main(String[] args){

        //21. Utwórz metodę, która przyjmuje listę liczb, a następnie zwraca największą z nich

        List<Integer> list = Arrays.asList(4,8,1,50);
        System.out.println("max = " + maxOf(list));
    }

    private static OptionalInt maxOf(List<Integer> list){

        return list.stream().mapToInt((x)->x).max();
    }




}
