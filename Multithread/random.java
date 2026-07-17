package Multithread;

import java.util.Random;

class ColourTask implements Runnable {

    public void run() {

        String colours[] = {"white", "blue", "black", "green", "red", "yellow"};

        Random random = new Random();

        while (true) {

            int index = random.nextInt(colours.length);

            System.out.println("Colour: " + colours[index]);

            if (colours[index].equals("red")) {
                System.out.println("Red colour matched. Thread stopped.");
                break;
            }

            try {
                Thread.sleep(500); // Delay of 0.5 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class random {

    public static void main(String[] args) {

        ColourTask task = new ColourTask();

        Thread t = new Thread(task);

        t.start();
    }
}
