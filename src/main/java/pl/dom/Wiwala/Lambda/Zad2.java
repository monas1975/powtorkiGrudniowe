package pl.dom.Wiwala.Lambda;

import java.util.function.IntConsumer;

public class Zad2 {

    public static void main(String[] args){
        repeat(5,(i)->System.out.println(i + "HE HE"));

    }

    public static void repeat(int n, IntConsumer intConsumer){
        for(int i=0;i<n;i++){
            intConsumer.accept(n);
        }
    }
}
