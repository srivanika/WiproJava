package Multithread;

class MyThread extends Thread {

    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }
}

public class ThreadNames {

    public static void main(String[] args) {

        // Create two thread objects
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        // Set names for the threads
        t1.setName("Scooby");
        t2.setName("Shaggy");

        // Display thread names
        System.out.println("First Thread Name: " + t1.getName());
        System.out.println("Second Thread Name: " + t2.getName());

        // Start the threads
        t1.start();
        t2.start();
    }
}
