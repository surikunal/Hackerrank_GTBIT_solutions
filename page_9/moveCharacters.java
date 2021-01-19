import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        char ch = scn.next().charAt(0);
        int i = scn.nextInt();
        
        String ans = moveChar1(str, 0, ch);
        System.out.println(ans.charAt(i));
        moveChar2(str, ch, 0, "", "");
    }
    
    public static void moveChar2(String str, char ch, int i, String ans1, String ans2) {
        if (i == str.length()) {
            System.out.println(ans1 + ans2);
            return;
        }
        
        char ch1 = str.charAt(i);
        if (ch == ch1) {
            moveChar2(str, ch, i + 1, ans1, ans2 + ch1);
        } else {
            moveChar2(str, ch, i + 1, ans1 + ch1, ans2);
        }
    }
    
    public static String moveChar1(String str, int i, char ch) {
        if (i == str.length()) {
            return "";
        }
        
        char ch1 = str.charAt(i);
        String rec = moveChar1(str, i + 1, ch);
        if (ch1 != ch) {
            return ch1 + rec;
        } else {
            return rec + ch1;
        }
    }
}