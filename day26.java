import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int day1 = scan.nextInt();
        int month1 = scan.nextInt();
        int year1 = scan.nextInt();
        int day2 = scan.nextInt();
        int month2 = scan.nextInt();
        int year2 = scan.nextInt();

        if (year1 == year2 && month1 == month2) {
            if (day2 < day1)
                System.out.println((day1 - day2) * 15);
            else
                System.out.println(0);
        }
        else if (year1 == year2 && month2 < month1) {
            System.out.println((month1 - month2) * 500);
        }
        else if (year2 < year1 ) {
            System.out.println(10000);
        }
        else {
            System.out.println(0);
        }
    }
}
