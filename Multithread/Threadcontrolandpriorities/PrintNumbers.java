package Multithread.Threadcontrolandpriorities;



class NumberThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {

            System.out.println(i);

            if (i == 5) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}

public class PrintNumbers {

    public static void main(String[] args) {

        NumberThread t = new NumberThread();
        t.start();

    }
}
