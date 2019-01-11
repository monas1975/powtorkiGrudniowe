package pl.dom.Wiwala.Zadania;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zadanie24 {

    public static void main(String[] args){
        //24. Utwórz metodę która przyjmuje listę liczb, a następnie zwraca listę liczb, w której są pierwiastki tych liczb,
        // pamiętaj że nie liczymy pierwiastka z liczby ujemnej! Dla listy [2, 4, 16], zwróc [1.41, 2, 4]


        List<Double> list = new ArrayList<Double>();
        list.add(1.0);
        list.add(2.0);
        list.add(-3.5);
        list.add(4.0);
        list.add(9.0);
        list.add(16.0);
        list.add(17.0);

        list.forEach((x)->System.out.print(x + " , "));
        System.out.println("");
        List<Double> results = pierwiatki(list);
        results.forEach((x)->System.out.print(x + " , "));

    }

    public static List<Double> pierwiatki(List<Double> list){
        List<Double> wynik= list
                .stream()
                .filter((x)->x>0)
                .map((x)->Math.sqrt(x))
                .collect(Collectors.toList());
              return wynik;
    }



}
