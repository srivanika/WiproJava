package Multithread.Threadcontrolandpriorities;
class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " : " + i);
        }
        System.out.println(getName() + " Completed.");
    }
}
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        PriorityThread max = new PriorityThread("MAX Priority");
        PriorityThread min = new PriorityThread("MIN Priority");
        PriorityThread norm = new PriorityThread("NORM Priority");
        max.setPriority(Thread.MAX_PRIORITY);
        min.setPriority(Thread.MIN_PRIORITY);
        norm.setPriority(Thread.NORM_PRIORITY);
        max.start();
        min.start();
        norm.start();
    }
}