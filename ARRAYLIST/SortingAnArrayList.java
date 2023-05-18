import java.util.*;

public class SortingAnArrayList {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(32);
        list.add(43);
        list.add(14);
        list.add(59);
        Collections.sort(list); // ascending order(always)
        System.out.println(list);
    }
}
