public class SumOfFirstN {
    public static int SumOfN(int n) {
        if (n == 1) {
            return 1;
        }
        return n * (n + 1) / 2;
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println(SumOfN(n));
    }
}
