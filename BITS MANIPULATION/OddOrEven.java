public class OddOrEven {
    public static void OddorEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String args[]) {
        OddorEven(3);
        OddorEven(6);
    }
}