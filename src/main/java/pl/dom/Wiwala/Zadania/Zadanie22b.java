package pl.dom.Wiwala.Zadania;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zadanie22b {

    public static void main(String[] args){
        //22. Utwórz metodę która przyjmuje listę liczb, a następnie zwraca listę liczb parzystych

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        list.forEach((x)->System.out.print(x +" , "));
        System.out.println();
        System.out.println("parzyste =");
        List<Integer> list2 = parzyste(list);
        list2.forEach((x)->System.out.print(x +" , "));
    }

   public static List<Integer> parzyste(List<Integer> list){
        List<Integer> parzyste = list.stream().filter((x)->x%2==0).collect(Collectors.toList());

        return  parzyste;
   }
}
