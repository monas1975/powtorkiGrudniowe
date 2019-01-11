package pl.dom.Wiwala.Zadania;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadanie20 {

    //20. Utwórz metodę, która przyjmuje listę liczb, a następnie zwraca ich sumę.

    public static void main(String[] args){

        List<Integer> list = Arrays.asList(10,20,30);
        System.out.println(sumOf(list));


    }

    public static long sumOf(List<Integer> list){
        int sum = list.stream().mapToInt((x)->x).sum();
        return sum;
    }


}
