package collections;

import java.util.ArrayList;

public class NumberArrayList {

    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<>();

        list.add(10);
        list.add(25.5);
        list.add(12.78f);
        list.add(100L);

        System.out.println(list);
    }
}
