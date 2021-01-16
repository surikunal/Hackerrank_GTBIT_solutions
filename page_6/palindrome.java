import java.io.*;
import java.util.*;

public class palindrome {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        String str = scn.next();

        System.out.println(isPali(str, 0, str.length() - 1));
    }

    public static boolean isPali(String str, int i, int j) {
        if (i >= j) {
            return true;
        }

        int d1 = (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') ? str.charAt(i) - 'A' : str.charAt(i) - 'a';
        int d2 = (str.charAt(j) >= 'a' && str.charAt(j) <= 'z') ? str.charAt(j) - 'a' : str.charAt(j) - 'A';
        // System.out.println(d1 + " " + d2);
        if (d1 != d2) {
            return false;
        }
        return isPali(str, i + 1, j - 1);
    }
}
