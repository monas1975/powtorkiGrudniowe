package pl.dom.Wiwala.Lambda;

import java.util.function.IntConsumer;

public class Example2 {
    public static void main(String[] args){
        repeat(5,(n)->System.out.println(n));

    }

    public static void repeat(int n,IntConsumer action){
        for(int i=0;i<n;i++){
            action.accept(i);
        }
    }

}
