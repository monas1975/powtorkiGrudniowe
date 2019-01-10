package pl.dom.Wiwala.Lambda;

public class Example3 {

    public static void main(String[] args){
        repeat("tomek",30);
    }

    public static void repeat(String text, int n){
        Runnable r = ()->{
            for(int i=0;i<n;i++){
                System.out.println(text);

            }
        };
        new Thread(r).start();
    }
}
