import java.util.ArrayList;

public class FindMaximumInArrayList {
    public static void main(String args[]) {
        int max = Integer.MIN_VALUE;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) { // max=Math.max(max,list.get(i));
                max = list.get(i);
            }
        }
        System.out.println("Maximum element:" + max);
    }
}
