package pl.dom.Wiwala.Streams;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class example1 {

    public static void main(String[] args){

        List<String> wordsList = new ArrayList<>();
        wordsList.add("Lorem");
        wordsList.add("Ipsum");
        wordsList.add("lllllllllllllllllll");
        wordsList.add("jjjjjjjjjjjjjjjjjjjj");

        List<String> wptdsListHighThen10 = new ArrayList<>();
        for(int i= 0; i<wordsList.size();i++){
            if(wordsList.get(i).length()>10){
                wptdsListHighThen10.add(wordsList.get(i));
            }
        }

        List<String> wptdsListHighThen10_2 = wordsList
                .stream()
                .filter((x)->x.length()>10)
                .collect(Collectors.toList());

        System.out.println(wptdsListHighThen10);
        System.out.println(wptdsListHighThen10_2);
        Stream<Integer> integers= Stream.iterate(0,n->n+1);
        System.out.println(integers);

    }

}
