package collections.map;

import java.util.*;

public class StateCapitalProperties {

    public static void main(String[] args) {

        Properties states = new Properties();

        states.put("Andhra Pradesh", "Amaravati");
        states.put("Telangana", "Hyderabad");
        states.put("Karnataka", "Bengaluru");
        states.put("Tamil Nadu", "Chennai");

        Iterator<Object> itr = states.keySet().iterator();

        while (itr.hasNext()) {

            String state = (String) itr.next();

            System.out.println(state + " -> " + states.getProperty(state));

        }

    }

}
