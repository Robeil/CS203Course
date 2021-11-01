package CS203Course.HashMap;

import java.util.HashMap;

public class PeopleHashMap {

    public static void main(String[] args) {

        HashMap<String, Integer> people = new HashMap<>(); //fixme creating hashMap named people

        //add keys and values (name, age)
        people.put("Robeil",28);
        people.put("Keleab",25);
        people.put("Haben",20);
        people.put("Hannah",18);
        people.put("Silvana",16);

        for(String i: people.keySet()) {
            System.out.println(i +" " + people.get(i));
        }

    }
}
