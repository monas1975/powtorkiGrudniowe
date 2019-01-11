package pl.dom.Wiwala.Prymitywy;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test1 {

    public static void main(String[] args){

        //IntStream intStream = IntStream.of(10,20,30);
        //IntSummaryStatistics intSummaryStatistics = intStream.summaryStatistics();
       // System.out.println(intSummaryStatistics);
       // System.out.println(intSummaryStatistics.getAverage());



        //Stream<Double> generate = Stream.generate(()->Math.random());
       // List<Double> collect = )generate.limit(2.collect(Collectors.toList());

        DoubleStream doubleStream =DoubleStream.generate(()->Math.random()).limit(10000000);

        DoubleSummaryStatistics doubleSummaryStatistics = doubleStream.summaryStatistics();
        //doubleStream.forEach(System.out::print);
        //System.out.println(doubleStream);
        System.out.println(doubleSummaryStatistics);

    }
}
