import java.util.*;

public class LinkedHashmapImplement {
    public static void main(String args[]) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("USA", 50);

        System.out.println(lhm); // {India=100, China=150, USA=50}

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);

        System.out.println(hm); // {USA=50, China=150, India=100}
    }

}
