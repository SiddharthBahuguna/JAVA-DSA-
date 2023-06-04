import java.util.*;

public class HashmapImplement {
    public static void main(String args[]) {
        // create
        HashMap<String, Integer> hm = new HashMap<>();
        // insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        // get
        int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Indonesia"));

        // contains key
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        // remove
        System.out.println(hm.remove("China"));
        System.out.println(hm);
        System.out.println(hm.size());
    }
}
