import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int i = scn.nextInt();
        
        String ans = replaceHi(str, 0, "");
        System.out.println(ans.charAt(i));
        replaceAllHi(str, 0, "");
    }
    
    public static void replaceAllHi(String str, int i, String ans) {
        if (i >= str.length() - 1) {
            if (i == str.length() - 1) {
                System.out.println(ans + str.charAt(i));
                return;
            }
            System.out.println(ans);
            return;
        }
        
        String s = str.substring(i, i + 2);
        if (s.equals("hi")) {
            replaceAllHi(str, i + 2, ans + "pep");
        } else {
            replaceAllHi(str, i + 1, ans + str.charAt(i));
        }
    }
    
    public static String replaceHi(String str, int i, String ans) {
        if (i >= str.length() - 1) {
            if (i == str.length() - 1) {
                return ans + str.charAt(i);
            }
            return ans;
        }
        
        String s = str.substring(i, i + 2);
        if (s.equals("hi")) {
            return replaceHi(str, i + 2, ans + "pep");
        } else {
            return replaceHi(str, i + 1, ans + str.charAt(i));
        }
    }
}