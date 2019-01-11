package pl.dom.Wiwala.Prymitywy;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Example1 {

    public static void main(String[] args){

        IntStream intStream = IntStream.of(10,20,30);
        IntSummaryStatistics intSummaryStatistics = intStream.summaryStatistics();
        System.out.println(intSummaryStatistics);
        System.out.println(intSummaryStatistics.getAverage());


    }
}
