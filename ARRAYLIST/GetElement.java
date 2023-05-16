import java.util.ArrayList;

public class GetElement {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int element = list.get(2);
        System.out.println(element);
    }

}
