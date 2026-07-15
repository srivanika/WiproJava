package collections.map;

import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("A", "Apple");
        map.put("B", "Ball");
        map.put("C", "Cat");
        map.put("D", "Dog");

        System.out.println("Key A Exists : " + map.containsKey("A"));

        System.out.println("Value Dog Exists : " + map.containsValue("Dog"));

        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();

        while (itr.hasNext()) {

            Map.Entry<String, String> entry = itr.next();

            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }

    }

}
