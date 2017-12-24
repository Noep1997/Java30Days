import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // get number of strings
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // skip empty space
        scan.nextLine();

        // save all strings in an array
        String[] stringlist = new String[n];
        for (int i = 0; i < n; i++)
            stringlist[i] = scan.nextLine();
        // close scanner
        scan.close();

        // convert strings to char array and print
        for (int i = 0; i < n; i++) {
            // convert to char array
            char[] word = stringlist[i].toCharArray();
            // print even indexes
            for (int j = 0; j < word.length; j++) {
                if (j % 2 == 0)
                    System.out.print(word[j]);
            }
            // print empty space
            System.out.print(" ");
            // print odd indexes
            for (int j = 0; j < word.length; j++) {
                if (j % 2 == 1)
                    System.out.print(word[j]);
            }
            // print new line
            System.out.println("");
        }
    }
}
