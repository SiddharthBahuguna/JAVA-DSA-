public class BinarySearch {
    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (numbers[mid] == key) {
                return mid;
            }

            if (numbers[mid] < key) {
                start = mid + 1; // right
            } else {
                end = mid - 1; // left
            }
        }
        return -1;

    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 7;
        System.out.println("Index is:" + binarySearch(numbers, key));
    }

}
