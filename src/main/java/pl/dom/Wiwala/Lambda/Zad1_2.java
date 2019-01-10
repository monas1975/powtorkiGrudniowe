package pl.dom.Wiwala.Lambda;

public class Zad1_2 {
    public static void main(String[] args){
        repeat(5,()->{
            System.out.println("Monas");
        });

    }

    public static void repeat(int n, MyRunner r){
        for(int i=0;i<n;i++){
            r.action();
        }
    }
}
