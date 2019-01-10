package pl.dom.Wiwala.Watki;

public class TomekRunnable implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("tomek" + i);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
