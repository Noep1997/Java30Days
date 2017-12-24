import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        // define max
        int max = 0;
        int current = 0;

        // compute the highest sum
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                current += arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] +
                          arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                // replace max
                if (i == 0 && j == 0)
                    max = current;
                else if (current > max)
                    max = current;
                current = 0;
            }
        }
        // output max
        System.out.println(max);
    }
}
