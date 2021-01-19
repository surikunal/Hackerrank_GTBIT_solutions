import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int k = scn.nextInt();
        String ans = saperrateDuplicates1(str, 1, str.charAt(0) + "");
        System.out.println(ans.charAt(k));
        System.out.println(ans);
    }
    
    public static String saperrateDuplicates1(String str, int i, String ans) {
        if (i == str.length()) {
            return ans;
        }
        
        if (str.charAt(i - 1) == str.charAt(i)) {
            ans += ("*" + str.charAt(i));
        } else {
            ans += str.charAt(i);
        }
        
        return saperrateDuplicates1(str, i + 1, ans);
    }
}