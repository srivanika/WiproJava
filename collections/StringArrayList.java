package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class StringArrayList {

    public static void printAll(ArrayList<String> list){

        Iterator<String> itr = list.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }

    public static void main(String[] args){

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("C++");

        printAll(list);

    }

}
