package pl.dom.Wiwala.Optionale;

import java.util.Optional;

public class Example1 {

    public static void main(String[] args){
        Optional<Integer> integer = Optional.ofNullable(null);
        Integer integer1 = integer.orElse(0);
    }
}
