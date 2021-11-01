package CS203Course.HashMap;

import java.util.HashMap;

public class CapitalCities {

    public static void main(String[] args) {

        HashMap<String, String> capitalCities = new HashMap<String, String>();//fixme => creating HashMap
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("England","London");
        capitalCities.put("Norway","Oslo");
        capitalCities.put("USA","Washington DC");

        System.out.println(capitalCities);
        System.out.println(capitalCities.get("England"));
        System.out.println(capitalCities.remove("Norway"));
        System.out.println(capitalCities.size());

        for(String c: capitalCities.keySet()){ //fixme => using keySet()  printing the keys which is the first items
            System.out.println(c);
        }

        for(String c: capitalCities.values()){ //fixme => using values() printing the values which is the second items
            System.out.println(c);
        }

        // Print keys and values  fixme using both keys and values to printing both items
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }


    }
}
