package Multithread.Threadcontrolandpriorities;
class EvenThread extends Thread {
    @Override
    public void run() {
        System.out.println("Even Numbers:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
class OddThread extends Thread {
    @Override
    public void run() {
        System.out.println("Odd Numbers:");
        for (int i = 1; i < 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
public class EvenOddThreads {
    public static void main(String[] args) {
        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();
        even.start();
        try {
            even.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        odd.start();
    }
}
