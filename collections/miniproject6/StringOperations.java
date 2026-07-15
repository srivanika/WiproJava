package collections.miniproject6;

import java.util.ArrayList;
import java.util.Scanner;

public class StringOperations {

    public static ArrayList<String> performOperations(String s1, String s2) {

        ArrayList<String> list = new ArrayList<>();

        // Operation 1
        StringBuilder op1 = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {

            if (i % 2 == 0)
                op1.append(s2);
            else
                op1.append(s1.charAt(i));
        }

        list.add(op1.toString());

        // Operation 2
        int first = s1.indexOf(s2);
        int last = s1.lastIndexOf(s2);

        if (first != -1 && first != last) {

            String reverse = new StringBuilder(s2).reverse().toString();

            String op2 = s1.substring(0, last) + reverse
                    + s1.substring(last + s2.length());

            list.add(op2);

        } else {

            list.add(s1 + s2);
        }

        // Operation 3
        if (first != -1 && first != last) {

            String op3 = s1.substring(0, first)
                    + s1.substring(first + s2.length());

            list.add(op3);

        } else {

            list.add(s1);
        }

        // Operation 4
        int mid = (s2.length() + 1) / 2;

        String firstHalf = s2.substring(0, mid);
        String secondHalf = s2.substring(mid);

        list.add(firstHalf + s1 + secondHalf);

        // Operation 5
        StringBuilder op5 = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {

            if (s2.indexOf(s1.charAt(i)) != -1)
                op5.append('*');
            else
                op5.append(s1.charAt(i));
        }

        list.add(op5.toString());

        return list;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String 1:");
        String s1 = sc.nextLine();

        System.out.println("Enter String 2:");
        String s2 = sc.nextLine();

        ArrayList<String> result = performOperations(s1, s2);

        System.out.println(result);

        sc.close();
    }
}
