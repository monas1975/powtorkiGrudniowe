package pl.dom.Wiwala.Lambda;

public class Zad1 {
    public static void main(String[] args){
        repeat(5,()->{
            System.out.println("tomek");
                }

                );

    }

    public static void repeat(int n, Runnable r){
        for(int i=0;i<n;i++){
            r.run();
        }
    }
}
