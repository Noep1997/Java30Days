import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // convert to binary char array
        String binary = Integer.toBinaryString(n);
        char[] num = binary.toCharArray();

        // count number of 1's
        int tmp = 0;
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            // check for 1
            if (num[i] == '1') {
                tmp += 1;
            }
            else {
                tmp = 0;
            }

            // check if tmp is now bigger than last count
            if (tmp > count)
                count = tmp;
        }

        // output number of 1's
        System.out.println(count);
    }
}
