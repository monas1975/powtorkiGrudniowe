package pl.dom.Wiwala.Lambda;

public class Example1 {

    public static void main(String[] args){

        repeat(9,()->System.out.println("Hello world"));
    }

    public static void repeat(int n, Runnable action){
        for(int i=0; i<n;i++){
            action.run();
        }
    }
}
