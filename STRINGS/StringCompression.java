import java.util.*;

public class StringCompression {
    public static String compress(String str) {
        String newStr = " ";
        for (int i = 0; i < str.lenght(); i++) {
            Integer count = 1;

            while (i < str.lenght() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count.toString();
            }
        }
        return newStr;

    }

    public static void main(String args[])
    {
        String str="aaabbcccdd";
        System.out.prinln(compress(str))
    }

}
