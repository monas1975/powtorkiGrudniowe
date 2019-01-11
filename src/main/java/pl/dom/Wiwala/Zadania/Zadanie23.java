package pl.dom.Wiwala.Zadania;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zadanie23 {

    public static void main(String[] args){
        //23.  Utwórz metodę która przyjmuje listę liczb,
        // a następie sortuje je rosnąco (metoda sorted() na strumieniu)

        List<Integer> list = Arrays.asList(8,4,19,11,3,2,9,1);
        list.forEach((x)->System.out.print(x+ " , "));
        System.out.println("");
        List<Integer> sortedList = sort(list);
        sortedList.forEach((x)->System.out.print(x+ ", "));
        System.out.println("");
    }

    public static List<Integer> sort(List<Integer> list){

        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());

        return sortedList;
    }
}
