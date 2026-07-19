package Multithread.miniproject;

public class RaceThread extends Thread {

    private static boolean raceFinished = false;
    private String runnerName;

    public RaceThread(String runnerName) {
        this.runnerName = runnerName;
    }

    @Override
    public void run() {

        for (int distance = 1; distance <= 100; distance++) {

            // Stop if another thread has already won
            if (raceFinished) {
                break;
            }

            System.out.println(runnerName + " : " + distance + " meters");

            try {

                // Hare sleeps after reaching 60 meters
                if (runnerName.equals("Hare") && distance == 60) {
                    System.out.println("\nHare is sleeping for 1000 milliseconds...\n");
                    Thread.sleep(1000);
                } else {
                    Thread.sleep(50);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Check winner
            if (distance == 100 && !raceFinished) {
                raceFinished = true;
                System.out.println("\n********************************");
                System.out.println(runnerName + " wins the race!");
                System.out.println("********************************");
            }

        }

    }
}