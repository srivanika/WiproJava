package collections.set;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("India");
        ts.add("Japan");
        ts.add("Australia");
        ts.add("USA");
        ts.add("Canada");

        System.out.println("Reverse Order:");
        System.out.println(ts.descendingSet());

        System.out.println("\nUsing Iterator:");

        Iterator<String> itr = ts.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        String search = "India";

        if (ts.contains(search))
            System.out.println("\n" + search + " Found");
        else
            System.out.println("\n" + search + " Not Found");
    }
}
