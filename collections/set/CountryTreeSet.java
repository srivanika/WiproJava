package collections.set;

import java.util.TreeSet;

public class CountryTreeSet {

    TreeSet<String> T1 = new TreeSet<>();

    public TreeSet<String> saveCountryNames(String countryName) {
        T1.add(countryName);
        return T1;
    }

    public String getCountry(String countryName) {

        for (String country : T1) {

            if (country.equalsIgnoreCase(countryName)) {
                return country;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        CountryTreeSet obj = new CountryTreeSet();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Germany");
        obj.saveCountryNames("Japan");

        System.out.println(obj.T1);

        System.out.println("Search India : " + obj.getCountry("India"));
        System.out.println("Search China : " + obj.getCountry("China"));
    }
}