
public class UpdateIthBit {

    
    public static int updateIthbit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }
    }

    public static void main(String args[]) {
        System.out.println(updateIthbit(10, 20, 1));
    }
}
