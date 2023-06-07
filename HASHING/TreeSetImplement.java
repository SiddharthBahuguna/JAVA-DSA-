import java.util.*;

public class TreeSetImplement {
    public static void main(String args[]) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengalore");

        System.out.println(ts);// [Bengalore, Delhi, Mumbai, Noida]
    }

}
