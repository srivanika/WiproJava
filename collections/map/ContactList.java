package collections.map;

import java.util.*;

public class ContactList {

    public static void main(String[] args) {

        HashMap<String, Integer> contacts = new HashMap<>();

        contacts.put("Rahul", 987654321);
        contacts.put("Priya", 987650123);
        contacts.put("Akash", 987650111);
        contacts.put("Anjali", 987650222);

        System.out.println("Rahul Exists : " + contacts.containsKey("Rahul"));

        System.out.println("987650111 Exists : " + contacts.containsValue(987650111));

        Iterator<Map.Entry<String, Integer>> itr = contacts.entrySet().iterator();

        while (itr.hasNext()) {

            Map.Entry<String, Integer> entry = itr.next();

            System.out.println(entry.getKey() + " : " + entry.getValue());

        }

    }

}
