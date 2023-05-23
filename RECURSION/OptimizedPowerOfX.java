public class OptimizedPowerOfX {
    public static int OP(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = OP(a, n / 2);
        int halfPowerSquare = halfPower * halfPower;

        if (n % 2 != 0) {
            halfPowerSquare = a * halfPowerSquare;
        }
        return halfPowerSquare;
    } 

    public static void main(String args[]) {
        int a = 2;
        int n = 5;
        System.out.println(OP(a, n));
    }

}
