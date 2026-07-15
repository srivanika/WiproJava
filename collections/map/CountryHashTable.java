package collections.map;

import java.util.*;

public class CountryHashTable {

    Hashtable<String, String> M1 = new Hashtable<>();

    public Hashtable<String, String> saveCountryCapital(String country, String capital) {
        M1.put(country, capital);
        return M1;
    }

    public String getCapital(String country) {
        return M1.get(country);
    }

    public String getCountry(String capital) {

        for (Map.Entry<String, String> entry : M1.entrySet()) {

            if (entry.getValue().equalsIgnoreCase(capital)) {
                return entry.getKey();
            }

        }

        return null;
    }

    public Hashtable<String, String> reverseMap() {

        Hashtable<String, String> M2 = new Hashtable<>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }

        return M2;
    }

    public ArrayList<String> getCountryList() {

        ArrayList<String> list = new ArrayList<>();

        for (String country : M1.keySet()) {
            list.add(country);
        }

        return list;
    }

    public static void main(String[] args) {

        CountryHashTable obj = new CountryHashTable();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington");

        System.out.println("Country-Capital Map");
        System.out.println(obj.M1);

        System.out.println("Capital of Japan : " + obj.getCapital("Japan"));

        System.out.println("Country of Delhi : " + obj.getCountry("Delhi"));

        System.out.println("Reverse Map");
        System.out.println(obj.reverseMap());

        System.out.println("Country List");
        System.out.println(obj.getCountryList());

    }
}