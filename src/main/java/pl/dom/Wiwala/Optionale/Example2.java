package pl.dom.Wiwala.Optionale;

import java.util.Optional;

public class Example2 {

    public static void main(String[] args){
        Optional<Double> odwrotnosc =odwrotnosc(10);
        odwrotnosc.ifPresent((x)->System.out.println(x));

        Optional<Double> odwrotnosc2 =odwrotnosc(0);
        odwrotnosc2.ifPresent((x)->System.out.println(x));

        Optional<Double> pierwiastek = pierwiastek(16);
        pierwiastek.ifPresent((x)->System.out.println(x));

        Optional<Double> pierwiastek2 = pierwiastek(0);
        pierwiastek2.ifPresent((x)->System.out.println(x));
    }

    public static Optional<Double>odwrotnosc(double b){
        if(b==0){
            return Optional.empty();
        }else
            return Optional.of(1/b);
    }

    public static Optional<Double> pierwiastek(double b){
        if(b==0){
            return Optional.empty();
        }else
            return Optional.of(Math.sqrt(b));

    }
}
