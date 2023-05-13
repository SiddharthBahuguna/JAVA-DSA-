public class Subarrays {
    public static void subArrays(int numbers[]) {
        int ts=0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            for (int j = 0; j < numbers.length; j++) {
                int end = j;

                for (int k = start; k <= end; k++) {
                    System.out.println(numbers[k] + " ");
                }
                ts++;
                System.out.println();

            }
            System.out.println();
        }
        System.out.println("Total Subarray:" + ts);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        subArrays(numbers);
    }
}
