package pl.dom.Wiwala.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class example2 {

    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        list.add("Ala");
        list.add("Ma");
        list.add("Kot");
        list.add("Tomek");
        list.add("Potworowo");

        System.out.println(list.stream());
        List<String> firstLetterList = list
                .stream()
                .map(g->g.substring(0,1))
                .collect(Collectors.toList());
        System.out.println(firstLetterList);



    }
}
