package pl.dom.Wiwala.Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class example3 {

    public static void main(String[] args){

        Stream<Double> generate = Stream.generate(()->Math.random());
        List<Double> collect = generate.limit(10).collect(Collectors.toList());

        System.out.print(collect);

    }
}
