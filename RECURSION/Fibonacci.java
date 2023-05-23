public class Fibonacci {
    public static int FibNumber(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return (n - 2) + (n - 1);
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println(FibNumber(n));
    }
}
