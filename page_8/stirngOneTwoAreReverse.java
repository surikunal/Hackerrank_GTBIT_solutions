import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a = scn.next();
        String b = scn.next();
        System.out.println(check(a, b, 0, b.length() - 1));
    }
    
    public static boolean check(String ans1, String ans2, int i, int j) {
        if (j <= -1) {
            return true;
        }
        
        if (ans1.charAt(i) != ans2.charAt(j)) {
            return false;
        }
        
        return check(ans1, ans2, i + 1, j - 1);
    }
}