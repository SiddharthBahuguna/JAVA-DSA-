public class PairsInArrays {
    public static void PrintPairs(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i + 1; i < numbers.length; j++) {
                System.out.println("(" + curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }

    public static void main(String args[]) {
        int numbers[] = { 2, 3, 4, 5, 6 };
        PrintPairs(numbers);
        for (int i = 0; i < numbers.length; i++)
            System.out.println("Total pairs=" + tp);
    }

}
