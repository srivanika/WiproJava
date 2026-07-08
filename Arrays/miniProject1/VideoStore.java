package Arrays.miniProject1;

public class VideoStore {

    private Video[] store;
    private int count;

    public VideoStore() {
        store = new Video[20];
        count = 0;
    }

    public void addVideo(String name) {
        store[count] = new Video(name);
        count++;
        System.out.println("Video \"" + name + "\" added successfully.");
    }

    public void doCheckout(String name) {

        for (int i = 0; i < count; i++) {

            if (store[i].getName().equalsIgnoreCase(name)) {

                if (!store[i].getCheckout()) {
                    store[i].doCheckout();
                    System.out.println("Video checked out successfully.");
                } else {
                    System.out.println("Video is already checked out.");
                }

                return;
            }
        }

        System.out.println("Video not found.");
    }

    public void doReturn(String name) {

        for (int i = 0; i < count; i++) {

            if (store[i].getName().equalsIgnoreCase(name)) {

                if (store[i].getCheckout()) {
                    store[i].doReturn();
                    System.out.println("Video returned successfully.");
                } else {
                    System.out.println("Video was not checked out.");
                }

                return;
            }
        }

        System.out.println("Video not found.");
    }

    public void receiveRating(String name, int rating) {

        for (int i = 0; i < count; i++) {

            if (store[i].getName().equalsIgnoreCase(name)) {

                store[i].receiveRating(rating);
                System.out.println("Rating added successfully.");
                return;
            }
        }

        System.out.println("Video not found.");
    }

    public void listInventory() {

        System.out.println("\n-----------------------------------------------------------");
        System.out.printf("%-20s %-15s %-10s\n",
                "Video Name", "Checked Out", "Rating");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < count; i++) {

            System.out.printf("%-20s %-15s %-10d\n",
                    store[i].getName(),
                    store[i].getCheckout(),
                    store[i].getRating());
        }

        System.out.println("-----------------------------------------------------------");
    }
}