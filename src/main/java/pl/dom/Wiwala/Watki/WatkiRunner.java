package pl.dom.Wiwala.Watki;

public class WatkiRunner {

    public static void main(String[] args) {

        Thread thread = new Thread(new PoliczRunnable());
        thread.start();
        Thread thread2 = new Thread(new TomekRunnable());
        thread2.start();
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("watek lambda " + i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }


        );
        thread3.start();
    }
}
