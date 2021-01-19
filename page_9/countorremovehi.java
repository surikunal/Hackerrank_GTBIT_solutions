import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int i = scn.nextInt();

        System.out.println(countHi(str, 0));
        String ans = printHi(str, 0);
        System.out.println(ans.charAt(i));
        printAllHi(str, 0, "");
    }

    public static void printAllHi(String str, int idx, String ans) {
        if (idx >= str.length() - 1) {
            if (idx == str.length() - 1) {
                ans += str.charAt(idx);
            }
            System.out.println(ans);
            return;
        }

        String s = str.substring(idx, idx + 2);
        if (s.equals("hi")) {
            printAllHi(str, idx + 2, ans);
        } else {
            printAllHi(str, idx + 1, ans + str.charAt(idx));
        }
    }

    public static String printHi(String str, int idx) {
        if (idx >= str.length() - 1) {
            if (idx == str.length() - 1) {
                return str.charAt(idx) + "";
            }
            return "";
        }

        String s = str.substring(idx, idx + 2);
        if (s.equals("hi")) {
            return printHi(str, idx + 2);
        } else {
            return printHi(str, idx + 1) + str.charAt(idx);
        }
    }

    public static int countHi(String str, int idx) {
        if (idx >= str.length() - 1) {
            return 0;
        }

        String s = str.substring(idx, idx + 2);
        if (s.equals("hi")) {
            return countHi(str, idx + 2) + 1;
        } else {
            return countHi(str, idx + 1);
        }
    }
}