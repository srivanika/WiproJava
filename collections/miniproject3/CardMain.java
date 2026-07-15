package collections.miniproject3;

import java.util.Scanner;
import java.util.TreeSet;

public class CardMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeSet<Card> set = new TreeSet<>(new CardComparator());

        int count = 0;

        while (set.size() < 4) {

            System.out.println("Enter a card :");

            char symbol = sc.next().charAt(0);
            int number = sc.nextInt();

            count++;

            Card card = new Card(symbol, number);

            set.add(card);
        }

        System.out.println("Four symbols gathered in " + count + " cards.");

        System.out.println("Cards in Set are :");

        for (Card c : set) {

            System.out.println(c.getSymbol() + " " + c.getNumber());
        }

        sc.close();
    }
}
