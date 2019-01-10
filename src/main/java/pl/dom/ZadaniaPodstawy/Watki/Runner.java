package pl.dom.ZadaniaPodstawy.Watki;

public class Runner {

    public static void main(String[] args){
        Runnable[] runners = new Runnable[10];
        Thread[] threads = new Thread[10];

        for(int i=0; i<runners.length;i++){
            runners[i] = new MyRun(i);
        }

        for(int i=0;i<threads.length;i++){
            threads[i] = new Thread(runners[i]);
        }

        for(int i=0;i<threads.length;i++){
            threads[i].start();
        }
    }
}
