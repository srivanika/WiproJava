package Arrays.miniProject1;

import java.util.Scanner;

public class VideoLauncher {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VideoStore store = new VideoStore();

        int choice;

        do {

            System.out.println("\n******** VIDEO RENTAL INVENTORY ********");
            System.out.println("1. Add Video");
            System.out.println("2. Check Out Video");
            System.out.println("3. Return Video");
            System.out.println("4. Receive Rating");
            System.out.println("5. List Inventory");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter video name: ");
                    String add = sc.nextLine();
                    store.addVideo(add);
                    break;

                case 2:
                    System.out.print("Enter video name to checkout: ");
                    String check = sc.nextLine();
                    store.doCheckout(check);
                    break;

                case 3:
                    System.out.print("Enter video name to return: ");
                    String ret = sc.nextLine();
                    store.doReturn(ret);
                    break;

                case 4:
                    System.out.print("Enter video name: ");
                    String rateVideo = sc.nextLine();

                    System.out.print("Enter rating: ");
                    int rating = sc.nextInt();

                    store.receiveRating(rateVideo, rating);
                    break;

                case 5:
                    store.listInventory();
                    break;

                case 6:
                    System.out.println("Thank you for using Video Rental Inventory System.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}