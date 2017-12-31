import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int i = 0; i < T; i++) {
             int n = scan.nextInt();
             int count = 0;

            if (n == 1)
                System.out.println("Not prime");
            else {
                for (int j = 2; j * j <= n; j++) {
                    if (n % j == 0)
                        count++;
                }

                if (count == 0)
                    System.out.println("Prime");
                else
                    System.out.println("Not prime");
            }
        }
    }
}
